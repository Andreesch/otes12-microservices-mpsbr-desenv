package com.criasoft.processindicators.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.criasoft.processindicators.api.dto.ProcessAvaliationResponseDto;

@Entity
@Table(name="PROCESS_AVALIATION")
public class ProcessAvaliation {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    @Column(name = "GRADE", nullable = false)
    private ScoreGrade scoreGrade;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_ID", referencedColumnName = "ID", nullable = false)
    private Company company;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "PROCESS_ID", referencedColumnName = "ID", nullable = false)
    private Process process;

    @Column(name = "CREATED_AT", nullable = false)
    private LocalDate createdAt;

    public ProcessAvaliationResponseDto toDto(ProcessAvaliation processAvaliation) {
        return new ProcessAvaliationResponseDto()
                .setId(processAvaliation.getId())
                .setScoreGrade(processAvaliation.getScoreGrade());
    }

    public String getId() {
        return id;
    }

    public ProcessAvaliation setId(String id) {
        this.id = id;
        return this;
    }

    public ScoreGrade getScoreGrade() {
        return scoreGrade;
    }

    public ProcessAvaliation setScoreGrade(ScoreGrade scoreGrade) {
        this.scoreGrade = scoreGrade;
        return this;
    }

    public Company getCompany() {
        return company;
    }

    public ProcessAvaliation setCompany(Company company) {
        this.company = company;
        return this;
    }

    public Process getProcess() {
        return process;
    }

    public ProcessAvaliation setProcess(Process process) {
        this.process = process;
        return this;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public ProcessAvaliation setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
