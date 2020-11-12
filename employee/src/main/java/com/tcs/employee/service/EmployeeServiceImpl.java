package com.tcs.employee.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import com.tcs.employee.utils.DBUtils;
import com.tcs.employee.dao.EmployeeRepository;
import com.tcs.employee.dao.EmployeeRepositoryImpl;
import com.tcs.employee.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeServiceImpl() {
		
		// TODO Auto-generated constructor stub
}
private static EmployeeService employeeServ;

public static EmployeeService getInstance() {
	
	if(employeeServ==null) {
		employeeServ = new EmployeeServiceImpl();
		return employeeServ;
	}
	return employeeServ;	
	
}
EmployeeRepository employeeRepository = EmployeeRepositoryImpl.getInstance();

	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.addEmployee(employee);
		
	}

	@Override
	public String updateEmployee(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployee(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> findById(long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id);
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Employee>> findByOrganizationId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
