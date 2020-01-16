package com.springdemo.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.entities.Employee;
import com.springdemo.entities.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao employeeDaoImpl;
	
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDaoImpl.addEmployee(employee);
		
			
	}

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		List<Employee> theEmployees = employeeDaoImpl.getEmployees();
		
		return theEmployees ;
	}

	public Employee getEmployeesById(int employeeId) {
	
		return employeeDaoImpl.getEmployeeById(employeeId);
	}

	public void updateEmployee(Employee theEmployee) {
		
		employeeDaoImpl.updateEmployee(theEmployee);
		
	}

	public void deleteEmployee(Employee theEmployee) {
		// TODO Auto-generated method stub
		employeeDaoImpl.deleteEmployee(theEmployee);
		
	}

	
}
