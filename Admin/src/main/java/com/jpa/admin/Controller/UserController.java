package com.jpa.admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.admin.Dto.UserDto;
import com.jpa.admin.Service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public List<com.jpa.admin.Entity.User> getUser(){
		return userService.getAllUser();
	}
	
	@PostMapping("/user")
	public UserDto saveUser(@RequestBody UserDto  userdto) {
		return userService.addUser(userdto);
	}

}
