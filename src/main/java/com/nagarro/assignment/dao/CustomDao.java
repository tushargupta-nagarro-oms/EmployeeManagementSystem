/*
* Interface name: CustomDao
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
* Description: Extends JPA repository for database operations.
*/
package com.nagarro.assignment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.assignment.model.Employee;

public interface CustomDao extends JpaRepository<Employee, Integer> {

	/**
	 * 
	 * @param managerId
	 * @return list of employee with given managerid.
	 */
	public List<Employee> findByManagerId(int managerId);

}
