package com.criasoft.processindicators;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.criasoft.processindicators.api.controller.RestPath;

import io.restassured.RestAssured;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(locations = "classpath:application-test.properties")
public abstract class AbstractTestController {

    public static String API_V1;
    public static String COMPANY_RESOURCE;
    public static String PROCESS_AVALIATION_RESOURCE;
    public static String PROCESS_RESOURCE;

    @LocalServerPort
    public int randomPort;

    public void setup() throws Exception {
        RestAssured.port = randomPort;
        API_V1 = RestPath.BASE_PATH;
        COMPANY_RESOURCE = API_V1 + "/company";
        PROCESS_AVALIATION_RESOURCE= API_V1 + "/process-avaliation";
        PROCESS_RESOURCE = API_V1 + "/process";
    }
}
