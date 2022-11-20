package com.simplilearn.firstspringappwithoutmaven;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestSpringCode {

	public static void main(String[] args) {
	
		//read applicationContext.xml file
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee emp = (Employee) factory.getBean("employeebean");
		emp.displayEmpInfo();

	}

}
