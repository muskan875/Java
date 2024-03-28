package com.jpa.User.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.User.Dto.UserDto;
import com.jpa.User.Entities.User;
import com.jpa.User.Service.UserService;

@RestController
public class UserController {
	
	@Autowired
	public UserService userService;
 
	@GetMapping("/users")
	public List<User> getUsers(){
		return userService.getAllUsers();
	}

	@PostMapping("/users")
	public UserDto saveUser(@RequestBody UserDto userdto) {
		return userService.addUser(userdto);
	}
}
