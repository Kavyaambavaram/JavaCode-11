package com.java.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeUtility {
	private static final String driverClass = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/jdbc";
	private static final String username = "root";
	private static final String password = "Kavya@502";
	private static Connection con = null;
	static{
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException{
		if(con==null){
			con = DriverManager.getConnection(url,username,password);
		}
		return con;
	}
	
	public static String addEmployee(Scanner sc) throws SQLException{
		System.out.println("Enter the employeeId");
		int empId = sc.nextInt();
		System.out.println("Enter the employeeName");
		String empName = sc.next();
		System.out.println("Enter the employeeDept");
		String empDept = sc.next();
		
		String sql = "insert into emp(id,name,dept) values(?,?,?)";
		PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
		preparedStatement.setInt(1, empId);
		preparedStatement.setString(2, empName);
		preparedStatement.setString(3, empDept);
		
		int i = preparedStatement.executeUpdate();
		if(i>0){
			return"Employee added successfully";
		}
		return "Something went wrong";
		
	}
	
	public static void getAllEmployee() throws SQLException{
		String sql ="select * from emp";
		Statement stmt = getConnection().createStatement();
		ResultSet resultSet = stmt.executeQuery(sql);
		
		System.out.println("Displaying Employee Details");
		System.out.println("---------------------------------------------------");
		while(resultSet.next()){
			System.out.println("\tEmployeeId   \tEmployeeName     \tDeptName");
			System.out.println("\t"+resultSet.getInt(1)   +"\t"+resultSet.getString(2)   +"\t"+resultSet.getString(3));
		}
	}
	
	
	public static void getEmployeeById(Scanner sc) throws SQLException{
		System.out.println("Enter the id of employee");
		int empid = sc.nextInt();
		String sql = "select * from emp where id=?";
		PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
		preparedStatement.setInt(1, empid);
		ResultSet resultSet = preparedStatement.executeQuery();
		System.out.println("Displaying Employee Details based on Id");
		System.out.println("---------------------------------------------------");
		while(resultSet.next()){
			System.out.println("\tEmployeeId   \tEmployeeName     \tDeptName");
			System.out.println("\t"+resultSet.getInt(1)   +"\t"+resultSet.getString(2)   +"\t"+resultSet.getString(3));
		}
	}
	
	
	public static String updateEmployee(Scanner sc) throws SQLException{
		System.out.println("Enter the empId");
		int empId = sc.nextInt();
		System.out.println("Enter the deptName");
		String deptName = sc.next();
		String sql = "update emp set emp.dept=? where emp.id=?";
		PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
		preparedStatement.setString(1, deptName);
		preparedStatement.setInt(2, empId);
		int i = preparedStatement.executeUpdate();
		if(i>0){
			return "Employee updated successfully";
		}
		return "Something went wrong";
		
	}
	
	public static String deleteEmployee(Scanner sc) throws SQLException{
		System.out.println("Enter the id of employee");
		int empId = sc.nextInt();
		String sql = "delete from emp  where emp.id=?";
		PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
		preparedStatement.setInt(1, empId);
		int i = preparedStatement.executeUpdate();
		if(i>0){
			return "Employee deleted successfully";
		}
		return "Something went wrong";	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
