/**
 * 
 */
package com.springboot.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.mongo.model.Employee;

/**
 * @auther Unnati
 */
public interface EmployeeRepository  extends MongoRepository<Employee, Integer>{
	
	

}
