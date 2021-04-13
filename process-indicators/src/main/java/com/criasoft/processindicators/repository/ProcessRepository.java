package com.criasoft.processindicators.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.criasoft.processindicators.domain.Process;

@Repository
public interface ProcessRepository extends JpaRepository<Process, String> {
}
