package com.criasoft.processindicators.domain;

public enum ScoreGrade {

    T("5"),
    L("4"),
    P("3"),
    N("2"),
    NA("0");

    public final String scoreNumber;

    ScoreGrade(String scoreNumber) {
        this.scoreNumber = scoreNumber;
    }

    public String getScoreNumber() {
        return scoreNumber;
    }
}
