package com.user.Service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.Dto.UserDto;
import com.user.Entities.User;
import com.user.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private ModelMapper modelMapper;
    

    public User addUser(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getById(int id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.orElse(null);
    }

    public User updateUser(int id, UserDto userDto) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setName(userDto.getName());
            user.setEmail(userDto.getEmail());
            // Set other fields as needed
            return userRepository.save(user);
        }
        return null; // or throw an exception
    }

   
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }

}
