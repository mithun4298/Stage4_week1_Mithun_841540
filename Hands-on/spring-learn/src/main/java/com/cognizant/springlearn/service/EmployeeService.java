package com.cognizant.springlearn.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


import com.cognizant.springlearn.Employee;
import com.cognizant.springlearn.SpringLearnApplication;
import com.cognizant.springlearn.dao.EmployeeDao;
import com.cognizant.springlearn.service.exception.EmployeeNotFoundException;

@Service
public class EmployeeService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	
	public void updateEmployee(Employee employee) throws EmployeeNotFoundException{
		EmployeeDao.updateEmployee(employee);
	}
	
	public void deleteEmployee(Employee employee) throws EmployeeNotFoundException{
		EmployeeDao.deleteEmployee(employee);
	}


	public ArrayList<Employee> getAllEmployees(){
		LOGGER.debug("inside servicec.getAllEmployees()");
		return EmployeeDao.getAllEmployees();
	}
}
