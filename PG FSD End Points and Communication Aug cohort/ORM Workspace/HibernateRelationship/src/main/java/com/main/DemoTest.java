package com.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

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
	
//	// Store Trainer details 
//	Trainer t1 = new Trainer();
//	t1.setTid(1);
//	t1.setTname("Raj");
//	t1.setTech("Java");
//	
//	// Store Student details 
//	Student s1 = new Student();
//	s1.setSid(100);
//	s1.setSname("Seeta");
//	s1.setAge(21);
//	s1.setTsid(1);				// Fk ie Trainer Id 
//	
//	Student s2 = new Student();
//	s2.setSid(101);
//	s2.setSname("Veeta");
//	s2.setAge(22);
//	s2.setTsid(1);				// Fk ie Trainer Id 
//	
//	Student s3 = new Student();
//	s3.setSid(103);
//	s3.setSname("Meeta");
//	s3.setAge(24);							// This student not belong to any trainer here tsid is null 
//
//	// Storing Student Record with trainer record 
//	Trainer t2 = new Trainer();
//	t2.setTid(3);
//	t2.setTname("Vijay");
//	t2.setTech("Spring micro service");
//	
//	Student s4 = new Student();
//	s4.setSid(106);
//	s4.setSname("Ueeta");
//	s4.setAge(23);
//	s4.setTsid(3);
//	
//	Student s5 = new Student();
//	s5.setSid(107);
//	s5.setSname("Teeta");
//	s5.setAge(26);
//	s5.setTsid(3);
//	
//	List<Student> listOfStd = new ArrayList<>();
//	listOfStd.add(s4);
//	listOfStd.add(s5);
//	
//	t2.setListOfStd(listOfStd);   // one trainer as Ajay handle two student as Keeta and Veeta etc. 
//	
//	  tran.begin();
////			session.save(t1);
////			session.save(s1);
////			session.save(s2);
////			session.save(s3);
//	  		session.save(t2);
//	  		//session.save(s4);
//	  		//session.save(s5);
//		tran.commit();
//		System.out.println("Stored Trainer and Student details");
	
		// HQL Join 
//	TypedQuery query = session.createQuery("select t.tech,t.tname,s.sname from Student s, Trainer t where t.tid = s.tsid");
//	List<Object[]> list = query.getResultList();
//	Iterator<Object[]> li = list.iterator();
//	while(li.hasNext()) {
//		Object obj[]=li.next();
//		System.out.println("Tech "+obj[0]+" Trainer name "+obj[1]+" Student name "+obj[2]);
//	}
	// Without Join also we can get Student record from Trainer entity 
	TypedQuery qry = session.createQuery("select t from Trainer t");
	List<Trainer> trainers = qry.getResultList();
	Iterator<Trainer> li = trainers.iterator();
	while(li.hasNext()) {
		Trainer t  = li.next();
		System.out.println(t);			// toString methods called...
	}
	}

}
