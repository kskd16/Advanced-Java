package com.example.otm;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class BankAccountCRUD {
	public static void main(String[] args) {
		
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	/*Account a1 = new Account();
	a1.setId(101l);
	a1.setName("Khushi");
	a1.setBalance(1000.0);
	Account a2 = new Account();
	a2.setId(102l);
	a2.setName("Bhavya");
	a2.setBalance(1000.0);
	Bank bank = new Bank();
	bank.setId(10001l);
	bank.setName("PSB");
	bank.setAddress("LKO");
	List<Account> acc_list = new ArrayList<>();
	acc_list.add(a1);
	acc_list.add(a2);
	bank.setAccounts(acc_list);
	*/
	
	Bank b = em.find(Bank.class,10001l );
	List<Account> list = b.getAccounts();
	Account account = null ;
	
	for(Account a: list) {
		if(a.getId() == 13l) {
			account = a;	
		}
		
	}
	et.begin();
	em.remove(account);
	et.commit();
	
	
//	Account a1 = new Account();
//	a1.setId(13);
//	a1.setName("KD");
//	a1.setBalance(2000.0);
//	
//	Bank b = em.find(Bank.class, 10001l);
//	b.getAccounts().add(a1);
//	
//	et.begin();
//	em.persist(a1);
//	et.commit();
	
	}
		

}
