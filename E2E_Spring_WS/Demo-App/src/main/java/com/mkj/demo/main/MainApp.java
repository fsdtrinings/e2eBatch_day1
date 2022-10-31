package com.mkj.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkj.demo.entity.Student;

public class MainApp {

	public static void main(String[] args) {
		/*
		//  ---- OLD Traditional approach of creating Spring object ----
		Student s1 = new Student(1, "Amit",50);
		
		System.out.println(s1);
		System.out.println(s1.getName());
		*/
		
		// ----- getting object through Spring ------
		
		ApplicationContext spring = new ClassPathXmlApplicationContext("student-spring-conf.xml");
		// Student s1  = (Student)spring.getBean("s777");
		// OR 
		Student s1 = spring.getBean("s777",Student.class);
		System.out.println(s1);
		System.out.println(s1.getName());
		
		
	}
}
