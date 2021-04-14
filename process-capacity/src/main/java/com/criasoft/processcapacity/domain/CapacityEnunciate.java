package com.criasoft.processcapacity.domain;

public enum CapacityEnunciate {

    DEFINED_RESULTS("O processo produz os resultados definidos"),
    EXECUTION_PLANNED_MONITORE("A execução do processo é planejada e monitorada"),
    PEOPLE_CAPACITY("As pessoas estão preparadas para executar suas responsabilidades no processo");

    public String enunciate;

    CapacityEnunciate(String enunciate) {
        this.enunciate = enunciate;
    }
}
