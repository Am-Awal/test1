package com.tcs.organization.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.department.model.Department;
import com.tcs.employee.model.Employee;
import com.tcs.organization.dao.OrganizationRepository;
import com.tcs.organization.model.Organization;

@Service
public class OrganizationServiceImpl implements OrganizationService {
	

	@Autowired
	OrganizationRepository organizationRepo;



	@Override
	public String addOrganization(Organization organization) {
		// TODO Auto-generated method stub
		return organizationRepo.addOrganization(organization);
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
		return organizationRepo.findById(id);
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
