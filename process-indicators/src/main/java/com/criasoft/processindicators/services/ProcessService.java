package com.criasoft.processindicators.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.criasoft.processindicators.api.dto.ProcessResponseDto;
import com.criasoft.processindicators.domain.Process;
import com.criasoft.processindicators.repository.ProcessRepository;

@Service
public class ProcessService {

    @Autowired
    private ProcessRepository processRepository;

    public ProcessResponseDto create(String description) {
        Process process = processRepository.save(new Process()
                .setDescription(description));

        return new ProcessResponseDto()
                .setId(process.getId())
                .setDescription(process.getDescription());
    }

    public Process findById(String id) {
        return processRepository.findById(id)
                .orElseThrow();
    }
}
