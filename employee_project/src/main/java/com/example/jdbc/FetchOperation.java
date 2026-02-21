package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			stm.execute("select * from employee");
			ResultSet rs = stm.getResultSet();
			while(rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("sal"));
				System.out.println(rs.getString("email"));
				System.out.println(rs.getLong("phone"));
			}
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();	
		}

	}

}
