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

import com.criasoft.processindicators.api.dto.ProcessAvaliationCreateDto;
import com.criasoft.processindicators.api.dto.ProcessAvaliationResponseDto;
import com.criasoft.processindicators.api.dto.ProcessResponseDto;
import com.criasoft.processindicators.services.ProcessAvaliationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Avaliação")
@RestController("ProcessAvaliationController")
@RequestMapping(path = RestPath.BASE_PATH + "/process-avaliation")
public class ProcessAvaliationController {

    @Autowired
    private ProcessAvaliationService processAvaliationService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Avaliação de processo para empresa específica")
    @ApiResponses({
            @ApiResponse(code = 201, message = "Successful request with body content", response = ProcessAvaliationResponseDto.class),
    })
    public ProcessAvaliationResponseDto create(
            @ApiParam(value = "Descrição do processo", required = true) @RequestBody ProcessAvaliationCreateDto processAvaliationCreateDto) {
        return processAvaliationService.create(processAvaliationCreateDto);
    }
}
