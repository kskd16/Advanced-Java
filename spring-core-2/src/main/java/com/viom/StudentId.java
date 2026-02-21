package com.viom;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentId {
	@Value("101")
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
	public void allocated() {
		System.out.println("Student ID is allocated");
	}

}
