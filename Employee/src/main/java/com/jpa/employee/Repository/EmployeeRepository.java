package com.jpa.employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.employee.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
