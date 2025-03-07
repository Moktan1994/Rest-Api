package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.EmployeeEntity;

@Repository
public interface EmpRepository extends JpaRepository<EmployeeEntity, Long>{

}
