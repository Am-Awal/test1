package com.tcs.department.service;

import java.util.List;
import java.util.Optional;

import com.tcs.department.dao.DepartmentRepository;
import com.tcs.department.dao.DepartmentRepositoryImpl;
import com.tcs.department.model.Department;
import com.tcs.employee.dao.EmployeeRepository;
import com.tcs.employee.dao.EmployeeRepositoryImpl;
import com.tcs.employee.model.Employee;
import com.tcs.employee.service.EmployeeService;
import com.tcs.employee.service.EmployeeServiceImpl;

public class DepartmentServiceImpl implements DepartmentService {
	
private DepartmentServiceImpl() {
		
		// TODO Auto-generated constructor stub
}
private static DepartmentService departmentServ;

public static DepartmentService getInstance() {
	
	if(departmentServ==null) {
		departmentServ = new DepartmentServiceImpl();
		return departmentServ;
	}
	return departmentServ;	
	
}
DepartmentRepository departmentRepository = DepartmentRepositoryImpl.getInstance();

	@Override
	public Optional<Department> findById(long id) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(id);
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
		return departmentRepository.addDepartment(department);
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
