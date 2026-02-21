package com.example;

import java.util.stream.IntStream;

public class Example {
	public static void main(String[] args) {
		int n = 10; //for example
				IntStream.iterate(1, i-> i+1)
				.filter(Example :: isPrime)
				.limit(n)
				.forEach(System.out::println);
		
	}
	
	public static  boolean isPrime(int num) {
		if(num <=1) return false;
		else {
			for(int i = 2 ;i<num;i++) {
				if (num% i == 0)return false;
			}
			return true;
		}
		
	}

}
