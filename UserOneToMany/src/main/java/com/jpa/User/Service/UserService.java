package com.jpa.User.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.User.Dto.PositionDto;
import com.jpa.User.Dto.UserDto;
import com.jpa.User.Entities.Position;
import com.jpa.User.Entities.User;
import com.jpa.User.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
    
	public UserDto addUser(UserDto userdto) {
		User user = new User();
		user.setName(userdto.getName());
		user.setAddress(userdto.getAddress());
		user.setGender(userdto.getGender());
		user.setMobno(userdto.getMobno());
		
		List<Position> positionList = new ArrayList<Position>();
		
		for(PositionDto obj: userdto.getPositions()) {
			
			Position position = new Position();
			position.setPost(obj.getPost());
			position.setUser(user);
			positionList.add(position);
		}
		user.setPositions(positionList);
		userRepository.save(user);
		return userdto;
	}
	
	public List<User> getAllUsers(){
		List<User> user = (List<User>) userRepository.findAll();
		return user;
	}
}
