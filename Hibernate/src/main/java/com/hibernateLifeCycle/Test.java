package com.hibernateLifeCycle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		//Transient state
		System.out.println("Object is in transient state");
		Person person = new Person();
		person.setFirstName("John");
		person.setLastName("Doe");
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(person);
		session.getTransaction().commit();
		System.out.println("object is in persistent state");
		session.close();
		System.out.println("session closed");
		
		person.setLastName("Chadwick");
		System.out.println(person);
		System.out.println("object is in detached state");
		
		Session session2 = factory.openSession();
		session2.beginTransaction();
		session2.merge(person);
		session2.getTransaction().commit();
		System.out.println("object is in persistent state");
		session2.close();
		
		Session session3 = factory.openSession();
		session3.beginTransaction();
		session3.remove(person);
		session3.getTransaction().commit();
		System.out.println("object removed");
		
		
	}

}
