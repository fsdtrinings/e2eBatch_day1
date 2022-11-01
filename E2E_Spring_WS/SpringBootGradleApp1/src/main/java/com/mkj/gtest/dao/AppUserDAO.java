package com.mkj.gtest.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mkj.gtest.entity.AppUser;

@Repository
public interface AppUserDAO {

	public List<AppUser> getAllUsers()throws Exception;
	public List<AppUser> getAllUsers(String role)throws Exception;
	public AppUser getUserByUserName(String username)throws Exception;
	public List<AppUser> getUsersConnections(String username)throws Exception;
	
	
	
}
