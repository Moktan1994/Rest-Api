package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<String> doDeletion(@PathVariable Long id) {
		empService.deleteEmployee(id);
		return new ResponseEntity<>("Employee deleted successfully",HttpStatus.OK);
		
	}
	@GetMapping("/employeesAll")
	public ResponseEntity<List<EmployeeEntity>> showAll() {
		List<EmployeeEntity> employeeEntity = empService.fetchAll();
		return new ResponseEntity<>(employeeEntity,HttpStatus.OK);
		
	}
	@GetMapping("/employees/{id}")
	public ResponseEntity<?> showById(@PathVariable Long id) {
		EmployeeEntity entity = empService.fetchById(id);
		if(entity!=null) {
		return new ResponseEntity<EmployeeEntity>(entity,HttpStatus.OK); 
		}
		return new ResponseEntity<String>("employee id not found",HttpStatus.NOT_FOUND);
		
	}

}
