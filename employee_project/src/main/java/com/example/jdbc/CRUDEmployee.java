package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDEmployee {
	String url = "jdbc:postgresql://localhost:5433/example";
	String user = "postgres";
	String pass = "root";
	Connection con = null;
	//static initializer to load Driver for postgreSQL
	static{
		try {
			//Loading Driver
		Class.forName("org.postgresql.Driver");}
		catch(ClassNotFoundException e){
				e.printStackTrace();	//handling exception
			}
		
		
	}
	//constructor 
	public CRUDEmployee() {
		//Driver Connection created
		try {
		con = DriverManager.getConnection(url, user, pass);//url, user, pass non static variables of class
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	//method to insert rows;
		public void saveEmployee() throws SQLException{
			Statement stm = con.createStatement();
			stm.execute("INSERT INTO employee values(4,'arc',65000,'arc@mail.com',6390499418)");;
		}
		public void saveEmployeeByInput(int id, String name, int sal, String email, long phone) throws SQLException{
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?,?);");
			ps.setInt(1,id);
			ps.setString(2, name);
			ps.setInt(3, sal);
			ps.setString(4, email);
			ps.setLong(5, phone);
			ps.execute();
		}
		
		public void fetchEmployee() throws SQLException{
			Statement stmFetch = con.createStatement();
			stmFetch.execute("select * from employee");
			ResultSet rs = stmFetch.getResultSet();
			while(rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("sal"));
				System.out.println(rs.getString("email"));
				System.out.println(rs.getLong("phone"));
			}
		}
		
		public void fetchEmployeeById() throws SQLException{
			Statement stmFetch = con.createStatement();
			stmFetch.execute("select * from employee where id=3");
			ResultSet rs = stmFetch.getResultSet();
			while(rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("sal"));
				System.out.println(rs.getString("email"));
				System.out.println(rs.getLong("phone"));
			}
			
		}
		//method to close connection
		public void closeConnection() throws SQLException {
			con.close();
		}

}
