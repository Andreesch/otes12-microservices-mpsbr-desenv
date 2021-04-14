package com.criasoft.processindicators.services;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.criasoft.processindicators.api.dto.ProcessAvaliationCreateDto;
import com.criasoft.processindicators.api.dto.ProcessAvaliationResponseDto;
import com.criasoft.processindicators.api.dto.ProcessAvaliationSearchResponseDto;
import com.criasoft.processindicators.domain.Company;
import com.criasoft.processindicators.domain.Process;
import com.criasoft.processindicators.domain.ProcessAvaliation;
import com.criasoft.processindicators.domain.ScoreGrade;
import com.criasoft.processindicators.repository.ProcessAvaliationRepository;

@Service
public class ProcessAvaliationService {

    @Autowired
    private ProcessAvaliationRepository processAvaliationRepository;

    @Autowired
    private ProcessService processService;

    @Autowired
    private CompanyService companyService;

    public ProcessAvaliationResponseDto create(ProcessAvaliationCreateDto processAvaliationCreateDto) {
        Process relatedProcess = processService.findById(processAvaliationCreateDto.getProcessId());
        Company relatedCompany = companyService.findById(processAvaliationCreateDto.getCompanyId());

        ProcessAvaliation processAvaliation = processAvaliationRepository.save(build(relatedProcess, relatedCompany,
                processAvaliationCreateDto.getGrade()));

        return processAvaliation.toDto(processAvaliation);

    }

    private ProcessAvaliation build(Process relatedProcess, Company relatedCompany, ScoreGrade grade) {
        return new ProcessAvaliation()
                .setProcess(relatedProcess)
                .setCompany(relatedCompany)
                .setScoreGrade(grade)
                .setCreatedAt(LocalDate.now());
    }

    public List<ProcessAvaliationSearchResponseDto> findByCompanyId(String companyId) {
        List<ProcessAvaliation> processAvaliationList = processAvaliationRepository.findByCompanyId(companyId);

        return processAvaliationList.stream()
                .map(ProcessAvaliation::toSearchResponseDto)
                .collect(Collectors.toList());
    }
}
