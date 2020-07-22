package com.cognizant.springlearn.dao;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.Employee;
import com.cognizant.springlearn.SpringLearnApplication;
import com.cognizant.springlearn.service.exception.EmployeeNotFoundException;

public class EmployeeDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	static ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
	static ArrayList<Employee> EMPLOYEE_LIST = context.getBean("employeeList", java.util.ArrayList.class);

	public static void updateEmployee(Employee employee) throws EmployeeNotFoundException {

		Employee empList = EMPLOYEE_LIST.stream().filter(emp -> emp.getId() == employee.getId()).findAny()
				.orElseThrow(() -> new EmployeeNotFoundException());
		LOGGER.info("old Employee: " + empList.toString());
		LOGGER.info("updated Employee: " + employee.toString());
	}

	public static void deleteEmployee(Employee employee) throws EmployeeNotFoundException {

		Employee empList = EMPLOYEE_LIST.stream().filter(emp -> emp.getId() == employee.getId()).findAny()
				.orElseThrow(() -> new EmployeeNotFoundException());

		LOGGER.info("deleted Employee: " + empList.toString());

	}

	public static ArrayList<Employee> getAllEmployees() {
		return EMPLOYEE_LIST;
	}
}
