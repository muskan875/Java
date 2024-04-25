package com.rating.MicroServices;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rating.Dto.UserDto;
import com.rating.Entities.Contact;
import com.rating.Entities.User;
import com.rating.Repository.UserRepository;

import ch.qos.logback.classic.Logger;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private RestTemplate restTemplate;
	
	private Logger logger = (Logger) LoggerFactory.getLogger(UserServiceImpl.class);
	@Override
	public User saveUser(UserDto userdto) {
		User user = modelMapper.map(userdto, User.class);
		
		List<Contact> userList = new ArrayList<>();
		for(Contact obj : userdto.getContacts()) {
			Contact contact = modelMapper.map(obj, Contact.class);
			contact.setUser(user);
			userList.add(contact);
		}
		user.setContacts(userList);
		User saveData = userRepository.save(user);
//		List contacts = this.restTemplate.getForObject("http://localhost:9002/contact/user", List.class);
//		user.setContacts(contacts);
		return saveData;
	}

	@Override
	public List<User> getUser() {
		List<User> users = userRepository.findAll();
		
		 HttpHeaders headers = new HttpHeaders();
	 
	    headers.setContentType(MediaType.APPLICATION_JSON);		   
		    HttpEntity<Object> entity = new HttpEntity<>(headers);
		    
		ResponseEntity<List> responseEntity = restTemplate.exchange("http://localhost:9002/contact/user", 
               HttpMethod.GET, entity, List.class);
	        
		 List al = responseEntity.getBody();
		
		 System.out.print(al);
		 
		
		
//	List forObject = restTemplate.getForObject("http://localhost:9002/contact/user", List.class);
//	logger.info("",forObject);
//	((UserDto) users).setContacts(forObject);
	
		return users;
	}
}
