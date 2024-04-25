package com.user.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.Dto.UserDto;
import com.user.Entities.User;
import com.user.Services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping
	public List<User> getUser(){
		return userService.getAllUsers();
	}
	
	@PostMapping
	public User addUser(@RequestBody UserDto userdto) {
		return userService.saveUser(userdto);
	}
}
