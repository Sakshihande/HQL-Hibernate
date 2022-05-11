package com.map.ProjectWithMeven;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class EmDemo {
	
private SessionFactory factory;
public static void main (String[]args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.getCurrentSession();
		 StudentEntity stu=new StudentEntity();
		 stu.setCity("Karnataka");
		 stu.setName("Swomya");
		 
		 Certificate cert=new Certificate("Python","4 month");
		 stu.setcerti(cert);
		 StudentEntity stu2 = new StudentEntity();
		  stu2.setCity("Maharashtra");
		  stu2.setName("Sakshi");
		  Certificate cert1=new Certificate("Hibernate","2 month");
		  stu2.setcerti(cert1);
		  Session s=factory.openSession();
		  org.hibernate.Transaction tx=s.beginTransaction();
		  //object save
		  s.save(stu);
		  s.save(stu2);
		   tx.commit();
		  s.close();
	}
		  
		 
		
	}


