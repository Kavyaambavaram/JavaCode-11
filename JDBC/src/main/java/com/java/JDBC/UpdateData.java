package com.java.JDBC;

import java.sql.SQLException;

public class UpdateData {
	public static String updateData(int id) throws SQLException {
		String sql = "Update student set studentName='Krithika' where studentId="+id;
		int  i = JDBCConnection.getConnection().createStatement().executeUpdate(sql);
		if(i>0) {
			return "data updated successfully";
		}
		return "Something went wrong";
	}

	public static void main(String[] args) throws SQLException {
		System.out.println(updateData(2));
		ReadData.readAll();
	}

}
