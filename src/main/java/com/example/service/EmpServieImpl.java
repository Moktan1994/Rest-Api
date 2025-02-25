package com.example.service;

import java.util.List;
import java.util.Optional;

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
	@Override
	public void deleteEmployee(Long id) {
		repository.deleteById(id);
		
	}
	@Override
	public List<EmployeeEntity> fetchAll() {
		List<EmployeeEntity> listEmployee = repository.findAll();
		return listEmployee;
	}
	@Override
	public EmployeeEntity fetchById(Long id) {
	Optional<EmployeeEntity> optionalEntity = repository.findById(id);
	if(optionalEntity.isPresent()) {
		EmployeeEntity entity = optionalEntity.get();
		return entity;
	}
	return null;
	
	}

}
