package com.axis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.entity.Employee;
import com.axis.exception.IdNotFoundException;
import com.axis.exception.InvalidAgeException;
import com.axis.exception.SalaryGreaterTwenty;
import com.axis.repository.EmployeeRepository;

@Service 
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		if(employee.getAge()<=22) {
			throw new InvalidAgeException("min age shoud be 23 or above");
		}
		else if(employee.getSalary()<=20000) {
			throw new SalaryGreaterTwenty("salary must be > 20k");
		}else
			
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
		
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> emp=employeeRepository.findById(id);
		if(emp.isPresent())
			return emp.get();
		else
			throw  new IdNotFoundException("No id is present to get value");
		
		
	}

	@Override
	public Employee updateEmployeeById(int id, Employee employee) {
		// TODO Auto-generated method stub
		Optional<Employee> emp=employeeRepository.findById(id);
		if(emp.isPresent())
			return employeeRepository.save(employee);
		else
			throw  new IdNotFoundException("No id is present to update");
	}

	@Override
	public String deleteEmployeeById(int id) {
		Optional<Employee> emp=employeeRepository.findById(id);
		if(emp.isPresent()) {
			employeeRepository.deleteById(id);
			return "Employee deleted";
		}
		else
			throw  new IdNotFoundException("No id is present to delete");
		
	}

	
}
