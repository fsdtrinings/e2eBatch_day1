package com.mkj.gtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkj.gtest.dao.AppUserDAO;
import com.mkj.gtest.entity.AppUser;
import com.mkj.gtest.repository.AppUserRepository;


@Service
public class AppUserServiceImpl implements AppUserService{

	
	@Autowired
	AppUserRepository userRepository;
	
	@Override
	public String insertUser(AppUser user) throws Exception {
		AppUser savedUser =  userRepository.save(user);  // Note :  save() is already implemented by Spring Data JPA
		if(savedUser != null)
		{
			return "App User Saved "+savedUser.getUserId()+" username :- "+savedUser.getUsername();
		}
		else return null;
	}

	@Override
	public List<AppUser> getAllUsers() throws Exception {
		
		// may contains other code like security , loggging , validation 
		
		List<AppUser> allUsers =  userRepository.findAll(); // Note : same as save
		return allUsers;
	}

	@Override
	public List<AppUser> getAllUsers(String role) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppUser getUserByUserName(String username) throws Exception {
		// validation , security 
		
		//return userRepository.getUserByUserName(username);
		return null;
	}
	
	@Override
	public AppUser getUserByUserNameAndRole(String username, String role) throws Exception {
		//return userRepository.getUserByUserNameAndRole(username, role);
		return null;
	}

	@Override
	public List<AppUser> getUsersConnections(String username) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
}
