package com.perfios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PositionA {
	public void positionA() throws Exception{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/worker_management","root","password");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("SELECT firstname, POSITION('a' IN firstname)FROM workerTable");
		System.out.println("FirstName"+"   "+"Position of a" );
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"         "+rs.getInt(2));
		}
	}

}
