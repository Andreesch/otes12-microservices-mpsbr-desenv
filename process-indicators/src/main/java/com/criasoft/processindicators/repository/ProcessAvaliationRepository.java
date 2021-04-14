package com.criasoft.processindicators.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.criasoft.processindicators.domain.ProcessAvaliation;

@Repository
public interface ProcessAvaliationRepository extends JpaRepository<ProcessAvaliation, String> {

    List<ProcessAvaliation> findByCompanyId(String companyId);
}
