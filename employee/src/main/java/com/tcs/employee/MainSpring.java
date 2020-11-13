package com.tcs.employee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcs.employee.config.DBConfig;
import com.tcs.employee.model.Employee;
import com.tcs.employee.service.EmployeeService;

public class MainSpring {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(DBConfig.class);
		
		EmployeeService employeeService = context.getBean(EmployeeService.class);
		
		Employee employee = new Employee(1, 7, 5, "Employee one", 19, "Developer");
		String result = employeeService.addEmployee(employee);
		
		System.out.println(result);
		
	}

}
