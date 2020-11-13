package com.tcs.organization.service;

import java.util.List;
import java.util.Optional;

import com.tcs.department.model.Department;
import com.tcs.employee.model.Employee;
import com.tcs.organization.model.Organization;

public interface OrganizationService {
	

	public String addOrganization(Organization organization);
	public String updateOrganization(long id);
	public String deleteOrganization(long id);
	public Optional<Organization> findById(long id);
	public Optional<List<Employee>> getEmployees();
	public Optional<List<Department>> getDepartments();


}
