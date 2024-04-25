package com.user.Services;

import java.util.List;

import com.user.Dto.UserDto;
import com.user.Entities.User;

public interface UserService {

	public User saveUser(UserDto userdto);
	
	public List<User> getAllUsers();
}
