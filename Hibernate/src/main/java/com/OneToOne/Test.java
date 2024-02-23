package com.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Department_data d1 = new Department_data();
		d1.setDeptName("Development");
		
		
		Employee_data emp = new Employee_data();
		emp.setEmpName("Harsh");
		emp.setDepartment(d1);
		
		d1.setEmp(emp);
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(d1);
		session.save(emp);
		session.getTransaction().commit();
		session.close();
	}

}
