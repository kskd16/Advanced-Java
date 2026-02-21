package com.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FindStudentTwo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		StudentTwo obj = em.find(StudentTwo.class,10 );
		System.out.println(obj.getStudentId());
		System.out.println(obj.getName());
	}

}
