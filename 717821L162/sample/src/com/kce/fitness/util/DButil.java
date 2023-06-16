package com.kce.fitness.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DButil  {
	public static Connection con;
	public static Connection getConnection() {
		try {
			if(con==null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Yeahbruh!123");
			}
			System.out.println("connected");
			}catch(Exception e) {
			e.printStackTrace();
			}
			return con;
			}
			}
