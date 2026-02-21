package com.viom;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component(value = "myEmp")
public class Employee {
	
	@Value("1001")
	private int empId;
	@Value("Khushi Dixit")
	private String name;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void work() {
		System.out.println("Employee is working!!!");
	}

}
