package com.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.model.Employee;
import com.spring.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@ResponseBody
	@GetMapping
	public List<Employee> getAllEmployess() {
		return employeeService.fetchAllEmployees();
	}
	
	@ResponseBody
	@PostMapping
	public int addEmployee(@RequestBody List<Employee> employees) {
		return employeeService.addEmployee(employees);
	}
	
	@ResponseBody
	@DeleteMapping(value = "/{id}")
	public boolean deleteEmployee(@PathVariable("id") String empId) {
		System.out.println("Checking Delete id:"+empId);
		return employeeService.deleteEmployee(empId);
	}
	
	@ResponseBody
	@PutMapping(value="/{id}")
	public boolean updateEmployee(@PathVariable("id") String empId, @RequestParam("name") String empName) {
		System.out.println("Empname:"+empName);
		System.out.println("EmpId:"+empId);
		return employeeService.updateEmployee(empId, empName);
	}
	
}
