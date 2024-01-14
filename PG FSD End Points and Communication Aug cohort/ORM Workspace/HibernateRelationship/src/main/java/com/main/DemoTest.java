package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Student;
import com.bean.Trainer;

public class DemoTest {

	public static void main(String[] args) {
	Configuration con = new Configuration();
	con.configure("hibernate.cfg.xml");
	SessionFactory sf = con.buildSessionFactory();
	Session session = sf.openSession();
	Transaction tran = session.getTransaction();
	
	// Store Trainer details 
	Trainer t1 = new Trainer();
	t1.setTid(1);
	t1.setTname("Raj");
	t1.setTech("Java");
	
	// Store Student details 
	Student s1 = new Student();
	s1.setSid(100);
	s1.setSname("Seeta");
	s1.setAge(21);
	s1.setTsid(1);				// Fk ie Trainer Id 
	
	Student s2 = new Student();
	s2.setSid(101);
	s2.setSname("Veeta");
	s2.setAge(22);
	s2.setTsid(1);				// Fk ie Trainer Id 
	
		tran.begin();
			session.save(t1);
			session.save(s1);
			session.save(s2);
		tran.commit();
		System.out.println("Stored Trainer and Student details");
	}

}
