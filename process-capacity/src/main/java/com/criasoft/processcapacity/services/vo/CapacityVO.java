package com.criasoft.processcapacity.services.vo;

import com.criasoft.processcapacity.domain.ScoreGrade;

public class CapacityVO {

    private String description;

    private String companyId;

    private ScoreGrade finalScore;

    public String getDescription() {
        return description;
    }

    public CapacityVO setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getCompanyId() {
        return companyId;
    }

    public CapacityVO setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }

    public ScoreGrade getFinalScore() {
        return finalScore;
    }

    public CapacityVO setFinalScore(ScoreGrade finalScore) {
        this.finalScore = finalScore;
        return this;
    }
}
