package com.rating.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rating.Dto.UserDto;
import com.rating.Entities.User;
import com.rating.MicroServices.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired 
	private UserService userService;
	

	@GetMapping
	public List<User> getAllUser(){
		return userService.getUser();
	}
	
	@PostMapping
	public User addUser(@RequestBody UserDto userdto) {
		return userService.saveUser(userdto);
	}
}
