package com.batchProcessing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.JDBC.JDBCConnection;

public class BatchProcessing {
	
	public static void addCars() throws SQLException{
		Connection con = JDBCConnection.getConnection();
		String sql = "insert into car(registrationNumber, modelNumber, user) values (?,?,?)";
		
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		
		preparedStatement.setString(1, "abcde1234");
		preparedStatement.setInt(2, 1234);
		preparedStatement.setString(3, "Harsh");
		
		preparedStatement.addBatch();
		
		preparedStatement.setString(1, "awse4567");
		preparedStatement.setInt(2, 4567);
		preparedStatement.setString(3, "Aman");
		
		preparedStatement.addBatch();
		
		
		
		preparedStatement.setString(1, "kltw7890");
		preparedStatement.setInt(2, 7890);
		preparedStatement.setString(3, "Vishal");
		
		preparedStatement.addBatch();
		
		
       int[] i =preparedStatement.executeBatch();
       System.out.println(i.length+" rows affected");
		
		
	}
	
	public static void main(String[] args) throws SQLException {
		addCars();

	}

}