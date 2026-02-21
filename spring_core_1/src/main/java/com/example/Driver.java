package com.example;

import java.beans.XMLDecoder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context =new  ClassPathXmlApplicationContext("config.xml");//creating spring container
		
		
		
		
		
		System.out.println("Main start");
		
		//Student student = new Student();
		
		//Student student = (Student) context.getBean("myStudent");
		
		
		Employee employee = context.getBean("emp",Employee.class);
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getLaptop().getBrand());
		System.out.println(employee.getLaptop().getProcessor());
		employee.work();
		
		
		
		System.out.println("Main end!");

	}

}
