package com.qa.seleniumUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DataBaseConnection_MySql {
	
	@Test
	public void testDB() throws ClassNotFoundException, SQLException
	{
		// Load the driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		
		// Create a Connection:
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_tutorial","root","root");
		System.out.println("Connection Established!!");
		
		//Create Statement to Execute Query:
		Statement stmt=con.createStatement();
		System.out.println("Statement created!");
		
		//Execute a query by using ResultSet:
		ResultSet rs=stmt.executeQuery("select * from emp1");
		
		while(rs.next())
		{
			String name=rs.getString("name");
			System.out.println("Records are: "+name);
			
			String city=rs.getString("city");
			System.out.println("Records are: "+city);
		}
		
	}

}
