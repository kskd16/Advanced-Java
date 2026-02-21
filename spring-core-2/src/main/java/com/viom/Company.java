package com.viom;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component(value = "myCompany")
public class Company {
	
	private int compId;
	private String name;
	private String address;
	public int getCompId() {
		return compId;
	}
	
	@Value("10001")
	public void setCompId(int compId) {
		this.compId = compId;
	}
	public String getName() {
		return name;
	}
	@Value("ViOM")
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	@Value("Lucknow")
	public void setAddress(String address) {
		this.address = address;
	}
	

}
