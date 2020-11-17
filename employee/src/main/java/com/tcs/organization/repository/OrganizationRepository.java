package com.tcs.organization.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.organization.model.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {

}
