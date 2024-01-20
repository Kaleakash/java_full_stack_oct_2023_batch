package com.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
	// EntityManagerFactory is interface. we will create the 
	// reference of this interface with help of Persistence class. 
	// createEntityManagerFactory method get the persistence unit name part of persistence.xml file 
	// EntityManagerFactory is equal to SessionFactory. 
	// using EntityManager we can create more than one EntityManager reference like session 
		// in Hibernate 
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaCrudOperation");	
	EntityManager manager = emf.createEntityManager();		// like Session in hibernate 
	
	EntityTransaction tran = manager.getTransaction();			// like Transaction 
	Employee emp1 = new Employee();
	emp1.setId(100);
	emp1.setName("Raju");
	emp1.setSalary(34000);
					tran.begin();
					manager.persist(emp1);
					tran.commit();
					
					System.out.println("Employee record saved successfully");
	}

}
