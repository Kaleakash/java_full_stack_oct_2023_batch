package com.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
	// Insert Query 
	
//	Employee emp1 = new Employee();
//	emp1.setId(100);
//	emp1.setName("Raju");
//	emp1.setSalary(34000);
//					tran.begin();
//					manager.persist(emp1);
//					tran.commit();
//					
//					System.out.println("Employee record saved successfully");
	
	// Delete query 
	
//	Employee emp = manager.find(Employee.class, 100);
//	if(emp==null) {
//			System.out.println("Record not present");
//	}else {
//		tran.begin();
//				manager.remove(emp);
//		tran.commit();
//		System.out.println("Employee record deleted successfully");
//	}
	
	// update Query 
//	Employee emp = manager.find(Employee.class, 102);
//	if(emp==null) {
//			System.out.println("Record not present");
//	}else {
//		tran.begin();
//			emp.setSalary(22000);
//			manager.merge(emp);
//		tran.commit();
//		System.out.println("Employee record updated successfully");
//	}
	// retrieve record using id 
//	Employee emp = manager.find(Employee.class, 102);
//	if(emp==null) {
//			System.out.println("Record not present");
//	}else {
//		System.out.println(emp);
//	}
	// retreive more than one records using JPQL 
	Query qry= manager.createQuery("select emp from Employee emp");
	List<Employee> listOfEmp = qry.getResultList();
	System.out.println("Number of records are "+listOfEmp.size());
	}

}
