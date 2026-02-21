package com.example.jdbc;
//insert
//update
//fetch
//fetch all
//find
//find all
//delete


import java.sql.*;
import java.util.Scanner;
public class EmployeeAllDBOperations {

    String url = "jdbc:postgresql://localhost:5433/example";
    String user = "postgres";
    String pass = "root";
    Connection con;

    // Load PostgreSQL Driver
    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Create DB Connection
    public EmployeeAllDBOperations() {
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ---------------- INSERT ----------------
    public void saveEmployee(int id, String name, int sal, String email, long phone) throws SQLException {
        String sql = "INSERT INTO employee (id, name, sal, email, phone) VALUES (?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setInt(3, sal);
        ps.setString(4, email);
        ps.setLong(5, phone);
        ps.executeUpdate();
        ps.close();
        System.out.println("✅ Employee inserted successfully");
    }

    // ---------------- UPDATE ----------------
    public void updateEmployeePhone(int id, long phone) throws SQLException {
        String sql = "UPDATE employee SET phone = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setLong(1, phone);
        ps.setInt(2, id);
        int rows = ps.executeUpdate();
        ps.close();

        if (rows > 0)
            System.out.println("✅ Phone updated successfully");
        else
            System.out.println("❌ Employee not found");
    }

    // ---------------- DELETE ----------------
    public void deleteEmployeeById(int id) throws SQLException {
        String sql = "DELETE FROM employee WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        int rows = ps.executeUpdate();
        ps.close();

        if (rows > 0)
            System.out.println("✅ Employee deleted successfully");
        else
            System.out.println("❌ Employee not found");
    }

    // ---------------- FETCH ALL ----------------
    public void fetchAllEmployees() throws SQLException {
        String sql = "SELECT * FROM employee";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        System.out.println("\nID | Name | Salary | Email | Phone");
        System.out.println("-----------------------------------");

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getInt("sal") + " | " +
                    rs.getString("email") + " | " +
                    rs.getLong("phone")
            );
        }
        rs.close();
        st.close();
    }

    // ---------------- FETCH BY ID ----------------
    public void fetchEmployeeById(int id) throws SQLException {
        String sql = "SELECT * FROM employee WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            System.out.println("\nEmployee Details:");
            System.out.println("ID     : " + rs.getInt("id"));
            System.out.println("Name   : " + rs.getString("name"));
            System.out.println("Salary : " + rs.getInt("sal"));
            System.out.println("Email  : " + rs.getString("email"));
            System.out.println("Phone  : " + rs.getLong("phone"));
        } else {
            System.out.println("❌ Employee not found");
        }
        rs.close();
        ps.close();
    }

    public void closeConnection() throws SQLException {
        con.close();
    }

    // ===================== MAIN =====================
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeAllDBOperations obj = new EmployeeAllDBOperations();
        int choice;

        try {
            do {
                System.out.println("\n========= EMPLOYEE MANAGEMENT =========");
                System.out.println("1. Insert Employee");
                System.out.println("2. Update Employee Phone");
                System.out.println("3. Delete Employee");
                System.out.println("4. Fetch All Employees");
                System.out.println("5. Fetch Employee By ID");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {

                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        int sal = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Email: ");
                        String email = sc.nextLine();

                        System.out.print("Enter Phone: ");
                        long phone = sc.nextLong();
                        sc.nextLine();

                        obj.saveEmployee(id, name, sal, email, phone);
                        break;

                    case 2:
                        System.out.print("Enter Employee ID: ");
                        int uid = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter New Phone: ");
                        long newPhone = sc.nextLong();
                        sc.nextLine();

                        obj.updateEmployeePhone(uid, newPhone);
                        break;

                    case 3:
                        System.out.print("Enter Employee ID to delete: ");
                        int did = sc.nextInt();
                        sc.nextLine();
                        obj.deleteEmployeeById(did);
                        break;

                    case 4:
                        obj.fetchAllEmployees();
                        break;

                    case 5:
                        System.out.print("Enter Employee ID: ");
                        int fid = sc.nextInt();
                        sc.nextLine();
                        obj.fetchEmployeeById(fid);
                        break;

                    case 0:
                        System.out.println("👋 Exiting application...");
                        obj.closeConnection();
                        break;

                    default:
                        System.out.println("❌ Invalid choice");
                }

            } while (choice != 0);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}

