package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	EntityManagerFactory emf;			// DI for EntityManagerFactory check from beans.xml file 
	
	public int storeEmployee(Employee employee) {
		try {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			tran.begin();
				manager.persist(employee);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public int deleteEmployee(int id) {
		
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			Employee emp = manager.find(Employee.class, id);
			
			if(emp==null) {
				return 0;
			}else {
				tran.begin();
				manager.remove(emp);
				tran.commit();
				return 1;
			}
	}

	public int updateEmployee(Employee employee) {
		
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		Employee emp = manager.find(Employee.class, employee.getId());
		
		if(emp==null) {
			return 0;
		}else {
			tran.begin();
					emp.setSalary(employee.getSalary());
					emp.setName(employee.getName());
					manager.merge(emp);
			tran.commit();
			return 1;
		}
	}	
	
	public Employee findEmployee(int id) {
		EntityManager manager = emf.createEntityManager();
		Employee emp = manager.find(Employee.class, id);
		return emp;
	}	

	public List<Employee> findAllEmployee() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select emp from Employee emp");
		List<Employee> listOfEmp = qry.getResultList();
		return listOfEmp;
	}
	
	public List<Employee> findAllEmployeeBySalary(float salary) {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select emp from Employee emp where emp.salary > :sal");
		qry.setParameter("sal", salary);
		List<Employee> listOfEmp = qry.getResultList();
		return listOfEmp;
	}
	
	
}



