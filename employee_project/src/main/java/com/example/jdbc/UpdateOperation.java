package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:postgresql://localhost:5433/example";
		String user = "postgres";
		String pass = "root";
		try {
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection(url, user,pass);
		Statement stm = con.createStatement();
		stm.execute("update public.student set marks = 10.0 where name='Shubhansh'; ");
		con.close();
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
