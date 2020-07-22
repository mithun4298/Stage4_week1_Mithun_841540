package com.cognizant.springlearn.dao;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.Department;

public class DepartmentDao {
	
	static ApplicationContext context = new ClassPathXmlApplicationContext("department.xml");
	static ArrayList<Department> DEPARTMENT_LIST = context.getBean("departmentList", java.util.ArrayList.class);

	public static ArrayList<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return DEPARTMENT_LIST;
	}

}
