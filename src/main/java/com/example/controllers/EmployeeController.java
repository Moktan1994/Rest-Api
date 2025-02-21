package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.EmployeeEntity;
import com.example.service.EmpService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmpService empService;
	
	@PostMapping("/employees")
	public ResponseEntity<String> doRegister(@RequestBody EmployeeEntity employeeEntity) {
		empService.saveEmployee(employeeEntity);
		return new ResponseEntity<>("register successfully",HttpStatus.OK);
		
	}

}
