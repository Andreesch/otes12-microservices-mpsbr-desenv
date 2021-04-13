package com.criasoft.processindicators.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.criasoft.processindicators.api.dto.CompanyResponseDto;
import com.criasoft.processindicators.domain.Company;
import com.criasoft.processindicators.repository.CompanyRepository;

public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    private CompanyResponseDto create(String companyName) {
        Company company = companyRepository.save(new Company().setName(companyName));

        return new CompanyResponseDto()
                .setId(company.getId())
                .setName(company.getName());
    }

    public Company findById(String id) {
        return companyRepository.findById(id)
                .orElseThrow();
    }
}
