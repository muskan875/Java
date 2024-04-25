package com.smart.Service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.Dto.UserDto;
import com.smart.Entities.User;
import com.smart.Repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public User addUser(UserDto userdto) {
		User user = modelMapper.map(userdto, User.class);
		return userRepository.save(user);
	}
	
	public List<User> getAllUsers(){
		List<User> user = userRepository.findAll();{
			return user;
			
		}
		}
}
