package com.jpa.admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.admin.Dto.AdminDto;
import com.jpa.admin.Entity.Admin;
import com.jpa.admin.Service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/admin")
	public Admin addAdmin(@RequestBody AdminDto admindto) {
		return adminService.DtoToAdmin(admindto);
	}
	
	@GetMapping("/admin")
	public List<Admin> getAdmin(){
		return adminService.getAllAdmins();
	}
}