package com.tcs.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.department.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
