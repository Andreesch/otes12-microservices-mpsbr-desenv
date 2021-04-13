package com.criasoft.processindicators.domain;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table
@Entity
public class Process {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    @Column(name = "GRADE", nullable = false)
    private String description;

    @OrderBy("id DESC")
    @OneToMany(mappedBy = "process", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<ProcessAvaliation> processAvaliationList;

    public String getId() {
        return id;
    }

    public Process setId(String id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Process setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<ProcessAvaliation> getProcessAvaliationList() {
        return processAvaliationList;
    }

    public Process setProcessAvaliationList(List<ProcessAvaliation> processAvaliationList) {
        this.processAvaliationList = processAvaliationList;
        return this;
    }
}
