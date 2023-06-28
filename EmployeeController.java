package com.webosmotic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webosmotic.entity.Employee;
import com.webosmotic.service.EmployeeService;

@RestController
public class EmployeeController {
	
	
    @Autowired
	private EmployeeService employeeService;
    
    @GetMapping("/employee")
    private List<Employee> getAllEmployee(){
    	 List<Employee> list = employeeService.getAllEmployee();
    	 return list;
    }
    
    @GetMapping("/employee/{empId}")
    private Employee getEmployee(@PathVariable("empId") int empId) {
    	return employeeService.getEmployeeById(empId);
    }
    
    @DeleteMapping("/employees/{empId}")
    private void deleteEmployee(@PathVariable("empId") int empId) {
    	employeeService.deleteById(empId);
    }
    
    @PutMapping("/employee")
    private Employee updateEmployee(Employee employee) {
    	employeeService.updateEmployee(employee);
    	return employee;
    }
    
    @PostMapping("/employee")
    private void saveEmployee(@RequestBody Employee employee) {
    	employeeService.saveEmployee(employee);
    }
    
    
    
    
    
    
    
	
	
	
}
