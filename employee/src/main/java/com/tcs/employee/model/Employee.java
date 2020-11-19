package com.tcs.employee.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.tcs.department.model.Department;
import com.tcs.organization.model.Organization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "emloyee_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	@Id
	@Column(name = "emp_id")
	private long id;
	@Column(name = "org_id")
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "org_id")
	private Organization organization;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "dept_id")
	private Department department;
	
	@Column(name = "emp_name")
	private String name;
	private int age;
	private String position;
	
	

}
