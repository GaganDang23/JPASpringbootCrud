package com.webosmotic.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webosmotic.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	

}
