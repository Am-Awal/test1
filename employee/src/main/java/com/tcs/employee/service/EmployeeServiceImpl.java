package com.tcs.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.employee.dao.EmployeeRepository;
import com.tcs.employee.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepo;

	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.addEmployee(employee);
		
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
		return employeeRepo.findById(id);
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
