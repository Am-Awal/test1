package com.tcs.department.service;

import java.util.List;
import java.util.Optional;

import com.tcs.department.model.Department;
import com.tcs.employee.model.Employee;

public interface DepartmentService {
	
	public String addDepartment(Department department);
	public String updateDepartment(long id);
	public String deleteDepartment(long id);
	public Optional<Department> findById(long id);
	public Optional<List<Employee>> getEmployees();
	public Optional<List<Department>> findByOrganizationId(long id);

}
