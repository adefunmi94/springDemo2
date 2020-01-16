package com.springdemo.contoller.employee;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.employee.service.EmployeeService;
import com.springdemo.entities.Employee;

@RestController
public class EmployeeController {

	
	@Autowired
	private EmployeeService employeeServiceImpl;
	
	
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee tempEmployee ) {
		
		
		
		
		employeeServiceImpl.addEmployee(tempEmployee);
		
		return tempEmployee;
		
	}
	
	
	
}
