
package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecord {

	public static void main(String[] args) {
		// based on id fetch the record
		// Connection
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mydb";
		String un = "root";
		String pa = "root";
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id to delete record");
		int id = sc.nextInt();
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, un, pa);
			st = conn.createStatement();
			String sql = "select * from book where id=" + id;// get only one row
//check id exist
			rs = st.executeQuery(sql);
			if (rs.next()) {// if true record exist
				// delete operation when record exist
				String del = "delete from book where id=" + id;
				int i = st.executeUpdate(del);
				if (i > 0) {
					System.out.println("Record is deleted");
				}

			} // if
			else {
				System.out.println("Record not exist");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
