package com.example.oto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	private long id;
	private String name;
	
	@OneToOne
	private Aadhar aadhar;
	
	
	public Person() {}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}


	public Aadhar getAadhar() {
		return aadhar;
	}


	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}
	
	
	

}
