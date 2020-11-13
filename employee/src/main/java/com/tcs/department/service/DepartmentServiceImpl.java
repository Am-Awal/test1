package com.tcs.department.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.department.dao.DepartmentRepository;
import com.tcs.department.dao.DepartmentRepositoryImpl;
import com.tcs.department.model.Department;
import com.tcs.employee.dao.EmployeeRepository;
import com.tcs.employee.dao.EmployeeRepositoryImpl;
import com.tcs.employee.model.Employee;
import com.tcs.employee.service.EmployeeService;
import com.tcs.employee.service.EmployeeServiceImpl;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepo;
	

	@Override
	public Optional<Department> findById(long id) {
		// TODO Auto-generated method stub
		return departmentRepo.findById(id);
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Department>> findByOrganizationId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepo.addDepartment(department);
	}

	@Override
	public String updateDepartment(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteDepartment(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
