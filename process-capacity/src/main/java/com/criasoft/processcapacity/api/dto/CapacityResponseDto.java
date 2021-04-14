package com.criasoft.processcapacity.api.dto;

import com.criasoft.processcapacity.domain.ScoreGrade;

public class CapacityResponseDto {

    private String id;

    private ScoreGrade finalScore;

    private String description;

    public String getId() {
        return id;
    }

    public CapacityResponseDto setId(String id) {
        this.id = id;
        return this;
    }

    public ScoreGrade getFinalScore() {
        return finalScore;
    }

    public CapacityResponseDto setFinalScore(ScoreGrade finalScore) {
        this.finalScore = finalScore;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CapacityResponseDto setDescription(String description) {
        this.description = description;
        return this;
    }
}
