package com.gl.gs1.employeemanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employee")
@Data

@NoArgsConstructor
public class Employee {
	public Employee(String firstName, String lastName, String email) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;


	@Column(name="firstName")
	private String firstName;


	@Column(name="lastName")
	private String lastName;


	@Column(name="email")
	private String email;
	

}
