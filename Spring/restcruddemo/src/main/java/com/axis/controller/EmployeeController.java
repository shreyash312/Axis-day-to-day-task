package com.axis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.entity.Employee;
import com.axis.exception.IdNotFoundException;
import com.axis.service.EmployeeService;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeService.addEmployee(employee);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id)
	{
		return employeeService.getEmployeeById(id);
	}
	
	@PutMapping("/employee/{id}")
	public Employee updaEmployeeById(@PathVariable int id,@RequestBody Employee employee) {
		return employeeService.updateEmployeeById(id, employee);
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleEmployeeById(@PathVariable int id) {
		return employeeService.deleteEmployeeById(id);
	}
	
//	@ExceptionHandler(IdNotFoundException.class)
//	public String myException(IdNotFoundException exception) {
//		return exception.getMsg();
//	}
}
