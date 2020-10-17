/**
 * 
 */
package com.sp.DBConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author sushmita padhi
 *
 */
public class DBConnector {
	static Connection con;
	
	public static Connection getConnection() throws SQLException ,ClassNotFoundException
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sushmita";
			String user="root";
			String password="SPDXCTech@186";
			con =DriverManager.getConnection(url,user,password);
			System.out.println("completed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
			
}
