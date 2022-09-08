package com.perfios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class FullName {
	public void fullName() throws Exception{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/worker_management","root","password");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("SELECT concat(FIRSTNAME, LASTNAME) AS FullName FROM workerTable;");
		System.out.println("Full Name" );
		while(rs.next())
		{
			System.out.println(rs.getString(1));
		}
	}

}
