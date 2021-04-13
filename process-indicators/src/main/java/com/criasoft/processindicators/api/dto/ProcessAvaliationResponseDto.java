package com.criasoft.processindicators.api.dto;

import com.criasoft.processindicators.domain.ScoreGrade;

public class ProcessAvaliationResponseDto {

    private String id;

    private ScoreGrade scoreGrade;

    public String getId() {
        return id;
    }

    public ProcessAvaliationResponseDto setId(String id) {
        this.id = id;
        return this;
    }

    public ScoreGrade getScoreGrade() {
        return scoreGrade;
    }

    public ProcessAvaliationResponseDto setScoreGrade(ScoreGrade scoreGrade) {
        this.scoreGrade = scoreGrade;
        return this;
    }
}
