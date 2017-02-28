package com.test.spring.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id 
	@GeneratedValue
	private String id;
	
	@Column
	private String name;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}



	public Employee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
