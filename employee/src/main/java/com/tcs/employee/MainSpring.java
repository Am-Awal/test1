package com.tcs.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcs.employee.model.Department;
import com.tcs.employee.service.DepartmentService;
import com.tcs.employee.config.DBConfig;
import com.tcs.employee.model.Employee;
import com.tcs.employee.service.EmployeeService;
import com.tcs.employee.model.Organization;
import com.tcs.employee.service.OrganizationService;

public class MainSpring {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(DBConfig.class);
		
		EmployeeService employeeService = context.getBean(EmployeeService.class);
		OrganizationService organizationService = context.getBean(OrganizationService.class);
		DepartmentService departmentService = context.getBean(DepartmentService.class);
		
		//Organization org1 = new Organization(1, "Org one", "One Org Ave", null, null);
		Organization org1 = new Organization();
		org1.setId(1);org1.setName("Org One");org1.setAddress("One Org Ave");	
		
		//Organization org2 = new Organization(2, "Org two", "Two Org Ave", null, null);
		Organization org2 = new Organization();
		org2.setId(2);org2.setName("Org Two");org2.setAddress("Two Org Ave");
		
		//Organization org3 = new Organization(3, "Org three", "Three Org Ave", null, null);
		Organization org3 = new Organization();
		org3.setId(3);org3.setName("Org Three");org3.setAddress("Three Org Ave");
		
		//Organization org2 = new Organization(id, name, address, departments, employees)		

		
		Department dep1 = new Department(1, org1, "Dep 1", null);
		Department dep5 = new Department(5, org2, "Dep 5", null);
		Department dep9 = new Department(9, org3, "Dep 9", null);
		Department dep4 = new Department(4, org3, "Dep 4", null);
		List<Department> OrgOneDeps= new ArrayList<>();
		OrgOneDeps.add(dep1);OrgOneDeps.add(dep5);OrgOneDeps.add(dep9);OrgOneDeps.add(dep4);
		
		
		Department dep2 = new Department(2, org2, "Dep 2", null);
		Department dep6 = new Department(6, org2, "Dep 6", null);
		Department dep7 = new Department(7, org2, "Dep 7", null);
		Department dep8 = new Department(8, org2, "Dep 8", null);
		List<Department> OrgTwoDeps= new ArrayList<>();
		OrgTwoDeps.add(dep2);OrgTwoDeps.add(dep6);OrgTwoDeps.add(dep7);OrgTwoDeps.add(dep8);
		
		Department dep10 = new Department(10, org3, "Dep 10", null);
		Department dep11 = new Department(11, org3, "Dep 11", null);
		Department dep12 = new Department(12, org3, "Dep 12", null);
		Department dep3 = new Department(3, org3, "Dep 3", null);
		List<Department> OrgThreeDeps= new ArrayList<>();
		OrgThreeDeps.add(dep3);OrgThreeDeps.add(dep10);OrgThreeDeps.add(dep11);OrgThreeDeps.add(dep12);
		//Department dep4 = new Department(id, Organization, name, employees);
		

		
		String result4 = departmentService.addDepartment(dep1);
		String result5 = departmentService.addDepartment(dep2);
		String result6 = departmentService.addDepartment(dep3);
		String result7 = departmentService.addDepartment(dep4);
		String result41 = departmentService.addDepartment(dep5);
		String result51 = departmentService.addDepartment(dep6);
		String result61 = departmentService.addDepartment(dep7);
		String result71 = departmentService.addDepartment(dep8);
		String result42 = departmentService.addDepartment(dep9);
		String result52 = departmentService.addDepartment(dep10);
		String result62 = departmentService.addDepartment(dep11);
		String result72 = departmentService.addDepartment(dep12);
		
		//Employee emp1 = new Employee(3, org1, dep1, "Emp one", 23, "Analyst");
		Employee emp1 = new Employee(3, org1, dep1, "Emp one", 23, "Analyst");

		
		Employee emp2 = new Employee(2, org1, dep1, "Emp two", 57, "Biologist");
		Employee emp3 = new Employee(3, org1, dep1, "Emp three", 18, "Chemist");
		Employee emp4 = new Employee(4, org1, dep1, "Emp four", 23, "Physicist");
		List<Employee> DepOneEmps = new ArrayList<>();
		Employee myEmp = new Employee();myEmp.setId(21);myEmp.setName("Employee 21");myEmp.setAge(31);myEmp.setPosition("Engineer");
		DepOneEmps.add(myEmp);DepOneEmps.add(emp1);DepOneEmps.add(emp2);DepOneEmps.add(emp3);DepOneEmps.add(emp4);
		
		Employee emp5 = new Employee(5, org2, dep2, "Emp five", 37, "Computer Scientist");
		Employee emp6 = new Employee(6, org2, dep2, "Emp six", 34, "Mathematician");
		Employee emp7 = new Employee(7, org2, dep2, "Emp seven", 29, "Analyst");
		Employee emp8 = new Employee(8, org2, dep2, "Emp eight", 19, "Chemist");
		Employee emp9 = new Employee(9, org2, dep2, "Emp nine", 18, "Analyst");
		Employee emp10 = new Employee(10, org2, dep2, "Emp ten", 43, "Chemist");
		List<Employee> DepTwoEmps = new ArrayList<>();
		DepTwoEmps.add(emp5);DepTwoEmps.add(emp6);DepTwoEmps.add(emp7);DepTwoEmps.add(emp8);DepTwoEmps.add(emp9);
		
		Employee emp11 = new Employee(11, org3, dep3, "Emp eleven", 23, "Analyst");
		Employee emp12 = new Employee(12, org3, dep3, "Emp twelve", 18, "Designer");
		Employee emp13 = new Employee(13, org3, dep3, "Emp thirteen", 21, "Engineer");
		Employee emp14 = new Employee(14, org3, dep3, "Emp fourteen", 29, "Engineer");
		Employee emp15 = new Employee(15, org3, dep3, "Emp fifteen", 27, "Engineer");
		List<Employee> DepThreeEmps = new ArrayList<>();
		DepThreeEmps.add(emp11);DepThreeEmps.add(emp12);DepThreeEmps.add(emp13);DepThreeEmps.add(emp14);DepThreeEmps.add(emp15);
		
		Employee emp16 = new Employee(16, org1, dep4, "Emp sixteen", 21, "Analyst");
		Employee emp17 = new Employee(17, org1, dep4, "Emp seventeen", 27, "Engineer");
		Employee emp18 = new Employee(18, org1, dep4, "Emp eighteen", 53, "Engineer");
		Employee emp19 = new Employee(19, org1, dep4, "Emp nineteen", 43, "Engineer");
		Employee emp20 = new Employee(20, org1, dep4, "Emp twenty", 33, "Analyst");
		List<Employee> DepFourEmps = new ArrayList<>();
		DepFourEmps.add(emp16);DepFourEmps.add(emp17);DepFourEmps.add(emp18);DepFourEmps.add(emp19);DepFourEmps.add(emp20);
		
		dep1.setEmployees(DepOneEmps);
		dep2.setEmployees(DepTwoEmps);
		dep3.setEmployees(DepThreeEmps);
		dep4.setEmployees(DepFourEmps);
		org1.setDepartments(OrgOneDeps);
		org2.setDepartments(OrgTwoDeps);
		org3.setDepartments(OrgThreeDeps);
		
		
		
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
		
		
		
		String result1 = organizationService.addOrganization(org1);
		String result2 = organizationService.addOrganization(org2);
		String result3 = organizationService.addOrganization(org3);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result41);
		System.out.println(result51);
		System.out.println(result61);
		System.out.println(result71);
		System.out.println(result42);
		System.out.println(result52);
		System.out.println(result62);
		System.out.println(result72);
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
