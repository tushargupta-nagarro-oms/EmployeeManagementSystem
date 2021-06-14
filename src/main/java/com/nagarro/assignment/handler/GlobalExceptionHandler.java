/*
 * Class name: GlobalExceptionHandler
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
 * Description: Exception handler class.
 */
package com.nagarro.assignment.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nagarro.assignment.exception.EmployeeNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<String> handelEmployeeNotFoundException(EmployeeNotFoundException exception) {
		ResponseEntity<String> responseEntity = new ResponseEntity<String>(exception.getMessage(),
				HttpStatus.BAD_REQUEST);
		return responseEntity;
	}

}
