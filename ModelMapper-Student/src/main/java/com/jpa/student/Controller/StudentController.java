package com.jpa.student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.student.Dto.StudentDto;
import com.jpa.student.Entity.Student;
import com.jpa.student.Service.StudentService;

@RestController
public class StudentController {
    
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/student")
	public List<Student> getStudents(){
		return studentService.getAllStudents();
	}
	
	@PostMapping("/student")
	public Student saveStudent(@RequestBody StudentDto studentdto) {
		return studentService.addStudent(studentdto);
	}
}
