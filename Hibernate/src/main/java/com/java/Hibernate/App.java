package com.java.Hibernate;

import org.hibernate.cfg.Configuration;

import com.java.Hibernate.entity.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student s1=new Student();
    	s1.setName("Sathya");
    	s1.setCourse("Java");
    	
    	
    	
        Configuration con = new Configuration().configure();
        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(s1);
        session.getTransaction().commit();
        session.close();
        factory.close();
    }
}
