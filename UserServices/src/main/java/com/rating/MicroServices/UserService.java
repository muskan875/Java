package com.rating.MicroServices;

import java.util.List;

import com.rating.Dto.UserDto;
import com.rating.Entities.User;

public interface UserService {
	
    public User saveUser(UserDto userdto);
	public List<User> getUser();

}
