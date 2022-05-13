package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecordByUser {

	public static void main(String[] args) {
		// connection
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mydb";
		String un = "root";
		String pa = "root";
		Connection conn = null;
		Statement st = null;
		String name = null;
		int id = 0;
		Scanner sc = new Scanner(System.in);
		String ins = null;
		try {
			Class.forName(driver);// load the driver,here class is the name of class
			conn = DriverManager.getConnection(url, un, pa);
			st = conn.createStatement();

			// from here
			while (true) {
				System.out.println("Enter name");
				name = sc.next();
				System.out.println("Enter id");
				id = sc.nextInt();
				ins = "Insert into book values(" + id + ",'" + name + "')";
				int i = st.executeUpdate(ins);
				if (i > 0) {
					System.out.println("Record is inserted seccusfully");

				} else {
					System.out.println("not inserted");
				}
				System.out.println("Do you want to continue yes/no");
				String ch = sc.next();
				if (ch.equalsIgnoreCase("no")) {
					break;

				}
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println("End of the program");
	}
}
