package com.OneToManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Employee {
	@Id
	private int e_id;
	private String e_name;
	private String e_add;
	private long e_no;
	
	@ManyToOne
	private Department dept;
	 public Employee(int e_id,String e_name,String e_add,long e_no,Department dept) {
		 super();
		 this.e_id=e_id;
		 this.e_name=e_name;
		 this.e_add=e_add;
		 this.e_no=e_no;
		 this.dept=dept;
	 }
	 public Employee() {
		 super();
	 }
	
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getE_add() {
		return e_add;
	}
	public void setE_add(String e_add) {
		this.e_add = e_add;
	}
	public long getE_no() {
		return e_no;
	}
	public void setE_no(long e_no) {
		this.e_no = e_no;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", e_name=" + e_name + ", e_add=" + e_add + ", e_no=" + e_no + ", dept="
				+ dept + "]";
	}
	
	

}
