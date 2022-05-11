package com.map.ProjectWithMeven;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentEntity{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private String name;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
		
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public StudentEntity(String name,String city) {
		super();
		this.name=name;
		this.city=city;
	}
	public StudentEntity() {
		super();
		
	}
	private Certificate certi;
	public Certificate getcerti() {
		return certi;
	}
	public void setcerti(Certificate certi) {
		this.certi=certi;
	}
	public StudentEntity(String name, String city, Certificate certi) {
		super();
		this.name=name;
		this.city=city;
		this.certi=certi;
	}

	}

	

	

	
	
	
	
