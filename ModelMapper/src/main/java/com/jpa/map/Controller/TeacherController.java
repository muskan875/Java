package com.jpa.map.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.map.Dto.TeacherDto;
import com.jpa.map.Entity.Teacher;
import com.jpa.map.Service.TeacherService;

@RestController
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;

	@GetMapping("/teacher")
	public List<Teacher> getTeachers(){
		return teacherService.getAllTeachers();
	}
	
	@PostMapping("/teacher")
	public Teacher addTeacher(@RequestBody TeacherDto teacherdto) {
		return teacherService.DtoToTeacher(teacherdto);
	}
}