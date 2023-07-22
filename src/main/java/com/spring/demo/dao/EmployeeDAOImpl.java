package com.spring.demo.dao;

import com.spring.demo.model.Employee;
import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {
	
	List<Employee> allEmployeesList = new ArrayList<>();

	@Override
	public List<Employee> getAllEmployees() {
		return allEmployeesList;
	}

	@Override
	public int addEmployee(List<Employee> employees) {
		return allEmployeesList.addAll(employees)? 1 : 0;
	}

	@Override
	public boolean deleteEmployee(String empId) {
		Employee employee = null;
		for(Employee emp : allEmployeesList) {
			if(emp.getEmpId().equals(empId)) {
				employee = emp;
				break;
			}
		}
		if(null != employee) {
			return allEmployeesList.remove(employee);
		}
		return false;
	}

	@Override
	public boolean updateEmployee(String empId, String empName) {

		Employee employee = null;
		for(Employee emp : allEmployeesList) {
			if(emp.getEmpId().equals(empId)) {
				employee = emp;
				break;
			}
		}
		if(null != employee) {
			employee.setEmpName(empName);
			return true;
		}
		return false;
	
	}

}
