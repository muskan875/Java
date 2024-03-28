package com.jpa.admin.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.jpa.admin.Dto.UserDto;
import com.jpa.admin.Repository.UserRepository;

@Service
public class UserService {
 
	@Autowired
	private UserRepository userRepository;
	
	
	public UserDto addUser(UserDto userdto) {
		return userdto;
	}
	
	public List<com.jpa.admin.Entity.User> getAllUser(){
		List<com.jpa.admin.Entity.User> user = userRepository.findAll();
		return user;
	}
}