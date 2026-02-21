package com.example.oto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aadhar {
	@Id
	private long id;
	private String location;
	
	public Aadhar() {}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
