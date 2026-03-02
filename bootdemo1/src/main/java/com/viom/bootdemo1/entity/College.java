package com.viom.bootdemo1.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class College {
	@Id
	private int id;
	private String name;
	private String loc;
	
	@OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
	private List<Student> students;
	
	public College() {}

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

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public void addStudent(Student student) {
	    if (students == null) {
	        students = new ArrayList<>();
	    }
	    students.add(student);
	    student.setCollege(this);   // VERY IMPORTANT
	}

}
