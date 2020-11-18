package com.tcs.auth.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user_tbl")
public class User {

	 @Id
	 
	     @GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	     private Long id;
	 
	     private String firstName;
	 
	    private String lastName;
	 
	     private String mobile;
	 
	     private String email;
	     private String userName;
}
