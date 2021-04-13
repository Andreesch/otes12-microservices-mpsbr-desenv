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

import com.criasoft.processindicators.api.dto.ProcessCreateDto;
import com.criasoft.processindicators.api.dto.ProcessResponseDto;
import com.criasoft.processindicators.services.ProcessService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Processos")
@RestController("ProcessController")
@RequestMapping(path = RestPath.BASE_PATH + "/process")
public class ProcessControler {

    @Autowired
    private ProcessService processService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value="/{description}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Criação de processo")
    @ApiResponses({
            @ApiResponse(code = 201, message = "Successful request with body content", response = ProcessResponseDto.class),
    })
    public ProcessResponseDto create(
            @ApiParam(value = "Descrição do processo", required = true) @RequestBody ProcessCreateDto processCreateDto) {
        return processService.create(processCreateDto);
    }
}
