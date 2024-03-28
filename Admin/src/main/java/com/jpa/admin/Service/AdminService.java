package com.jpa.admin.Service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.jpa.admin.Dto.AdminDto;
import com.jpa.admin.Entity.Admin;
import com.jpa.admin.Repository.AdminRepository;


@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public Admin DtoToAdmin(AdminDto admindto) {
		Admin admin = modelMapper.map(admindto, Admin.class);

		List<User> userList = new ArrayList<>();
		
		for(User userdto : admindto.getUser()) {
			
			User user = modelMapper.map(userdto, User.class);
//			user.setAdmin(admin);
			userList.add(user);
		}
//		admin.setUser(userList);
		return adminRepository.save(admin);
	}
	
	
	
	
	public List<Admin> getAllAdmins(){
		List<Admin> admin = adminRepository.findAll();
		return admin;
	}
}
