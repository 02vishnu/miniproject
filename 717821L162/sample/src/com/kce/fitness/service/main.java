package com.kce.fitness.service;

import java.sql.Connection;
import java.util.Scanner;

import com.kce.fitness.bean.gym;
import com.kce.fitness.bean.member;
import com.kce.fitness.dao.fitnessdao;
import com.kce.fitness.util.DButil;

public class main {
	public static void main(String [] args) throws Exception {
		Connection con = DButil.getConnection();
		 gym g = new gym(); 
	     member m =new member();
	     Scanner sc=new Scanner(System.in);
	     System.out.println("1:insertgym\n2:insertmember\n3:deletegym\n4:deletemember\n"
	      		+ "5:viewgym\n6:viewmember");
	    
	     int choice = sc.nextInt();
	     switch(choice) {
	     case 1:
	          fitnessdao.insertgym(con,g);
	          break;
	          
	     case 2:
	    	 fitnessdao.insertmember(con,m);
	    	 break;
	    	 
	     
	      case 3:
	    	 fitnessdao.deletegym(con, g);
	    	 break;
	     case 4:
	    	 fitnessdao.deletemember(con, m);
	    	 break;
	     case 5:
	    	 fitnessdao.viewgym(con,g);
	    	 break;
	     case 6:
	    	 fitnessdao.viewmember(con,m);
	    	 break;
	    default :
	    	System.out.println("Enter 1 to 6");
	    	
	    
	}

}
}
