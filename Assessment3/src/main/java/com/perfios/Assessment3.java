package com.perfios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Assessment3 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/worker_management","root","password");
		Scanner sc=new Scanner(System.in);
		int ch=0;
		PreparedStatement preparedStatement = con.prepareStatement("SELECT count(*) FROM information_schema.tables WHERE table_name = ? LIMIT 1;");
		preparedStatement.setString(1,"workerTable");
		ResultSet resultSet = preparedStatement.executeQuery();
		resultSet.next();
		if(resultSet.getInt(1)!=0)
		{

		}
		else {
			PreparedStatement pst=con.prepareStatement("create table workerTable(workerid int,firstname varchar(30),lastname varchar(30),salary double ,joiningdate date,department String)");
			pst.execute();
		}
		while(true)
		{
			System.out.println("1:FullName      2:Departments     3:Position of a");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				FullName fn =new FullName();
				fn.fullName();
				break;

			case 2:
				Departments dt =new Departments();
				dt.departments();
				break;
			case 3:
				PositionA p =new PositionA();
				p.positionA();
				break;
			}
		}
	}
}



