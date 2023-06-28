package com.webosmotic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webosmotic.dao.EmployeeRepository;
import com.webosmotic.entity.Employee;


@Service
public class EmployeeService {
    @Autowired
	private EmployeeRepository employeeRepository;
    
    
    public List<Employee> getAllEmployee(){
    	ArrayList<Employee> emp = new ArrayList<Employee>();
    	 List<Employee> findAll = employeeRepository.findAll();
    	 System.out.println("check data"+emp.toString());
    	return findAll;
    }
    
    public Employee getEmployeeById(int empId) {
    	return employeeRepository.findById(empId).get();
    }
    
    public void saveEmployee(Employee employee) {
    	employeeRepository.save(employee);
    }
    
    
    public void deleteById(int empId) {
    	 employeeRepository.deleteById(empId);
    }
    
    public void updateEmployee(Employee employee) {
    	employeeRepository.save(employee);
    }


    
    
    
    
	
	
}
