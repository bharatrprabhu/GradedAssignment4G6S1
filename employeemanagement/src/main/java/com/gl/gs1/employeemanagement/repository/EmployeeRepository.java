package com.gl.gs1.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.gs1.employeemanagement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
