package com.tcs.department;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcs.department.config.DBConfig;
import com.tcs.department.model.Department;
import com.tcs.department.service.DepartmentService;

public class MainSpring {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(DBConfig.class);
		
		DepartmentService departmentService = context.getBean(DepartmentService.class);
		
		Department department = new Department(5, 7, "Department 5", null);
		String result = departmentService.addDepartment(department);
		
		System.out.println(result);
		
	}

}
