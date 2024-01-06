package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
		//Employee emp = new Employee();
		//emp.display();

	Resource res = new ClassPathResource("beans.xml");	// file loaded...
	BeanFactory obj = new XmlBeanFactory(res);    // it use to get the reference of bean factory 
//	Employee e1 = (Employee)obj.getBean("emp1");   // pull the object. 
//	e1.display();
//	Employee e2 = (Employee)obj.getBean("emp1");   // pull the object. 
//	e2.display();
//	
//	Employee e3 = (Employee)obj.getBean("emp2");   // pull the object. 
//	e3.display();
//	
//	Employee e4 = (Employee)obj.getBean("emp2");   // pull the object. 
//	e4.display();
	
	
	Employee e5 = (Employee)obj.getBean("emp2");   // pull the object. 
	System.out.println(e5);     // it will call toString method 
	
	Employee e6 = (Employee)obj.getBean("emp3");   // pull the object. 
	System.out.println(e6); 
	
	Employee e7 = (Employee)obj.getBean("emp4");   // pull the object. 
	System.out.println(e7); 
	
	}

}
