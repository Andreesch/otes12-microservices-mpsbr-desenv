package com.criasoft.processindicators.api.dto;

import com.criasoft.processindicators.domain.ScoreGrade;

public class ProcessAvaliationCreateDto {

    private String processId;

    private String companyId;

    private ScoreGrade grade;

    public String getProcessId() {
        return processId;
    }

    public ProcessAvaliationCreateDto setProcessId(String processId) {
        this.processId = processId;
        return this;
    }

    public String getCompanyId() {
        return companyId;
    }

    public ProcessAvaliationCreateDto setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }

    public ScoreGrade getGrade() {
        return grade;
    }

    public ProcessAvaliationCreateDto setGrade(ScoreGrade grade) {
        this.grade = grade;
        return this;
    }
}
