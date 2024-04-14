/**
 * 
 */
package com.springboot.mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mongo.model.Employee;
import com.springboot.mongo.repository.EmployeeRepository;

/**
 * @auther Unnati
 */
@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveOrUpdate(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}

	public void delete(Employee emp) {
		 employeeRepository.delete(emp);
	}
}
