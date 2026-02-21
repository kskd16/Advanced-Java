package com.example.oto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class FetchPerson {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em  = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
//		Person p = em.find(Person.class,101);
//		System.out.println(p.getId());
//		System.out.println(p.getName());
//		System.out.println(p.getAadhar().getId());
//		System.out.println(p.getAadhar().getLocation());
//		
		
//		Person person = em.find(Person.class, 103);
//		person.getAadhar().setLocation("Hazaribagh");
//		
//		et.begin();
//		em.merge(person);
//		et.commit();
		
		Person person  = em.find(Person.class, 103);
		Aadhar aadhar = person.getAadhar();
		
		et.begin();
		em.remove(aadhar);
		em.remove(person);
		et.commit();
		
	}

}
