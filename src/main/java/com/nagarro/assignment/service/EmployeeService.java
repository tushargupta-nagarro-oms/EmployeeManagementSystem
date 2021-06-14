/*
 * Interface name: EmployeeService
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
 * Description: Employee service interface this is basically for loose coupling.
 */
package com.nagarro.assignment.service;

import java.util.List;

import com.nagarro.assignment.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public Employee editEmployee(Employee employee);

	public Employee showEmployee(int employeeId);

	public Employee removeEmployee(int employeeID);

	public List<Employee> showAllEmployee(int managerId);

	public List<Employee> showEmployees();

}
