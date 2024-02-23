package com.association;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Address a1 = new Address();
		a1.setCity("Bangalore");
		a1.setState("Karnataka");
		a1.setCountry("India");
		
		Employee emp = new Employee();
		emp.setEmpName("Harsh");
		emp.setEmpDept("development");
		emp.setAddress(a1);
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session .beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
		session.close();
		System.out.println("Data saved successfully");

	}

}
