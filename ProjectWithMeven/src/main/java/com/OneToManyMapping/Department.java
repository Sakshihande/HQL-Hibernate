package com.OneToManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String dept_name;
	@OneToMany
	private List<Employee>emp;
	
	
	public Department(int id,String dept_name,List<Employee>emp) {
		super();
		this.id=id;
		this.dept_name=dept_name;
		this.emp=emp;
		
	}
	public Department() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public List<Employee> getEmp() {
		return emp;
	}
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", dept_name=" + dept_name + ", emp=" + emp + "]";
	}
		
	}
	
	
	
	


