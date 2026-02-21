package com.example.mtm;

import java.util.Arrays;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentSubjectDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Subject sub1  = new Subject();
		sub1.setId(101);
		sub1.setName("Java");
		sub1.setTrainer("Ravi");
		Subject sub2 = new Subject();
		sub2.setId(102);
		sub2.setName("SQL");
		sub2.setTrainer("Vaishnav");
		
		List<Subject> subjects = Arrays.asList(sub1,sub2);
		
		Student stu1 = new Student();
		stu1.setId(12216560);
		stu1.setName("Khushi");
		stu1.setPhone(9569651785l);
		stu1.setSubjects(subjects);
		Student stu2 = new Student();
		stu2.setId(12216561);
		stu2.setName("Bhavya");
		stu2.setPhone(9569658525l);
		stu2.setSubjects(subjects);
		
		et.begin();
		em.persist(sub1);
		em.persist(sub2);
		em.persist(stu1);
		em.persist(stu2);
		et.commit();
		
		
		
		
	}

}
