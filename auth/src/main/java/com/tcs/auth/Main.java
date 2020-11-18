package com.tcs.auth;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcs.auth.config.DBConfig;
import com.tcs.auth.model.Role;
import com.tcs.auth.model.User;
import com.tcs.auth.repository.RoleRepository;
import com.tcs.auth.service.UserService;


public class Main {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(DBConfig.class);
		
		
		RoleRepository roleRepository =context.getBean(RoleRepository.class);
		UserService userService = context.getBean(UserService.class);
		
		Set<Role> roles = new HashSet<>();
		Role role = new Role();
		role.setName("Developer");
		role.setDescription("java");
		
		Role role2 = new Role();
		role2.setName("AngularDeveloper");
		role2.setDescription("angular");
		
		roles.add(role);
		roles.add(role2);
		roleRepository.save(role);
		roleRepository.save(role2);
		
		User user = new User((long) 0, "abhi","chivate","123456789", "abhi@gmail.com","User_Abhi",roles);
		
		String result = userService.registerUser(user);
		
		System.out.println(result);		
		context.close();	
		
	}

}
