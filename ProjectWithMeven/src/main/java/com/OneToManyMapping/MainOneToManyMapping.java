package com.OneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainOneToManyMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Department d= new Department();
		d.setDept_name("Computer Science");
		Employee e=new Employee();
		e.setE_id(101);
		e.setE_name("pqrs");
		e.setE_add("Amravati");
		e.setE_no(123456789);
		e.setDept(d);
		//Employee e1=new Employee();
		//e1.setE_id(102);
		//e1.setE_name("abc");
		//e1.setE_add("Yawatmal");
		//e1.setE_no(456783);
		//e1.setDept(d);
		List<Employee>list=new ArrayList<Employee>();
		list.add(e);
		//list.add(e);
		Session ses=factory.openSession();
		Transaction tx=ses.beginTransaction();
		ses.save(d);
		
		ses.save(e);
		//ses.save(e1);
		tx.commit();
		//fetching data
		Department d2=ses.get(Department.class,1);
		System.out.println("Department Name:"+d2.getDept_name());
		//System.out.println(Department Details:\n"+d2);
		for(Employee emp1:d2.getEmp()) {
			System.out.println("Employee Name:"+emp1.getE_name());
			//System.out.println("Employee Details:\n id:"+emp1.getE_id()+"name:"+emp1.getE_name()+"add:"+emp1.getE_add()+"contact"
		//	+emp1.getE_add()+"department:"+emp1.getDept()+\n");
			
		}
		ses.close();
		factory.close();
	}

	
	
	
	
	
		
			
			
		
		
		
		
		

	}
