package com.example.service;


import java.util.List;

import com.example.entities.EmployeeEntity;


public interface EmpService {

	public void saveEmployee(EmployeeEntity employeeEntity);

	public void deleteEmployee(Long id);

	public List<EmployeeEntity> fetchAll();

	public EmployeeEntity fetchById(Long id);

}
