package com.jpa.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.student.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
