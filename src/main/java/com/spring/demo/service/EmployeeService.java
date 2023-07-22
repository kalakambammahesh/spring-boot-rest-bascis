package com.spring.demo.service;

import com.spring.demo.dao.EmployeeDAOImpl;
import com.spring.demo.model.Employee;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDAOImpl employeeDAOImpl;
	
	public List<Employee> fetchAllEmployees() {
		return employeeDAOImpl.getAllEmployees();
	}
	
	public int addEmployee(List<Employee> employees) {
		return employeeDAOImpl.addEmployee(employees);
	}
	
	public boolean deleteEmployee(String empId) {
		return employeeDAOImpl.deleteEmployee(empId);
	}
	
	public boolean updateEmployee(String empId, String empName) {
		return employeeDAOImpl.updateEmployee(empId, empName);
	}

}
