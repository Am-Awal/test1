package com.tcs.organization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcs.department.utils.DBUtils;
import com.tcs.organization.config.DBConfig;
import com.tcs.organization.model.Organization;
import com.tcs.organization.service.OrganizationService;

public class MainSpring {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
			new AnnotationConfigApplicationContext(DBConfig.class);
		
		OrganizationService organizationService = context.getBean(OrganizationService.class);
		
		//Organization organization = new Organization(7, "Org7", "7 Org Ave", null, null);
		 
		
		
	}

}
