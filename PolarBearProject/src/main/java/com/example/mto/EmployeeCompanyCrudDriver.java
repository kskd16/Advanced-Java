package com.example.mto;



import java.util.List;

import com.example.otm.Account;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeCompanyCrudDriver {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		/*Company com = new Company();
		com.setId(1001);
		com.setName("Viom");
		com.setAdd("LKO");
		
		Employee e1 = new Employee();
		e1.setId(11);
		e1.setName("KD");
		e1.setSalary(70000000);
		e1.setCompany(com);
		
		Employee e2 = new Employee();
		e2.setId(12);
		e2.setName("AD");
		e2.setSalary(700);
		e2.setCompany(com);
		Employee e3 = new Employee();
		e3.setId(13);
		e3.setName("SD");
		e3.setSalary(700000);
		e3.setCompany(com);
		Employee e4 = new Employee();
		e4.setId(14);
		e4.setName("BS");
		e4.setSalary(70000000);
		e4.setCompany(com);
		Employee e5 = new Employee();
		e5.setId(15);
		e5.setName("PD");
		e5.setSalary(70000000);
		e5.setCompany(com);
		
		et.begin();
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.persist(e4);
		em.persist(e5);
		em.persist(com);
		et.commit();
		*/
		
		List<Employee> employees = em.createQuery("Select emp from Employee emp").getResultList();
		for(Employee emp : employees) {
		System.out.print(emp.getId()+"   ");
		System.out.print(emp.getName()+"   ");
		System.out.print(emp.getSalary()+"   ");
		System.out.print(emp.getCompany().getName()+"   ");
		System.out.println(emp.getCompany().getAdd()+"   ");
		}
		
		
		
		
		
	}

}
