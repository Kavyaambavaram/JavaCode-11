package com.java.JDBC;

import java.sql.Connection;
import java.sql.Statement;

public class TableCreation {
	public static String createTable() {
		try {
			String sql = "CREATE TABLE student1 ("
		            + "studentId INT(10) PRIMARY KEY AUTO_INCREMENT, "
		            + "studentName VARCHAR(10) NOT NULL, "
		            + "courseEnrolled VARCHAR(20) NOT NULL)";

		Connection con=JDBCConnection.getConnection();
		if(con!=null) {
			Statement stmt = con.createStatement();
			stmt.execute(sql);
			return "Table created successfully";
		}
		}catch(Exception e) {
			e.printStackTrace();
		}return "Something went wrong";
	}

	public static void main(String[] args) {
		System.out.println(createTable());

	}

}
