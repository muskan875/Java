package com.jpa.map.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.map.Dto.StudentDto;
import com.jpa.map.Entity.Student;
import com.jpa.map.Repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public StudentDto addStudent(StudentDto studentdto) {  	
		  return studentdto;	  
	  }
	  
	  public List<Student> getAllStudents() throws Exception {
	      List<Student> list = (List<Student>) studentRepository.findAll();
	      if (list.isEmpty()) {
	         
	          throw new Exception("No books found");
	      }
	      return list;
	  } 
	  
}

	


