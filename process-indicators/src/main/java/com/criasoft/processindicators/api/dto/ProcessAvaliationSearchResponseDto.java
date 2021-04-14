package com.criasoft.processindicators.api.dto;

import com.criasoft.processindicators.domain.ScoreGrade;

public class ProcessAvaliationSearchResponseDto {

    private String id;

    private ScoreGrade scoreGrade;

    private ProcessResponseDto process;

    public String getId() {
        return id;
    }

    public ProcessAvaliationSearchResponseDto setId(String id) {
        this.id = id;
        return this;
    }

    public ScoreGrade getScoreGrade() {
        return scoreGrade;
    }

    public ProcessAvaliationSearchResponseDto setScoreGrade(ScoreGrade scoreGrade) {
        this.scoreGrade = scoreGrade;
        return this;
    }

    public ProcessResponseDto getProcess() {
        return process;
    }

    public ProcessAvaliationSearchResponseDto setProcess(ProcessResponseDto process) {
        this.process = process;
        return this;
    }
}
