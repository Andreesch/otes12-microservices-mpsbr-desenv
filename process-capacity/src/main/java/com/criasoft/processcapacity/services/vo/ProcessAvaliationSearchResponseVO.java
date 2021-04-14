package com.criasoft.processcapacity.services.vo;

import com.criasoft.processcapacity.domain.ScoreGrade;

public class ProcessAvaliationSearchResponseVO {

    private String id;

    private ScoreGrade scoreGrade;

    private ProcessVO process;

    public String getId() {
        return id;
    }

    public ProcessAvaliationSearchResponseVO setId(String id) {
        this.id = id;
        return this;
    }

    public ScoreGrade getScoreGrade() {
        return scoreGrade;
    }

    public ProcessAvaliationSearchResponseVO setScoreGrade(ScoreGrade scoreGrade) {
        this.scoreGrade = scoreGrade;
        return this;
    }

    public ProcessVO getProcess() {
        return process;
    }

    public ProcessAvaliationSearchResponseVO setProcess(ProcessVO process) {
        this.process = process;
        return this;
    }
}
