package com.mkj.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkj.demo.entity.Student;

public class MainApp {

	public static void main(String[] args) {
	
		ApplicationContext spring = new ClassPathXmlApplicationContext("student-spring-conf.xml");
		
		Student s1 = spring.getBean("abc",Student.class);
		System.out.println(s1);
		System.out.println(s1.getName());
		
		
	}
}
