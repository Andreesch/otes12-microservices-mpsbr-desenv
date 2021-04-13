package com.criasoft.processindicators.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.criasoft.processindicators.api.dto.CompanyResponseDto;
import com.criasoft.processindicators.services.CompanyService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Empresas")
@RestController("CompanyController")
@RequestMapping(path = RestPath.BASE_PATH + "/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value="/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Criação de empresa")
    @ApiResponses({
            @ApiResponse(code = 201, message = "Successful request with body content", response = CompanyResponseDto.class),
    })
    public CompanyResponseDto create(
            @ApiParam(value = "Nome da empresa", required = true) @PathVariable("name") String name) {
        return companyService.create(name);
    }
}
