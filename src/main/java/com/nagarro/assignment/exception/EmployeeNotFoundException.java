/*
 * Class name: EmployeeNotFoundException
 *
 * Version info: JavaSE-11
 *
 * Copyright notice:
 * 
 * Author info: Tushar Gupta
 *
 * Creation date: 07/June/2021
 *
 * Last updated By: Tushar Gupta
 *
 * Last updated Date: 14/June/2021
 *
 * Description: The below class is exception class.
 */
package com.nagarro.assignment.exception;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends RuntimeException {

	public EmployeeNotFoundException() {

	}

	public EmployeeNotFoundException(String message) {
		super(message);
	}

}
