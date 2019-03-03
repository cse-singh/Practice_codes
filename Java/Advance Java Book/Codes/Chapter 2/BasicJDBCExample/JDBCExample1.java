package com.kogent.jdbc;
import java.sql.*;
public class JDBCExample1 {
	public static void main(String args[])
	throws SQLException, ClassNotFoundException {
		String driverClassName="sun.jdbc.odbc.JdbcOdbcDriver";
		String url="jdbc:odbc:XE";
		String username="scott";
		String password="tiger";
		String query = "insert into students values (101, \'Kumar\')";
		//Load driver class 
		Class.forName (driverClassName);
		// obtain a connection
		Connection con=DriverManager. getConnection
		(url, username, password);
		// Obtain a Statement
		Statement st=con. createStatement();
		//Execute the Query
		int count=st.executeUpdate (query);
 		System.out.println ("Number of rows effected by this query = "+count);
		// Closing the connection as our requirement with connection is 
 		//completed
		con.close();
	}//main
}//class
