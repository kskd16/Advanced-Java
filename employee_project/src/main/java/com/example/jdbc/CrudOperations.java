package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudOperations {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5433/example";
		String user = "postgres";
		String pass = "root";
		try {
			//load driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Loaded!");
			//create connection
			Connection con = DriverManager.getConnection(url,user,pass);
			System.out.println(con);
			//create statement
			Statement stm = con.createStatement();
			//execute query
			stm.execute("Insert into public.student values (5,'Shubhansh',8765634835,9.0,'shubhansh@mail.com')");
			//close connection
			con.close();
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();	
		}

		
	}
	
}
