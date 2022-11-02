package com.mkj.gtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mkj.gtest.entity.AppUser;
import com.mkj.gtest.service.AppUserService;

@RestController
@RequestMapping("/facebook")
public class MyWebController {

	@Autowired
	AppUserService userService;
	
	
	
	public MyWebController() {
		System.out.println("\n\n\n====>> Inside Constructor "+this);
	}

	@PostMapping("/user")
	public String addUser(@RequestBody AppUser user) 
	{
		/*
		 * // request body annotation  , help u 
		 * to take user information as JSON , so it convert JSON object to AppIser Object
		 * */
		try {
			return userService.insertUser(user);
		} catch (Exception e) {
			return "Contact to customer care 1800-250-960 or mail us :- care@capg.com";
		}
	}
	
	

	@GetMapping("/welcome")
	public String abc()
	{
		return "Welcome to Facebook";
	}
	
	// http://localhost:8001/facebook/userandrole/ramesh
	@GetMapping("/user/{searchUsername}")
	public AppUser abc2(@PathVariable String searchUsername)throws Exception
	{
		return userService.getUserByUserName(searchUsername);
	}
	
	// http://localhost:8001/facebook/userandrole/ramesh?role=user
	@GetMapping("/userandrole/{searchUsername}")
	public AppUser abc3(@PathVariable String searchUsername,@RequestParam String role)throws Exception
	{
		if(role != null)
		{
			return userService.getUserByUserNameAndRole(searchUsername,role);
		}
		else return null;
		
	}
	
	
	
	
	
	@GetMapping("/users")
	public List<AppUser> getAllUsers()
	{
		// write some code to extract users
		try {
			List<AppUser>  allExtractedUsers = userService.getAllUsers();
			
			return allExtractedUsers;
			
		} catch (Exception e) {
			// code missing for expection handling 
			System.out.println(e);
			
		}
		
		return null;
	}
	
}




















