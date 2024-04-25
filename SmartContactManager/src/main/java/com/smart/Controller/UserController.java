package com.smart.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smart.Dto.UserDto;
import com.smart.Entities.User;
import com.smart.Service.UserService;

@RestController
public class UserController {

	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public List<User> getUser() {
		return userService.getAllUsers();
	}
	
	@PostMapping("/user")
	public User addUser(@RequestBody UserDto userdto) {
		return userService.addUser(userdto);
	}
}
