/*
 * Class name: EmployeeServiceImpl
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
 * Description: Employee service implementation class.
 */
package com.nagarro.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.assignment.dao.CustomDao;
import com.nagarro.assignment.dao.EmployeeDao;
import com.nagarro.assignment.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	@Autowired
	CustomDao customDao;

	/**
	 * save employee in database
	 */
	@Override
	public Employee addEmployee(Employee employee) {
		Employee savedEmployee = employeeDao.saveEmployee(employee);
		return savedEmployee;

	}

	/**
	 * update the employee details.
	 */
	@Override
	public Employee editEmployee(Employee employee) {
		Employee updatedEmployee = employeeDao.updateEmployee(employee);
		return updatedEmployee;
	}

	/**
	 * show employee with given employee id
	 */
	@Override
	public Employee showEmployee(int employeeId) {
		Employee viewEmployee = employeeDao.viewEmployee(employeeId);
		return viewEmployee;

	}

	/**
	 * delete employee from database.
	 */
	@Override
	public Employee removeEmployee(int employeeId) {
		Employee deletedEmployee = employeeDao.deleteEmployee(employeeId);
		return deletedEmployee;
	}

	/**
	 * list of all employee in database
	 */
	@Override
	public List<Employee> showEmployees() {
		List<Employee> employees = employeeDao.viewEmployees();
		return employees;
	}

	/**
	 * list of all employee with given manager id.
	 */
	@Override
	public List<Employee> showAllEmployee(int managerId) {
		List<Employee> allEmployee = employeeDao.showAllEmployee(managerId);
		return allEmployee;
	}

}
