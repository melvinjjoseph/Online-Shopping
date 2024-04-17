package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect 
{

	private static Connection conn = null;
	
	public static Connection getConn()
	{
		try {
			
			// Class.forName("org.sqlite.JDBC");
			Class.forName("com.mysql.cj.jdbc.Driver");
		//	conn = DriverManager.getConnection("jdbc:sqlite:mydatabase.db");
			// conn = DriverManager.getConnection("jdbc:sqlite:D:/Melvin/PESU/6th sem/Ecomm/EcommerceApp/EcommerceApp/mydatabase.db");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EcommerceApp","root","246810");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return conn;
	}
	
}
