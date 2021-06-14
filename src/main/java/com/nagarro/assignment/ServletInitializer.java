/*
* Class name: ServletInitializer
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
* Description: Servlet Initializer class.
*/
package com.nagarro.assignment;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(EmployeeManagementSystemApplication.class);
	}

}
