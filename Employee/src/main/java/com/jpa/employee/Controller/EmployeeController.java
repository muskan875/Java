package com.jpa.employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.employee.Dto.EmployeeDto;
import com.jpa.employee.Entity.Employee;
import com.jpa.employee.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	public List<Employee> getEmployees(){
		return employeeService.getAllEmployee();
	}
	
	@PostMapping("/save")
	public Employee addEmployee(@RequestBody EmployeeDto employeedto) {
		return employeeService.addEmployee(employeedto);
	}
}
