/**
 * 
 */
package com.springboot.mongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther Unnati
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	private int id;
	private String name;
	private String address;
	

}
