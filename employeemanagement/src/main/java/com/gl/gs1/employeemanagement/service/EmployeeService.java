package com.gl.gs1.employeemanagement.service;

import java.util.List;

import com.gl.gs1.employeemanagement.entity.Employee;



public interface EmployeeService {
	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee thestudent);

	public void deleteById(int theId);

	

}
