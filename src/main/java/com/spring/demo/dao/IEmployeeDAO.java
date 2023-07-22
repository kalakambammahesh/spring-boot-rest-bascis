package com.spring.demo.dao;

import com.spring.demo.model.Employee;
import java.util.List;

public interface IEmployeeDAO {
	public List<Employee> getAllEmployees(); 
	public int addEmployee(List<Employee> employees);
	public boolean deleteEmployee(String empId);
	public boolean updateEmployee(String empId, String empName);
}
