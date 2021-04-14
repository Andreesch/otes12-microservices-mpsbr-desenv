package com.criasoft.processcapacity.domain;

import java.util.Arrays;

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

    public static ScoreGrade findByScoreNumber(String scoreNumber){
        return Arrays.stream(values())
                .filter(value -> value.scoreNumber.equals(scoreNumber))
                .findFirst()
                .orElse(null);
    }
}
