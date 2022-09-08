package com.perfios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Departments {
	public void departments() throws Exception{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/worker_management","root","password");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("SELECT Distinct department FROM workerTable;");
		System.out.println("Distinct Departments" );
		while(rs.next())
		{
			System.out.println(rs.getString(1));
		}
	}

}
