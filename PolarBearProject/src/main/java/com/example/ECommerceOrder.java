package com.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ECommerceOrder {
	public static void main(String[] args) {
		
	
	List<Order> orders = Arrays.asList(new Order(1, "Amit", "Electronics", 60000, "Delhi", "PAID"),
			new Order(2, "Riya", "Clothing", 20000, "Mumbai", "PENDING"),
			new Order(3, "Rahul", "Electronics", 80000, "Delhi", "PAID"),
			new Order(4, "Neha", "Furniture", 45000, "Pune", "CANCELLED"),
			new Order(5, "Amit", "Clothing", 70000, "Delhi", "PAID"),
			new Order(6, "Karan", "Furniture", 30000, "Mumbai", "PAID"),
			new Order(7, "Priya", "Electronics", 90000, "Pune", "PAID"),
			new Order(8, "Riya", "Clothing", 70000, "Mumbai", "PAID"));
	
	/*
	orders.stream().filter(n -> n.getStatus().equals("PAID")).forEach(System.out::println);
	*/
	
	/*
	System.out.println(orders.stream().count());
	*/
	
	/*
	System.out.println(orders.stream().filter(n-> n.getStatus().equals("PAID")).collect(Collectors.summingDouble(n-> n.getAmount())));
	*/
	/*
	System.out.println(orders.stream().max(Comparator.comparingDouble(n-> n.getAmount())).orElse(null));
	*/
	/*
	System.out.println(orders.stream().reduce((o1,o2)-> o1.getAmount()> o2.getAmount() ? o1:o2).orElse(null));
	*/
	
	/*
	System.out.println(orders.stream().filter(n-> n.getStatus().equals("PAID")).min(Comparator.comparingDouble(Order::getAmount)).orElse(null));
	*/
	
	
	/*
	List<String> names = orders.stream().map(Order::getCustomerName).distinct().toList();
	System.out.println(names);
	*/
	
	/*
	List<String> customwith50000 = orders.stream().filter(n->n.getAmount() > 50000.0).map(Order::getCustomerName).distinct().toList();
	System.out.println(customwith50000);
	*/
	
	/*
	orders.stream().map(Order::getAmount).sorted(Comparator.reverseOrder()).forEach(System.out::println);
	*/
	
	/*
	orders.stream().sorted(Comparator.comparingDouble(Order::getAmount).reversed()).forEach(System.out::println);
	*/
	
	/*
	orders.stream().sorted(Comparator.comparingDouble(Order::getAmount).reversed()).limit(3).forEach(System.out::println);
	*/
	
	/*
	System.out.println(orders.stream().collect(Collectors.groupingBy(Order::getCategory)));
	*/
	
	/*
	System.out.println(orders.stream().collect(Collectors.groupingBy(Order::getCategory,Collectors.counting())));
	*/
	
	/*
	System.out.println(orders.stream().collect(Collectors.groupingBy(Order::getCategory,Collectors.summingDouble(Order::getAmount))));
	*/
	
//	System.out.println(orders.stream().collect(Collectors.groupingBy(Order::getCategory,Collectors.maxBy(Comparator.comparingDouble(Order::getAmount)))));
	
//	System.out.println(orders.stream().collect(Collectors.groupingBy(Order::getCategory,Collectors.averagingDouble(Order::getAmount))));
	
//	System.out.println(orders.stream().collect(Collectors.groupingBy(Order::getCity)));
	
//	System.out.println(orders.stream().collect(Collectors.groupingBy(Order::getCity,Collectors.summingDouble(Order::getAmount))));
	
//	System.out.println("Find city with highest total revenue:");
//	System.out.println(
//			orders
//			.stream()
//			.collect(Collectors.groupingBy(Order::getCity, Collectors.summingDouble(Order::getAmount)))
//			.entrySet()
//			.stream()
//			.max(Map.Entry.comparingByValue())
//			.orElse(null)
//			);
	
//	System.out.println("Find city with highest total revenue:");
//	System.out.println(
//			orders
//			.stream()
//			.collect(Collectors.groupingBy(Order::getCity, Collectors.averagingDouble(Order::getAmount)))
//			);
	
//	System.out.println(orders.stream().collect(Collectors.partitioningBy(n -> n.getStatus().equals("PAID"))));
	
//	System.out.println(orders.stream().collect(Collectors.partitioningBy(n -> n.getStatus().equals("PAID"),Collectors.counting())));
	
//	System.out.println(orders.stream().collect(Collectors.partitioningBy(n -> n.getStatus().equals("PAID"),Collectors.maxBy(Comparator.comparingDouble(Order::getAmount)))));
	
//     orders.stream().sorted(Comparator.comparingDouble(Order::getAmount).reversed()).skip(1).limit(1).forEach(System.out::println);
//	orders.stream().collect(Collectors.groupingBy(Order::getAmount,Collectors.counting())).entrySet().stream().filter(n -> n.getValue()>1).map(Map.Entry::getKey).forEach(System.out::println);
	
	
	Map<String, Double> customerTotal =
	        orders.stream()
	              .collect(Collectors.groupingBy(
	                      Order::getCustomerName,
	                      Collectors.summingDouble(Order::getAmount)
	              ));

	System.out.println(customerTotal);

	
	
	Map<String, Double> categoryRevenue =
	        orders.stream()
	              .collect(Collectors.groupingBy(
	                      Order::getCategory,
	                      Collectors.summingDouble(Order::getAmount)
	              ));

	categoryRevenue.entrySet()
	        .stream()
	        .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
	        .forEach(System.out::println);

	
	
	boolean isHighCancelled =
	        orders.stream()
	              .anyMatch(order ->
	                      order.getStatus().equals("CANCELLED")
	                              && order.getAmount() > 50000
	              );

	System.out.println("Any Cancelled above 50k? " + isHighCancelled);

}
}
