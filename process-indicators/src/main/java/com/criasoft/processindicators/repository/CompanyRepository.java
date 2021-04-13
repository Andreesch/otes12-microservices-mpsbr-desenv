package com.criasoft.processindicators.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.criasoft.processindicators.domain.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, String> {
}
