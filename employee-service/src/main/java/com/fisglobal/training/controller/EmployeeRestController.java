package com.fisglobal.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fisglobal.training.model.Employee;
import com.fisglobal.training.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController 
{
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable("id") Integer id)
	{
		return employeeService.getById(id);
		
	}
	@GetMapping("/employees")
	public List<Employee> getAllEmployee()
	{
		return employeeService.findAll();
				
	}
	
	@PostMapping("/employees")
	public boolean addEmployee(@RequestBody Employee employee)
	{
		employeeService.saveEmployee(employee);
		return true;
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		employeeService.updateEmployee(employee);
		return employee;
				
	}
	
	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable("id") Integer id)
	{
		employeeService.deleteEmployee(id);
		return "employee with id="+id+" deleted sucessfully";
	}
	
	@PostMapping("/employees/login")
	public String employeeLogin(@RequestBody Employee employee)
	{
		boolean validemployee=employeeService.isValidEmployee(employee.getUsername(), employee.getPassword());
		if(validemployee)
		{
			return "login sucessfully";
		}
		else return "does not matched incorrect username and password";
	}
	
	
	
}
