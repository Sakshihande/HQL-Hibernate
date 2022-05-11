package com.hql;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.map.ProjectWithMeven.Certificate;
import com.map.ProjectWithMeven.StudentEntity;


public class HqlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session ses=factory.openSession();
		Transaction tx=ses.beginTransaction();
		
		Scanner sc=new Scanner(System.in);
		
		//Static value
		/*
		System.out.println("------------------------Select Record-------------------------");
		String query="FROM StudentEntity where id=:a";
		Query q=ses.createQuery(query);
		q.setParameter("a", 101);
		//fetch 1 record
		StudentEntity st=(StudentEntity)q.getSingleResult();
		System.out.println(st.getName());
		System.out.println(st.getId());
		
		//fetch multiple records
		//if answer is multiple then we use list interface
		
		List<StudentEntity> list1=q.getResultList();
		System.out.println(list1);
		for(StudentEntity st1: list1) {
			System.out.println(st1.getName());
			System.out.println(st1.getId());
		}
		//it returns how many times your query is executed
		System.out.println(q.getMaxResults());
	
		
//		System.out.println("------------------------Delete Record-------------------------");
//		Transaction tx=ses.beginTransaction();
//		Query q2=ses.createQuery("delete from StudentEntity where id=:x");
//		q2.setParameter("x", 105);
//		int n=q2.executeUpdate();
//		System.out.println("deleted Successfully...! "+n);
//		tx.commit();
//		
		
		System.out.println("------------------------Update Record 1-------------------------");
		
		Transaction tx2=ses.beginTransaction();
		Query q3=ses.createQuery("update StudentEntity set name='Satish' where id=:x");
		q3.setParameter("x", 101);
		int n2=q3.executeUpdate();
		System.out.println("updated successfully...! "+n2);
		
		System.out.println("------------------------Update Record 2-------------------------");
			
			q3=ses.createQuery("update StudentEntity set name=:x1 where id=:x2");
			q3.setParameter("x1", "Rameshwar");
			q3.setParameter("x2", 102);
			int n3=q3.executeUpdate();
			System.out.println("updated successfully...! "+n3);	
		
		tx2.commit();
		*/
		/*
		System.out.println("------------------------Insert Record: 1-------------------------");
		Certificate cert=new Certificate();
		cert.setCourse("BE");
		cert.setDuration("4 Years");
		StudentEntity stud=new StudentEntity();
		stud.setId(103);
		stud.setEmail("abc@gmail.com");
		stud.setName("Sakshi");
		stud.setCerti(cert);
		
		ses.save(stud);
		System.out.println("inserted: ");
	*/	
		//dynamic values
	/*	
		System.out.println("------------------------Update Record: 1-------------------------");
		Query q4=ses.createQuery("update StudentEntity set duration=:n1 where id=:n2");
		System.out.print("enter course duration: ");
		String duration=sc.nextLine();
		System.out.print("enter student id: ");
		int id=sc.nextInt();
		
		q4.setParameter("n1", duration);
		q4.setParameter("n2", id);
		
		System.out.println(q4.executeUpdate());
		*/
		tx.commit();
		ses.close();
		factory.close();
	}
}

