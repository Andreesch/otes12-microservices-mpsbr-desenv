package com.criasoft.processindicators.api.dto;

public class ProcessResponseDto {

    private String id;

    private String description;

    public String getId() {
        return id;
    }

    public ProcessResponseDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProcessResponseDto setDescription(String description) {
        this.description = description;
        return this;
    }
}
