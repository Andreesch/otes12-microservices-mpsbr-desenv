package com.criasoft.processindicators.api.dto;

import com.criasoft.processindicators.domain.ProcessType;

public class ProcessCreateDto {

    private String description;

    private ProcessType processType;

    public String getDescription() {
        return description;
    }

    public ProcessCreateDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public ProcessType getProcessType() {
        return processType;
    }

    public ProcessCreateDto setProcessType(ProcessType processType) {
        this.processType = processType;
        return this;
    }
}
