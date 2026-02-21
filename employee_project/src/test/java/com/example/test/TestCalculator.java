package com.example.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.example.Calculator;

public class TestCalculator {
	static Calculator c = null;
	@BeforeAll
	public static void CreateObject() {
		System.out.println("unit test started!");
		c= new Calculator();
		
	}
	@Test
	public void testAdd() {
	     int res = c.add(2,2);
		Assertions.assertEquals(4,res);
		
	}
	@Test
	public void testMulti() {
		int res = c.multi(3,6);
		Assertions.assertEquals(18, res);
	}
	@Test
	public void testSub() {
		int res = c.sub(3,6);
		Assertions.assertEquals(-3, res);
	}
	@Test
	public void testDiv() {
		double res = c.div(20,2);
		Assertions.assertEquals(10.0, res);
	}
	@AfterAll
	public static void closeAll() {
		System.out.println("Closing all connection");
	}
	
	

}
