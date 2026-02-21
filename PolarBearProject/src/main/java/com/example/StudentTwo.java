package com.example;


import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
	//1st step
	@Entity
	public class StudentTwo implements Serializable{
	
		@Id //to make primary key for the table
		private int student_id;
		private String name;
		private long phone;
		public StudentTwo() {}
		//3rd
		public int getStudentId()
		{
			return student_id;
		}
		public void setStudentId(int student_id)
		{
			this.student_id = student_id;
		}
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name = name;
		}
		public long getPhone()
		{
			return phone;
		}
		public void setPhone(long phone)
		{
			this.phone = phone;
		}
		
	}