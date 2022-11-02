package com.mkj.gtest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mkj.gtest.entity.AppUser;

@Repository
public class AppUserDAOImpl implements AppUserDAO {

	@Autowired
	UserDatabase db;
	
	@Override
	public List<AppUser> getAllUsers() throws Exception {
		
		return db.getAllUsers();
	}

	@Override
	public List<AppUser> getAllUsers(String role) throws Exception {
		
		
		
		return null;
	}

	@Override
	public AppUser getUserByUserName(String username) throws Exception {
		List<AppUser> allUsers = getAllUsers();
		
		 AppUser user = allUsers.stream().filter((u)->{
			if(u.getUsername().equals(username))
			{
				return true;
			}
			else return false;
		}).findFirst().get();
		 
		return user;
	}

	
	@Override
	public String insertAppUser(AppUser user) throws Exception {
		 List<AppUser> list =   db.getAllUsers();
		 list.add(user);
		 db.setAllUsers(list); // adding the new user in the previous list
		 return "done";
	}
	
	

	@Override
	public AppUser getUserByUserNameAndRole(String username, String role) throws Exception {
		List<AppUser> allUsers = getAllUsers();
		
		 AppUser user = allUsers.stream().filter((u)->{
			if(u.getUsername().equals(username) && u.getRole().equals(role))
			{
				return true;
			}
			else return false;
		}).findFirst().get();
		 
		return user;
	}

	@Override
	public List<AppUser> getUsersConnections(String username) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
}
