package com.criasoft.processindicators.api;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.criasoft.processindicators.AbstractTestController;
import com.criasoft.processindicators.api.dto.CompanyResponseDto;

public class CompanyIT extends AbstractTestController {

    private static final String DEFAULT_COMPANY_NAME = "Cria-Soft";

    @Before
    public void setup() throws Exception {
        super.setup();
    }

    @Test
    public void create() throws Exception {
        CompanyResponseDto companyResponseDto = given()
                .header("Content-Type", "application/json")
                .pathParam("name", DEFAULT_COMPANY_NAME)
                .post(COMPANY_RESOURCE + "/{name}")
                .then()
                .statusCode(201)
                .extract()
                .as(CompanyResponseDto.class);

        assertNotNull(companyResponseDto.getId());
        assertEquals(DEFAULT_COMPANY_NAME, companyResponseDto.getName());
    }
}
