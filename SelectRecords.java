package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectRecords {

	public static void main(String[] args) {
		// connection
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mydb";
		String un = "root";
		String pa = "root";
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);// load the driver,here class is the name of class
			conn = DriverManager.getConnection(url, un, pa);
			st = conn.createStatement();
			String sql = "Select * from book";
			rs = st.executeQuery(sql);
			System.out.println("ID\tNAME");
			while (rs.next()) {
				int id = rs.getInt(1);
				String n = rs.getString(2);
				System.out.println(id + "\t" + n);

			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
