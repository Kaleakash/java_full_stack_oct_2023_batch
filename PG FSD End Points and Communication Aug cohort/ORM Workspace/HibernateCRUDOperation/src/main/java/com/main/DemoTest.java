package com.main;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

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
	con.configure("hibernate.cfg.xml");			// Load the xml file 
	
	System.out.println("file load successfully");
	
	SessionFactory sf = con.buildSessionFactory();		// like Connection in JDBC. 
	
	Session session = sf.openSession(); 		// like Statement or PreparedStatement 
	
	Transaction tran = session.getTransaction();		// get transaction object. 
	
	// Insert Query or Save Employee Record 
//	Employee emp1 = new Employee();
//	emp1.setId(105);
//	emp1.setName("Dinesh");
//	emp1.setSalary(45000);
//	
//		tran.begin();
//			session.save(emp1);					// like insert Query 
//		tran.commit();
//		System.out.println("Record inserted successfully...");
	
//	// Delete Query 
//	Employee emp = session.find(Employee.class, 100); // find method 1st parameter class reference and 2nd value of pk 
//	if(emp==null) {
//		System.out.println("Record not present");
//	}else {
//		tran.begin();
//		session.delete(emp);		// delete from employee where id = 100;
//		tran.commit();
//		System.out.println("Record deleted successfully...");
//	}
	
//	// Update Query 
//		Employee emp = session.find(Employee.class, 102); // find method 1st parameter class reference and 2nd value of pk 
//		if(emp==null) {
//			System.out.println("Record not present");
//		}else {
//			tran.begin();
//				emp.setSalary(20000);
//				session.update(emp);    	// update employee set salary = 20000 where id = 102
//			tran.commit();
//			System.out.println("Record updated successfully...");
//		}
	// find the record based or using id 
	// Update Query 
			// select * from employee where id = 102 
//			Employee emp = session.find(Employee.class, 102); // find method 1st parameter class reference and 2nd value of pk 
//			if(emp==null) {
//				System.out.println("Record not present");
//			}else {
//				System.out.println(emp);   // it call toString method 
//			}
	
	// Retrieve more than one record like select query using HQL 
	
//	// In DAO layer 
//	//TypedQuery qry = session.createQuery("select emp from Employee emp");
//	//TypedQuery qry = session.createQuery("from Employee emp");
//	TypedQuery qry = session.createQuery("from Employee");		// from entity class 
//	List<Employee> listOfEmp = qry.getResultList();
//	
//	// view layer 
//	System.out.println("Number of records "+listOfEmp.size());
//	Iterator<Employee> li = listOfEmp.iterator();
//	while(li.hasNext()) {
//		Employee emp = li.next();
//		System.out.println(emp);
//	}
	
	// In DAO layer with where clause 
	// Static value 
	//TypedQuery qry = session.createQuery("select emp from Employee emp where emp.id=102"); // id condition 
	//TypedQuery qry = session.createQuery("select emp from Employee emp where emp.salary>20000"); // salary condition
	// dynamic value	using label query concept 
//	TypedQuery qry = session.createQuery("select emp from Employee emp where emp.salary > :sal"); // salary condition 
//	float salary = 20000;		//if we want we can take through keyboard using scanner 
//	qry.setParameter("sal", salary);
//		List<Employee> listOfEmp = qry.getResultList();
//		// view layer 
//		System.out.println("Number of records "+listOfEmp.size());
//		Iterator<Employee> li = listOfEmp.iterator();
//		while(li.hasNext()) {
//			Employee emp = li.next();
//			System.out.println(emp);
//		}
	
		// Retrieve only name variable value using HQL retrieving partial objects. 
	TypedQuery qry = session.createQuery("select emp.name from Employee emp");
	List<String> names = qry.getResultList();
	Iterator<String> li = names.iterator();
	while(li.hasNext()) {
		String name = li.next();
		System.out.println("name "+name);
	}
	
	// Retrieve only salary variable value using HQL retrieving partial objects. 
		TypedQuery qry1 = session.createQuery("select emp.salary from Employee emp");
		List<Float> salary = qry1.getResultList();
		Iterator<Float> li1 = salary.iterator();
		while(li1.hasNext()) {
			float sal = li1.next();
			System.out.println("Salary "+sal);
		}
	
		// Retrieve more than variables like name salary variable value using HQL retrieving partial objects. 
				TypedQuery qry2 = session.createQuery("select emp.name,emp.salary from Employee emp");
				List<Object[]> nameAndSalary = qry2.getResultList();
				Iterator<Object[]> li2 = nameAndSalary.iterator();
				while(li2.hasNext()) {
					Object obj[]=li2.next();
					System.out.println("Name is "+obj[0]+" Salary is "+obj[1]);
				}
	}
	
	

}



