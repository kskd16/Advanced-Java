package com.viom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value("1001")
	private int personId;
	@Value("Khushi Dixit")
	private String name;
	@Value("10-10-2003")
	private String dob;
	//@Autowired
	private Aadhar aadhar;// object field DI
	
	
	//public Person() {}
	//@Autowired
	public Person( Aadhar aadhar) {
		this.aadhar = aadhar; 
		/* if you have only one constructor in class it will 
		automatically make the object and inject but if we have more than one constructors
		 then it is mandatory to write @Autowired otherwise it will give NULLPOINTER Exception*/
		}
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Aadhar getAadhar() {
		return aadhar;
	}
	//@Autowired // DI for object
	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar; // setter DI for object
	}
	

}
