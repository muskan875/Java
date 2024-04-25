package com.jpa.map.Service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.map.Dto.StudentDto;
import com.jpa.map.Dto.TeacherDto;
import com.jpa.map.Entity.Student;
import com.jpa.map.Entity.Teacher;
import com.jpa.map.Repository.TeacherRepository;

@Service
public class TeacherService {
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
//	public TeacherDto addTeacher(TeacherDto teacherdto) {	
//		Teacher teacher = new Teacher();
//		teacher.setName(teacherdto.getName());
//		
//		List<Student> studentList = new ArrayList<Student>();
//		
//     for(Student obj: teacherdto.getStudent()) {
//			
//			Student student = new Student();
//			student.setName(obj.getName());
//			student.setAddress(obj.getAddress());
//			student.setClassname(obj.getClassname());
//			student.setTeacher(teacher);
//			studentList.add(student);
//		}
//		teacher.setStudent(studentList);
//		teacherRepository.save(teacher);
//		return teacherdto;
//	}
	
	
	
	
	public Teacher DtoToTeacher(TeacherDto teacherDto) {
	    Teacher teacher = modelMapper.map(teacherDto, Teacher.class);
	    
	    List<Student> studentList = new ArrayList<>();
	    
	    for(StudentDto studentDto: teacherDto.getStudent()) {
	    	
	    	Student student = modelMapper.map(studentDto, Student.class);
	    	student.setTeacher(teacher);
	    	studentList.add(student);
	    }
	    teacher.setStudent(studentList);
	    return teacherRepository.save(teacher);
	}
	
	
	
	public List<Teacher> getAllTeachers(){
		List<Teacher> teacher = teacherRepository.findAll();
		return teacher;
	}




}
