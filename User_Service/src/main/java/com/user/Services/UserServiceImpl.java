package com.user.Services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.Dto.UserDto;
import com.user.Entities.Rating;
import com.user.Entities.User;
import com.user.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private RestTemplate restTemplate;
	
	// exchange()

	@Override
	public User saveUser(UserDto userdto) {		
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		 HttpEntity<UserDto> entity = new HttpEntity<>(userdto, header);
		 ResponseEntity<String> responseEntity = restTemplate.exchange("http://localhost:8002/rating", HttpMethod.POST, entity, String.class);	    	

		 User user = modelMapper.map(userdto, User.class);
		
		List<Rating> ratingList = new ArrayList<>();
		
		for(Rating obj : userdto.getRatings()) {
			Rating rating = modelMapper.map(obj, Rating.class);
			rating.setUser(user);
			ratingList.add(rating);
		}	
		user.setRatings(ratingList);
		return userRepository.save(user);
}

	@Override
	public List<User> getAllUsers() {
		List<User> user = userRepository.findAll();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<Object> entity = new HttpEntity<Object>(headers);
		ResponseEntity<List> responseEntity = restTemplate.exchange("http://localhost:8002/rating", HttpMethod.GET, entity, List.class);
		responseEntity.getBody();
		responseEntity.getHeaders();
		responseEntity.getStatusCode();
		return user;
	}
	
	
	//   get/postForEntity
	
//	@Override
//	public User saveUser(UserDto userdto) {
//		
//		HttpHeaders header = new HttpHeaders();
//		header.setContentType(MediaType.APPLICATION_JSON);
//		 
//		 ResponseEntity<User> responseEntity = restTemplate.postForEntity("http://localhost:8002/rating", userdto, User.class);	    	
//
//		 User user = modelMapper.map(userdto, User.class);
//		
//		List<Rating> ratingList = new ArrayList<>();
//		
//		for(Rating obj : userdto.getRatings()) {
//			Rating rating = modelMapper.map(obj, Rating.class);
//			rating.setUser(user);
//			ratingList.add(rating);
//		}	
//		user.setRatings(ratingList);
//		return userRepository.save(user);
//	}
//	
//	
//	@Override
//	public List<User> getAllUsers() {
//		List<User> user = userRepository.findAll();
//		
//		HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(MediaType.APPLICATION_JSON);
//		
//		ResponseEntity<List> responseEntity = restTemplate.getForEntity("http://localhost:8002/rating", List.class);
//		responseEntity.getBody();
//		responseEntity.getHeaders();
//		responseEntity.getStatusCode();
//		return user;
//	}

	
	//  get/postforObject
	
//	@Override
//	public User saveUser(UserDto userdto) {
//		
//		HttpHeaders header = new HttpHeaders();
//		header.setContentType(MediaType.APPLICATION_JSON);
//		 
//		 User responseEntity = restTemplate.postForObject("http://localhost:8002/rating", userdto, User.class);	    	
//
//		 User user = modelMapper.map(userdto, User.class);
//		
//		List<Rating> ratingList = new ArrayList<>();
//		
//		for(Rating obj : userdto.getRatings()) {
//			Rating rating = modelMapper.map(obj, Rating.class);
//			rating.setUser(user);
//			ratingList.add(rating);
//		}	
//		user.setRatings(ratingList);
//		return userRepository.save(user);
//	}
//	
//	
//	@Override
//	public List<User> getAllUsers() {
//		List<User> user = userRepository.findAll();
//		
//		HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(MediaType.APPLICATION_JSON);
//		
//		List responseEntity = restTemplate.getForObject("http://localhost:8002/rating", List.class);
//		return user;
//	}


}
