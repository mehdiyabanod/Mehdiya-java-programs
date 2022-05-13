package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DbConnect {

	public static void main(String[] args) {
		//Make a connection with database.
		int id;
		String name;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		id=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/mydb";//mydb is mysql database name
		String un="root";
		String pa="root";
		try {
			//load the 
			Class.forName(driver);
			Connection conn=DriverManager.getConnection(url,un,pa);
			Statement st=conn.createStatement();
			
			String ins="insert into book values("+id+",'"+name+"')";
			int i=st.executeUpdate(ins);
			if(i>0) {
				System.out.println("Record inserted");
				}else {
					System.out.println("not inserted");
				}
			
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

}
