package com.example.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		CRUDEmployee obj = new CRUDEmployee();
		
		try {
		//obj.saveEmployee();
			//obj.fetchEmployee();
			//obj.fetchEmployeeById();
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int sal = sc.nextInt();
			sc.nextLine();
			String email = sc.nextLine();
			Long phone = sc.nextLong();
			
			obj.saveEmployeeByInput(id,name,sal,email,phone);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
