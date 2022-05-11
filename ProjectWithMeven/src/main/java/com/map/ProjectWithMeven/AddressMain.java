package com.map.ProjectWithMeven;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddressMain {

public static void main (String[]args) {
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session session=factory.getCurrentSession();
	Date date=new Date();
	System.out.println(factory.isClosed());
	Address a=new Address(7,"Cotton Market Road","Amravati",true ,101,date) ;
	System.out.println(a);
	session.beginTransaction();
	session.save(a);
	session.getTransaction();
	session.close();
}
}