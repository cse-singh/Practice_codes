package com.kogent.jdbc;

import java.sql.*;
/**
* @author Suchita
*/
public class GetData {
public static void main(String args[])throws SQLException, 
ClassNotFoundException {
		//Get Connection
		Connection con=prepareConnection(); 

		// Obtain a Statement
		Statement st=con.createStatement();
		
		String query = "select col3, col1 from mytable";
		
		//Execute the Query
		ResultSet rs=st.executeQuery(query);
		
	
		while (rs.next()){
			System.out.print (rs.getInt(1)+ "\t");
			System.out.println (rs.getString(2));
		}//while
	}//main

	public static Connection prepareConnection()throws 
	SQLException, ClassNotFoundException	{

		String driverClassName="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@192.168.1.123:1521:XE";
		String username="scott";
		String password="tiger";
		
		//Load driver class
		Class.forName(driverClassName);

		// Obtain a connection
		return DriverManager.getConnection(url,username,password);
	}//prepareConnection
}//class
