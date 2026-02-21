package com.example;

import java.util.List;

import com.example.oto.Aadhar;
import com.example.oto.Car;
import com.example.oto.Engine;
import com.example.oto.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		//System.out.println(emf);
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
//		Query query = em.createQuery("select s from StudentTwo s where student_id = 1");
//		// for "select s from StudentTwo s"
//		
//		
//		/*List<StudentTwo> students = query.getResultList();
//
//		
//		for(StudentTwo s : students) {
//			System.out.println(s.getStudentId());
//			System.out.println(s.getName());
//			System.out.println(s.getPhone());
//		}*/
//		 StudentTwo student = (StudentTwo)query.getSingleResult(); //
//		 System.out.println(student.getName()); // System.out.println(
//		 System.out.println("/////////////////////////////////////////////////////////////////");
//		
//		
//		Aadhar a = new Aadhar();
//		a.setId(14);
//		a.setLocation("Patna");
//		
//		Person p = new Person();
//		p.setId(104);
//		p.setName("Pranjal");
//		p.setAadhar(a);
//		
//		Aadhar a1= new Aadhar();
//		a1.setId(12);
//		a1.setLocation("Pune");
//		
//		Person p1 = new Person();
//		p1.setId(102);
//		p1.setName("Ankit");
//		p1.setAadhar(a1);
//		
//		Aadhar a2 = new Aadhar();
//		a2.setId(13);
//		a2.setLocation("Ghaziabad");
//		
//		Person p2 = new Person();
//		p2.setId(103);
//		p2.setName("Bhavya");
//		p2.setAadhar(a2);
//		
//		
//
//		et.begin();
//		em.persist(p);
//		em.persist(a);
//		em.persist(p1);
//		em.persist(a1);
//		em.persist(p2);
//		em.persist(a2);
//		et.commit();
		
		Engine engine = new Engine();
		engine.setId(11);
		engine.setCc(1200);
		
		Car car = new Car();
		car.setId(1);
		car.setBrand("Aston Martin");
		car.setEngine(engine);
		
		et.begin();
		em.persist(car);
		em.persist(engine);
		et.commit();
		
		
	} 

}
