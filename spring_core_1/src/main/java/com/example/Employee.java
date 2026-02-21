package com.example;

public class Employee {
	
	private int id;
	private String name;
	
	private Laptop laptop;
	
	public Employee(int id, String name, Laptop laptop) {
		this.id = id;
		this.name = name;
		this.laptop = laptop;
	}
	
	public Employee() {
		
	}
	
	public void work() {
		System.out.println("Pretending to work to milk the salary out at the end of the month!");
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


	public Laptop getLaptop() {
		return laptop;
	}


	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

}
