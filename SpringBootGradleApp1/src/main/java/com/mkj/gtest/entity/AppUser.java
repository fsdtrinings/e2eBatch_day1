package com.mkj.gtest.entity;

import java.util.List;


import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class AppUser {

	private String username;
	private String password;
	private String role;  // admin , tech-user , customer , corporates 
	
	
	
	
	
	
}
