package com.viom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Student {
	
	
	@Value("1")
	private int id;
	
	@Value("KD")
	private String name;
	
	@Value("89")
	private int marks;
	
	public StudentId getStudentId() {
		return studentId;
	}

	public void setStudentId(StudentId studentId) {
		this.studentId = studentId;
	}
	private StudentId studentId;
	
	public Student() {
		
	}
	
	@Autowired
	public Student(StudentId studentId) {
		this.studentId = studentId;
		
	}
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

}
