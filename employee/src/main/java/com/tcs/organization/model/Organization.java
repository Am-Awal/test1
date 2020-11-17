package com.tcs.organization.model;


import com.tcs.employee.model.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.tcs.department.model.Department;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "organization_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Organization {
	
	@Id
	@Column(name = "org_id")
	private long id;
	@Column(name = "org_id")
	private String name;
	private String address;
	private List<Department> departments = new ArrayList<>();
	private List<Employee> employees = new ArrayList<>();

}
