package com.cognizant.springlearn.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Department;
import com.cognizant.springlearn.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@GetMapping
	public ArrayList<Department> getAllDepartments(){
		return DepartmentService.getAllDepartments();
	}
}
