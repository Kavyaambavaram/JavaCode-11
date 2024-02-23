package com.java.JDBC;

import java.sql.SQLException;

public class DeleteData {
	public static String deleteData(int id) throws SQLException {
		String sql = "delete from student where studentId="+id;
		int  i = JDBCConnection.getConnection().createStatement().executeUpdate(sql);
		if(i>0) {
			return "data deleted successfully";
		}
		return "Something went wrong";
	}

	public static void main(String[] args) throws SQLException {
		System.out.println(deleteData(2));
         ReadData.readAll();
	}

}
