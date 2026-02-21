package com.example;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class StudentCrudImp implements StudentCRUD {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public static void main(String[] args) {
		StudentCrudImp sci = new StudentCrudImp();
		
		/*StudentTwo obj2 = new StudentTwo();
		obj2.setStudentId(2);
		obj2.setName("Bhavya");
		obj2.setPhone(859674123l);
		sci.saveStudent(obj2);

		StudentTwo obj3 = new StudentTwo();
		obj3.setStudentId(3);
		obj3.setName("Shubhansh");
		obj3.setPhone(968574123l);
		sci.saveStudent(obj3);*/
		
		//sci.updateStudentName(1,"Khushi Dixit");
		
		//sci.updateStudentPhone(2,9560068225l);
		
		//sci.findStudent(3);
		//sci.deleteStudent(3);
		sci.findAll();
		
		

	}

	@Override
	public void saveStudent(StudentTwo s) {
		et.begin();
		em.persist(s);
		et.commit();
		
		
	}

	@Override
	public void updateStudentName(int id, String name) {
		StudentTwo obj = em.find(StudentTwo.class,id);
		obj.setName(name);
		
		et.begin();
		em.merge(obj);
		et.commit();
		
	}

	@Override
	public void updateStudentPhone(int id, long phone) {
		StudentTwo obj = em.find(StudentTwo.class,id);
		obj.setPhone(phone);
		
		et.begin();
		em.merge(obj);
		et.commit();
		
	}

	@Override
	public void deleteStudent(int id) {
		StudentTwo obj = em.find(StudentTwo.class,id);
		
		et.begin();
		em.remove(obj);
		et.commit();
		
	}

	@Override
	public void findStudent(int id) {
		StudentTwo obj = em.find(StudentTwo.class,id);
		System.out.print("Id "+obj.getStudentId()+" | Name "+obj.getName()+" | Phone "+obj.getPhone());
		
	}

	@Override
	public void findAll() {
		
		Query qu = em.createQuery("select s from StudentTwo s");
		List<StudentTwo> students = qu.getResultList();
		
		for(StudentTwo s : students) {
			System.out.println("ID: "+s.getStudentId()+" | Name: "+s.getName()+" | Phone: "+s.getPhone());
			System.out.println("======================================++++++==============================");
		}
		
		
		
	}

}
