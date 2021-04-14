package com.criasoft.processcapacity.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.criasoft.processcapacity.services.vo.ProcessAvaliationSearchResponseVO;

@Repository
@FeignClient(name="process-indicators-service")
public interface ProcessIndicatorRestClient {

    @GetMapping(value="/api/v1/process-avaliation/{companyId}")
    List<ProcessAvaliationSearchResponseVO> getAvaliationsByCompanyId(@PathVariable("companyId") String companyId);
}
