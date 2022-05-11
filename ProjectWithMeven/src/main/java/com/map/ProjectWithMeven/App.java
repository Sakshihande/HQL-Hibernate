package com.map.ProjectWithMeven;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException{
    	System.out.println("Project started");
    	SessionFactory factory= new Configuration().configure().buildSessionFactory();
        Session session = factory.getCurrentSession();

    	
    	System .out.println(factory.isClosed());
    	// creating students
    	
    	Student1Entity st = new Student1Entity("Sakshi","sakshi@abc.com");
    	System.out.println(st);
    	session.beginTransaction();
    	session.save(st);
    	session.getTransaction().commit();
    	session.close();
    	
    }
    
       
    }

