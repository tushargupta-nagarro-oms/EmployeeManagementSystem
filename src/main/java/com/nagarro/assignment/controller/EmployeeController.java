/*
* Class name: EmployeeController
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
* Description: Rest Controller for REST API CRUD operations.
*/
package com.nagarro.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.assignment.model.Employee;
import com.nagarro.assignment.service.EmployeeService;

@RestController
@RequestMapping(value = "/ems")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	/**
	 * Add employee to database.
	 * 
	 * @param employee
	 * @return ResponseEntity, that contains saved employee details with HttpStatus.
	 */
	@PostMapping(value = "/addemployee")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
		Employee addedEmployee = employeeService.addEmployee(employee);
		ResponseEntity<Employee> responseEntity = new ResponseEntity<Employee>(addedEmployee, HttpStatus.OK);
		return responseEntity;
	}

	/**
	 * Update employee in database.
	 * 
	 * @param employee
	 * @return ResponseEntity, that contains updated employee details with
	 *         HttpStatus.
	 */
	@PostMapping(value = "/editemployee")
	public ResponseEntity<Employee> editEmployee(@RequestBody Employee employee) {
		Employee editedEmployee = employeeService.editEmployee(employee);
		ResponseEntity<Employee> responseEntity = new ResponseEntity<Employee>(editedEmployee, HttpStatus.OK);
		return responseEntity;
	}

	/**
	 * Get the List of employee associated with particular manager id.
	 * 
	 * @param managerId
	 * @return ResponseEntity, List of employee with given manager id with
	 *         HttpStatus.
	 */
	@GetMapping(value = "/showallemployee/{managerId}")
	public ResponseEntity<List<Employee>> showAllEmployees(@PathVariable("managerId") int managerId) {
		List<Employee> allEmployee = employeeService.showAllEmployee(managerId);
		ResponseEntity<List<Employee>> responseEntity = new ResponseEntity<List<Employee>>(allEmployee, HttpStatus.OK);
		return responseEntity;
	}

	/**
	 * Get the employee associated with particular employee id.
	 * @param employeeId
	 * @return ResponseEntity, employee with given employee id with HttpStatus.
	 */
	 @GetMapping(value = "/showemployee/{employeeId}")
	 public ResponseEntity<Employee> showEmployee(@PathVariable("employeeId") int
	 employeeId) {
	 Employee employeeDetails = employeeService.showEmployee(employeeId);
	 ResponseEntity<Employee> responseEntity = new
	 ResponseEntity<Employee>(employeeDetails, HttpStatus.OK);
	 return responseEntity;
	 }

	 /**
	  * Get the List of employees in database.
	  * @return ResponseEntity, List of all employees.
	  */
	 @GetMapping(value = "/showallemployee")
	 public ResponseEntity<List<Employee>> showAllEmployee(){
	 List<Employee> employees = employeeService.showEmployees();
	 ResponseEntity<List<Employee>> responseEntity=new
	 ResponseEntity<List<Employee>>(employees,HttpStatus.OK);
	 return responseEntity;
	 }

	 /**
	  * delete the employee with given employee id
	  * @param employeeId
	  * @return ResponseEntity, deleted employee with given employee id with HttpStatus.
	  */
	 @DeleteMapping(value = "/deleteemployee/{employeeid}")
	 public ResponseEntity<Employee> deleteEmployee(@PathVariable("employeeid")
	 int employeeId) {
	 Employee removedEmployee = employeeService.removeEmployee(employeeId);
	 ResponseEntity<Employee> responseEntity = new
	 ResponseEntity<Employee>(removedEmployee, HttpStatus.OK);
	 return responseEntity;
	 }

}
