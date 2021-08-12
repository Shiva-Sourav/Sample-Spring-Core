package com.shiva.dtask2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Draw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("mySpring.xml"));
		@SuppressWarnings("resource")
		ApplicationContext context =new ClassPathXmlApplicationContext("com/shiva/dtask2/mySpring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
     
     
	}
}
