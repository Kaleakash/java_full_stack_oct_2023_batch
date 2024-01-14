package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
	// Hibernate API 
	// This class load the hibernate.cfg.xml file 
	Configuration con = new Configuration();
	con.configure("hibernate.cfg.xml");
	
	System.out.println("file load successfully");
	SessionFactory sf = con.buildSessionFactory();		// like Connection in JDBC. 
	
	Session session = sf.openSession(); 		// like Statement or PreparedStatement 
	
	Transaction tran = session.getTransaction();		// get transaction object. 
	Employee emp1 = new Employee();
	emp1.setId(105);
	emp1.setName("Dinesh");
	emp1.setSalary(45000);
	
		tran.begin();
			session.save(emp1);					// like insert Query 
		tran.commit();
		System.out.println("Record inserted successfully...");
	}

}
