package com.mp.spring.pojo;

import java.io.File;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class AssignOneMain {

	public static void main(String[] args) {
		// Resource resource = new ClassPathResource("beans.xml");
		// XmlBeanFactory beanFactory = new XmlBeanFactory(resource);
		
		/*FileSystemResource fileSystemResource = new FileSystemResource("src\\main\\resources\\beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(fileSystemResource);*/
		
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
		BeanFactory beanFactory = (BeanFactory) classPathXmlApplicationContext; 
		
		// Car c = beanFactory.getBean(Car.class);
		Car c = classPathXmlApplicationContext.getBean(Car.class);
		System.out.println("Car details = \n" + c);
		
		classPathXmlApplicationContext.close();
	}

}
