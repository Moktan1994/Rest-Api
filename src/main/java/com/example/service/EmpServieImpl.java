package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmpRepository;
import com.example.entities.EmployeeEntity;
@Service
public class EmpServieImpl implements EmpService{

	@Autowired
	private EmpRepository repository;
	@Override
	public void saveEmployee(EmployeeEntity employeeEntity) {
		repository.save(employeeEntity);
		
	}

}
