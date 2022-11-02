package com.mkj.gtest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mkj.gtest.entity.AppUser;

@Service
public interface AppUserService {
	public List<AppUser> getAllUsers()throws Exception;
	public List<AppUser> getAllUsers(String role)throws Exception;
	public AppUser getUserByUserName(String username)throws Exception;
	public List<AppUser> getUsersConnections(String username)throws Exception;
	public AppUser getUserByUserNameAndRole(String username,String role)throws Exception;
	
	public String insertUser(AppUser user)throws Exception;
}
