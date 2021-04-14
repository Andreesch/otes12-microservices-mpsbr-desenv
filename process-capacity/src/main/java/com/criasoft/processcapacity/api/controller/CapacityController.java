package com.criasoft.processcapacity.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.criasoft.processcapacity.api.dto.CapacityResponseDto;
import com.criasoft.processcapacity.services.CapacityService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Capacidade")
@RestController("ProcessAvaliationController")
@RequestMapping(path = RestPath.BASE_PATH + "/process-avaliation")
public class CapacityController {

    @Autowired
    private CapacityService capacityService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{companyId}")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successful request with body content", response = CapacityResponseDto.class),
    })
    @ApiOperation(value = "Buscar capacidade por empresa")
    public List<CapacityResponseDto> findByCode(@ApiParam(value = "Código da empresa", required = true) @PathVariable("companyId") String companyId) {
        return capacityService.build(companyId);
    }
}
