package com.example;

import java.util.Arrays;
import java.util.List;

public class StreamPractice {

	public static void main(String[] args) {
		
		/*
		 1.
		List<String> strs = Arrays.asList("Rani","Rajni","Ronny","askt","mosts");
		
		strs.stream().filter(str -> str.startsWith("R")).map(String::toUpperCase).sorted().forEach(System.out::println);
		*/
		
		/*
		 * 2.
		 
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,11,13,10);
		List<Integer> res = list.stream().filter(n->n%2==0).map(n -> n*10).toList();
		System.out.println(res);
		*/
		
		/*
		 3.
		 
		List<String> names = Arrays.asList("fgdhsj","dsghaj","bhjn");
		names.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
		*/
		
		
	}
}
