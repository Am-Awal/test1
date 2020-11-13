package com.tcs.organization.service;

import java.util.List;
import java.util.Optional;

import com.tcs.department.model.Department;
import com.tcs.employee.dao.EmployeeRepository;
import com.tcs.employee.dao.EmployeeRepositoryImpl;
import com.tcs.employee.model.Employee;
import com.tcs.employee.service.EmployeeService;
import com.tcs.employee.service.EmployeeServiceImpl;
import com.tcs.organization.dao.OrganizationRepository;
import com.tcs.organization.dao.OrganizationRepositoryImpl;
import com.tcs.organization.model.Organization;

public class OrganizationServiceImpl implements OrganizationService {
	

	private OrganizationServiceImpl() {
		
		// TODO Auto-generated constructor stub
}
private static OrganizationService organizationServ;

public static OrganizationService getInstance() {
	
	if(organizationServ==null) {
		organizationServ = new OrganizationServiceImpl();
		return organizationServ;
	}
	return organizationServ;	
	
}
OrganizationRepository oraganizationRepository = OrganizationRepositoryImpl.getInstance();



	@Override
	public String addOrganization(Organization organization) {
		// TODO Auto-generated method stub
		return oraganizationRepository.addOrganization(organization);
	}

	@Override
	public String updateOrganization(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteOrganization(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Organization> findById(long id) {
		// TODO Auto-generated method stub
		return oraganizationRepository.findById(id);
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Department>> getDepartments() {
		// TODO Auto-generated method stub
		return null;
	}

}
