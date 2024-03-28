package com.jpa.map.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.map.Dto.StudentDto;
import com.jpa.map.Entity.Student;
import com.jpa.map.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
   
	
	@GetMapping("/Student")
	public List<Student> getStudents() throws Exception{
		return studentService.getAllStudents();
	}
	
	@PostMapping("/student")
	public StudentDto saveStudent(@RequestBody StudentDto studentdto) {
		return studentService.addStudent(studentdto);
	}
	
	
}