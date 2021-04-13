package com.criasoft.processindicators.api.dto;

public class CompanyResponseDto {

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public CompanyResponseDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CompanyResponseDto setName(String name) {
        this.name = name;
        return this;
    }
}
