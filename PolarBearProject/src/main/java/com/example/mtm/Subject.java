package com.example.mtm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Subject {
	
	@Id
	private int id;
	private String name;
	private String trainer;
	
	public Subject() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	

}
