/**
 * 
 */
package com.springboot.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mongo.model.Employee;
import com.springboot.mongo.service.EmployeeService;

/**
 * @auther Unnati
 */
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public ResponseEntity<Employee> saveOrUpdate(@RequestBody Employee employee){
		employeeService.saveOrUpdate(employee);
		return new ResponseEntity<Employee>(employee,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Employee>> findAll(){
		return new ResponseEntity<List<Employee>>(employeeService.findAll(),HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<String> delete(@RequestBody Employee emp){
		employeeService.delete(emp);
		return new ResponseEntity<String>("Record deleted", HttpStatus.OK);
	}
}
