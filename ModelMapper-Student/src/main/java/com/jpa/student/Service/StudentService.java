package com.jpa.student.Service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.student.Dto.StudentDto;
import com.jpa.student.Entity.Student;
import com.jpa.student.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public Student addStudent(StudentDto studentdto) {
		Student student = this.modelMapper.map(studentdto, Student.class);
		
		int hindi = studentdto.getHindi();
		int maths = studentdto.getMaths();
		int english = student.getEnglish();
		int total = hindi+english+maths;
		student.setTotal(total);
		return studentRepository.save(student);
	}
	
	public List<Student> getAllStudents(){
		List<Student> student = studentRepository.findAll();
		return student;
	}
}
