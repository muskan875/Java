package com.jpa.map.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.map.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
