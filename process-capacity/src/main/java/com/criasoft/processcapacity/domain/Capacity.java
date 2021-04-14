package com.criasoft.processcapacity.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.criasoft.processcapacity.api.dto.CapacityResponseDto;
import com.criasoft.processcapacity.services.vo.CapacityVO;

@Entity
@Table(name = "CAPACITY")
public class Capacity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    @Column(name = "COMPANY_ID", nullable = false)
    private String companyId;

    @Enumerated(EnumType.STRING)
    @Column(name = "FINAL_SCORE", nullable = false)
    private ScoreGrade finalScore;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;


    public static CapacityResponseDto toDto(Capacity capacity) {
        return new CapacityResponseDto()
                .setId(capacity.getId())
                .setDescription(capacity.getDescription())
                .setFinalScore(capacity.getFinalScore());
    }

    public String getId() {
        return id;
    }

    public Capacity setId(String id) {
        this.id = id;
        return this;
    }

    public String getCompanyId() {
        return companyId;
    }

    public Capacity setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }

    public ScoreGrade getFinalScore() {
        return finalScore;
    }

    public Capacity setFinalScore(ScoreGrade finalScore) {
        this.finalScore = finalScore;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Capacity setDescription(String description) {
        this.description = description;
        return this;
    }
}
