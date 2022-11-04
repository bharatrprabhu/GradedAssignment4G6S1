package com.gl.gs1.employeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.gl.gs1.employeemanagement.entity.Employee;
import com.gl.gs1.employeemanagement.repository.EmployeeRepository;



public class EmployeeServiceImpl implements EmployeeService {
	@Autowired(required=true)
	EmployeeRepository employeeRepository;
	
	@Transactional
	public List<Employee> findAll() {

		List<Employee> students = employeeRepository.findAll();

		return students;
	}

	@Transactional
	public Employee findById(int id) {

		Employee employee = new Employee();

		// find record with Id from the database table
		employee = employeeRepository.findById(id).get();

		return employee;
	}

	@Transactional
	public void save(Employee theEmployee) {

		employeeRepository.save(theEmployee);

	}


	@Override
	@Transactional
	public void deleteById(int theId) {
		employeeRepository.deleteById(theId);
		
	}

}
