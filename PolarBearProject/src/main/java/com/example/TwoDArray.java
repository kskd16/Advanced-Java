package com.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TwoDArray {
	
	
		
		
		//List<List<String>> filtered = new ArrayList<>();
		
		public static List<List<String>> extractErrorLogsStream(List<List<String>> logs) {

		  List<List<String>> filtered = new ArrayList<>();
		  
//		  for(List<String> log: logs) {
//			  String status = log.get(2);
//			  if(status.equals("ERROR") || status.equals("CRITICAL")) {
//				  filtered.add(log);
//			  }
//		  }
//		  
		  return logs.stream().filter(log -> log.get(2).equals("ERROR") || log.get(2).equals("CRITICAL")).sorted(Comparator.comparing(
				 (List<String> log) -> convertToTimeValue(log.get(0),log.get(1))
				  ))
				  .toList();
		
		  
	}
		public static long convertToTimeValue(String date, String time) {
			String[] dateParts = date.split("-");
			int day = Integer.parseInt(dateParts[0]);
			int month = Integer.parseInt(dateParts[1]);
			int year = Integer.parseInt(dateParts[2]);
			
			
			String[] timeParts = time.split(":");
			int hour = Integer.parseInt(timeParts[0]);
			int minute = Integer.parseInt(timeParts[1]);
			
			return year* 100000000l +month* 1000000l + day*10000l + hour*100l +minute;
		}
	
	
	
	public static void main(String[] args) {
		List<List<String>> input = Arrays.asList(Arrays.asList("01-01-2023","14:00","ERROR","failed"),Arrays.asList("01-01-2023","04:00","INFO","established"),Arrays.asList("02-01-2023","1:30","ERROR","failed"));
		
		System.out.println(extractErrorLogsStream(input));

				
	}

}
