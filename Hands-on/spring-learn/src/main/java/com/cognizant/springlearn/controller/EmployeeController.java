package com.cognizant.springlearn.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Employee;
import com.cognizant.springlearn.service.exception.EmployeeNotFoundException;
import com.cognizant.springlearn.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@PostMapping
	public void updateEmployee(@RequestBody @Valid Employee employee) throws EmployeeNotFoundException {

		employeeService.updateEmployee(employee);
	}

	@GetMapping
	public ArrayList<Employee> getAllEmployees() {

		return employeeService.getAllEmployees();
	}

	@DeleteMapping
	public void deleteEmployee(@RequestBody @Valid Employee employee) throws EmployeeNotFoundException {

		employeeService.deleteEmployee(employee);
	}

}
