package com.fisglobal.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisglobal.training.model.Employee;
import com.fisglobal.training.repository.EmployeeRepository;


public interface EmployeeService 
{
	public boolean saveEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);
	public boolean deleteEmployee(Integer id);
	public Employee getById(Integer id);
	public List<Employee> findAll();
	public boolean isValidEmployee(String username, String password);
	
	
}
