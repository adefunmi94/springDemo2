/**
 * 
 */
package com.springdemo.employee.service;

import static org.junit.Assert.assertNotNull;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.springdemo.entities.Employee;
import com.springdemo.entities.dao.EmployeeDao;


/**
 * @adefunmi
 *
 */
@ContextConfiguration("classpath:/springDemo-service-context.xml")
@RunWith(SpringRunner.class)
public class EmployeeServiceImplTest {

	/**
	 * @throws java.lang.Exception
	 */
	
	@Mock
	private EmployeeService employeeService;
	
	@Before
	public void setUp() throws Exception {
		
		employeeService = mock(EmployeeService.class);
	}

	@Test
	public void employeeExistsTest() {
		assertNotNull(EmployeeService.class);
	}
	
	@Test
	public void addEmployeeTest() {
		
		
		Employee employee = new Employee("Peter","Brand","peter@gmail.com");
		
		doNothing().when(employeeService).addEmployee(isA(Employee.class));
		employeeService.addEmployee(employee);
		
		verify(employeeService, times(1)).addEmployee(employee);
	}
	@Test
	public void getEmployeesTest() {
	
		when(employeeService.getEmployees()).thenReturn(new ArrayList<Employee>());
		employeeService.getEmployees();
		
		verify(employeeService, times(1)).getEmployees();
	}
	@Test
	public void getEmployeeByIdTest() {
		when(employeeService.getEmployeesById(1)).thenReturn(isA(Employee.class));
		
		employeeService.getEmployeesById(1);
		
		verify(employeeService, times(1)).getEmployeesById(1);		
		}
	
	@Test
	public void updateEmployee() {
		Employee myEmployee = new Employee();
				doNothing().when(employeeService).updateEmployee(isA(Employee.class));
		
		employeeService.updateEmployee(myEmployee);
		verify(employeeService, times(1)).updateEmployee(myEmployee);
	}
	@Test
	public void deleteEmployeeTest() {
		Employee employee = new Employee("Adejoke","oyewale","adejoke@gmail.com");
		doNothing().when(employeeService).deleteEmployee(isA(Employee.class));
		employeeService.deleteEmployee(employee);
	}
}
