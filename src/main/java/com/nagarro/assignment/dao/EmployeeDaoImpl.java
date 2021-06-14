/*
 * Class name: EmployeeDaoImpl
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
 * Description: Implementation class for EmployeeDao.
 */
package com.nagarro.assignment.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nagarro.assignment.exception.EmployeeNotFoundException;
import com.nagarro.assignment.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	CustomDao customDao;

	/**
	 * Save and return the employee details in database.
	 */
	@Override
	public Employee saveEmployee(Employee employee) {
		Employee employeeDetails = customDao.save(employee);
		return employeeDetails;
	}

	/**
	 * Update and return the employee details in database
	 */
	@Override
	public Employee updateEmployee(Employee employee) {
		int employeeId = employee.getEmployeeId();
		Employee employeeDetails = this.viewEmployee(employeeId);
		employeeDetails = customDao.save(employee);
		return employeeDetails;
	}

	/**
	 * return the employee with given employeeid.
	 */
	@Override
	public Employee viewEmployee(int employeeId) {
		Employee employeeDetails = customDao.findById(employeeId).get();
		if (employeeDetails == null) {
			throw new EmployeeNotFoundException("Employee with EmployeeId " + employeeId + " does not exist");
		}
		return employeeDetails;
	}

	/**
	 * delete and return the employee deleted.
	 */
	@Override
	public Employee deleteEmployee(int employeeId) {
		Employee employeeDetails = this.viewEmployee(employeeId);
		customDao.deleteById(employeeId);
		return employeeDetails;
	}

	/**
	 * return the list of all employee in database.
	 */
	@Override
	public List<Employee> viewEmployees() {
		List<Employee> employees = customDao.findAll();
		return employees;
	}

	/**
	 * retuns the list of employee with given managerid.
	 */
	@Override
	public List<Employee> showAllEmployee(int managerId) {
		List<Employee> findByManagerId = customDao.findByManagerId(managerId);
		return findByManagerId;
	}

	// @Override
	// public List<Employee> viewAllEmployee(int managerId) {
	// List<Employee> allEmployees = customDao.getAllEmployees(managerId);
	// return allEmployees;
	// }

}
