package com.tcs.employee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcs.department.model.Department;
import com.tcs.department.service.DepartmentService;
import com.tcs.employee.config.DBConfig;
import com.tcs.employee.model.Employee;
import com.tcs.employee.service.EmployeeService;
import com.tcs.organization.model.Organization;
import com.tcs.organization.service.OrganizationService;

public class MainSpring {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(DBConfig.class);
		
		EmployeeService employeeService = context.getBean(EmployeeService.class);
		OrganizationService organizationService = context.getBean(OrganizationService.class);
		DepartmentService departmentService = context.getBean(DepartmentService.class);
		
		Organization org1 = new Organization(1, "Org one", "One Org Ave", null, null);
		Organization org2 = new Organization(2, "Org two", "Two Org Ave", null, null);
		Organization org3 = new Organization(3, "Org three", "Three Org Ave", null, null);
		//Organization org2 = new Organization(id, name, address, departments, employees)

		
		String result1 = organizationService.addOrganization(org1);
		String result2 = organizationService.addOrganization(org2);
		String result3 = organizationService.addOrganization(org3);
		
		Department dep1 = new Department(23, org1, "Dep 23", null);
		Department dep2 = new Department(33, org3, "Dep 33", null);
		Department dep3 = new Department(43, org3, "Dep 43", null);
		Department dep4 = new Department(13, org2, "Dep 13", null);
		//Department dep4 = new Department(id, Organization, name, employees);

		
		String result4 = departmentService.addDepartment(dep1);
		String result5 = departmentService.addDepartment(dep2);
		String result6 = departmentService.addDepartment(dep3);
		String result7 = departmentService.addDepartment(dep4);
		
		Employee emp1 = new Employee(3, org1, dep4, "Emp one", 23, "Analyst");
		Employee emp2 = new Employee(3, org2, dep4, "Emp two", 57, "Biologist");
		Employee emp3 = new Employee(3, org3, dep1, "Emp three", 18, "Chemist");
		Employee emp4 = new Employee(3, org1, dep3, "Emp four", 23, "Physicist");
		Employee emp5 = new Employee(3, org2, dep3, "Emp five", 37, "Computer Scientist");
		Employee emp6 = new Employee(3, org3, dep4, "Emp six", 34, "Mathematician");
		Employee emp7 = new Employee(3, org1, dep4, "Emp seven", 29, "Analyst");
		Employee emp8 = new Employee(3, org2, dep3, "Emp eight", 19, "Chemist");
		Employee emp9 = new Employee(3, org3, dep1, "Emp nine", 18, "Analyst");
		Employee emp10 = new Employee(3, org1, dep3, "Emp ten", 43, "Chemist");
		Employee emp11 = new Employee(3, org2, dep2, "Emp eleven", 23, "Analyst");
		Employee emp12 = new Employee(3, org3, dep2, "Emp twelve", 18, "Designer");
		Employee emp13 = new Employee(3, org1, dep1, "Emp thirteen", 21, "Engineer");
		Employee emp14 = new Employee(3, org2, dep1, "Emp fourteen", 29, "Engineer");
		Employee emp15 = new Employee(3, org3, dep2, "Emp fifteen", 27, "Engineer");
		Employee emp16 = new Employee(3, org1, dep3, "Emp sixteen", 21, "Analyst");
		Employee emp17 = new Employee(3, org2, dep1, "Emp seventeen", 27, "Engineer");
		Employee emp18 = new Employee(3, org3, dep2, "Emp eighteen", 53, "Engineer");
		Employee emp19 = new Employee(3, org1, dep3, "Emp nineteen", 43, "Engineer");
		Employee emp20 = new Employee(3, org1, dep4, "Emp twenty", 33, "Analyst");
		
		
		
		String result8 = employeeService.addEmployee(emp1);
		String result9 = employeeService.addEmployee(emp2);
		String result10 = employeeService.addEmployee(emp3);
		String result11 = employeeService.addEmployee(emp4);
		String result12 = employeeService.addEmployee(emp5);
		String result13 = employeeService.addEmployee(emp6);
		String result14 = employeeService.addEmployee(emp7);
		String result15 = employeeService.addEmployee(emp8);
		String result16 = employeeService.addEmployee(emp9);
		String result17 = employeeService.addEmployee(emp10);
		String result18 = employeeService.addEmployee(emp11);
		String result19 = employeeService.addEmployee(emp12);
		String result20 = employeeService.addEmployee(emp13);
		String result21 = employeeService.addEmployee(emp14);
		String result22 = employeeService.addEmployee(emp15);
		String result23 = employeeService.addEmployee(emp16);
		String result24 = employeeService.addEmployee(emp17);
		String result25 = employeeService.addEmployee(emp18);
		String result26 = employeeService.addEmployee(emp19);
		String result27 = employeeService.addEmployee(emp20);
		
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result8);
		System.out.println(result9);
		System.out.println(result10);
		System.out.println(result11);
		System.out.println(result12);
		System.out.println(result13);
		System.out.println(result14);
		System.out.println(result15);
		System.out.println(result16);
		System.out.println(result17);
		System.out.println(result18);
		System.out.println(result19);
		System.out.println(result20);
		System.out.println(result21);
		System.out.println(result22);
		System.out.println(result23);
		System.out.println(result24);
		System.out.println(result25);
		System.out.println(result26);
		System.out.println(result27);
		
	}

}
