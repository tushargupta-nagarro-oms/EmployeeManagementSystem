/*
* Interface name: EmployeeDao
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
* Description: Interface for Database function basically for loose coupling.
*/
package com.nagarro.assignment.dao;

import java.util.List;

import com.nagarro.assignment.model.Employee;

public interface EmployeeDao {

	public Employee saveEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public Employee viewEmployee(int employeeId);

	public Employee deleteEmployee(int employeeId);
	//	public List<Employee> viewAllEmployee(int managerId);

	public List<Employee> viewEmployees();

	public List<Employee> showAllEmployee(int managerId);

}
