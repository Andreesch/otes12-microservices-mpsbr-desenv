package com.criasoft.processcapacity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.criasoft.processcapacity.domain.Capacity;

@Repository
public interface CapacityRepository extends JpaRepository<Capacity, String> {
}
