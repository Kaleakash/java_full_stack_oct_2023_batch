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
	Employee e1 = (Employee)obj.getBean("emp1");   // pull the object. 
	e1.display();
	}

}
