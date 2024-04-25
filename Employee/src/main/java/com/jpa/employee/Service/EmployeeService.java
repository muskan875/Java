package com.jpa.employee.Service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.employee.Dto.EmployeeDto;
import com.jpa.employee.Entity.Employee;
import com.jpa.employee.Repository.EmployeeRepository;

@Service
public class EmployeeService {
 
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public List<Employee> getAllEmployee(){
		List<Employee> employee = employeeRepository.findAll();
		return employee;
	}
	
	public Employee addEmployee(EmployeeDto employeedto) {
		Employee employee = modelMapper.map(employeedto, Employee.class);
		return employeeRepository.save(employee);
	}
	
}
