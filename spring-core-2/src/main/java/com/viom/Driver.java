package com.viom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		
		
		//Driver code for field injection in Employee class
		
		/*Employee e = ac.getBean("myEmp" , Employee.class);
		
		System.out.println(e.getEmpId());
		System.out.println(e.getName());
		
		e.work();
		*/
		
		
		//Driver code for setter injection in Company class
		/*
		Company com = ac.getBean("myCompany", Company.class);
		
		System.out.println(com.getCompId());
		System.out.println(com.getName());
		System.out.println(com.getAddress());
		*/
		
		
		//Driver code for constructor injection in Book class
		
		/*Book b  = ac.getBean("myBook", Book.class);
		System.out.println(b.getBookId());
		System.out.println(b.getName());
		System.out.println(b.getAuthor());
		*/
		
		//Driver code for mixed DI in College class
		/*
		College c = ac.getBean("myCollege", College.class);
		
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getLocation());
		System.out.println(c.getDegree());
		*/
		
		
		//Driver code for Object Injection using Person and AadharCard
		
		/*Person p = ac.getBean("person", Person.class);
		
		System.out.println(p.getPersonId());
		System.out.println(p.getName());
		System.out.println(p.getDob());
		Aadhar a = p.getAadhar();
		System.out.println(a.getId());
		System.out.println(a.getAadharNumber());*/
		
		
		
		//Driver for Student and StudentId
		
		Student student = ac.getBean("student",Student.class);
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getMarks());
		StudentId sId = student.getStudentId();
		System.out.println(sId.getId());
		sId.allocated();

	}

}
