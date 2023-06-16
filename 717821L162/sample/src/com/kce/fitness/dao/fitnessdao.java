package com.kce.fitness.dao;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.kce.fitness.bean.gym;
import com.kce.fitness.bean.member;
import com.kce.fitness.util.InvalidMobileNumberException;

public class fitnessdao {
	public static void insertgym(Connection con,gym g)throws Exception {

		Scanner sc=new Scanner(System.in);

		PreparedStatement p=null;

		System.out.print("enter rows");

		

	     int rows=sc.nextInt();

	   

	    	 sc.nextLine();

	     

	     for(int i=0;i<rows;i++) {

	     String name=sc.next();

	    String b=sc.next();

	    int member=sc.nextInt();

	  

			 String query = "INSERT INTO gym (name,branch, no_of_trainers) VALUES (?, ?, ?)";

		        

		         p = con.prepareStatement(query);

		        p.setString(1, name);

			p.setString(2,b);

	       p.setInt(3, member);

	        

	        p.executeUpdate();

	        System.out.println("inserted");

	      

	     

	        p.close();



	}  
	}
	public static void insertmember(Connection con, member m) throws Exception {
	    Scanner sc = new Scanner(System.in);
	    PreparedStatement p = null;

	    System.out.print("Enter rows: ");
	    int rows = sc.nextInt();
	    sc.nextLine();

	    for (int i = 0; i < rows; i++) {
	        System.out.print("Enter member name: ");
	        String name = sc.next();

	        System.out.print("Enter member age: ");
	        int age = sc.nextInt();

	        System.out.print("Enter member mobile number: ");
	        long mobileNumber = sc.nextLong();

	        // Validate the mobile number
	        if (!isValidMobileNumber(mobileNumber)) {
	            throw new InvalidMobileNumberException("Invalid mobile number: " + mobileNumber);
	        }

	        String query = "INSERT INTO members (name, age, mobileNumber) VALUES (?, ?, ?)";
	        p = con.prepareStatement(query);
	        p.setString(1, name);
	        p.setInt(2, age);
	        p.setLong(3, mobileNumber);
	        p.executeUpdate();
	        System.out.println("Inserted successfully");

	        p.close();
	    }
	}

	private static boolean isValidMobileNumber(long mobileNumber) {
	    // Implement your validation logic here
	    // For example, you can check the length or specific pattern for valid mobile numbers
	    // Return true if the mobile number is valid, false otherwise
	    // You can customize this method based on your specific validation requirements
	    return String.valueOf(mobileNumber).matches("[0-9]{10}");
	}

public static void deletemember(Connection con,member m)throws Exception {

	Scanner sc=new Scanner(System.in);

	    String query = "DELETE FROM members WHERE name = ?";

	    PreparedStatement p = con.prepareStatement(query);

	    System.out.println("Enter name to delete=");

	 

	        m.setName(sc.nextLine());

	        p.setString(1, m.getName());

	    

	    p.executeUpdate();

	    p.close();



	    System.out.println("Deleted");
}

public static void deletegym(Connection con,gym g)throws Exception {

	Scanner sc=new Scanner(System.in);

	    String query = "DELETE FROM gym WHERE name = ?";

	    PreparedStatement p = con.prepareStatement(query);

	    System.out.println("Enter name to delete=");

	 

	        g.setName(sc.nextLine());

	        p.setString(1, g.getName());

	    

	    p.executeUpdate();

	    p.close();



	    System.out.println("Deleted");
}

public static void viewgym(Connection con,gym g)throws Exception{

	Statement st=con.createStatement();

	ResultSet rs=st.executeQuery("select *from gym");

	while(rs.next()) {

		System.out.println("name:"+rs.getString(1));

		System.out.println("branch name:"+rs.getString(2));

		System.out.println("no of trainers :"+rs.getInt(3));

	}

}
public static void viewmember(Connection con,member m)throws Exception{

	Statement st=con.createStatement();

	ResultSet rs=st.executeQuery("select *from members");

	while(rs.next()) {

		System.out.println("name:"+rs.getString(1));

		System.out.println("age :"+rs.getInt(2));

		System.out.println("mobile Number :"+rs.getString(3));

	}

}

}