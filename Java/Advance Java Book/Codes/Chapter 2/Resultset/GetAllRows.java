package com.kogent.jdbc;
import java.sql.*;
/**
 * @author Suchita
 */
public class GetAllRows {
	public static void main(String args[])throws 
	SQLException, ClassNotFoundException {
		//Get Connection
		Connection con=prepareConnection(); 
		// Obtain a Statement
		Statement st=con.createStatement();
		String query = "select * from mytable";
		//Execute the Query
		ResultSet rs=st.executeQuery (query);
		System.out.println ("COL1\tCOL2\tCOL3");
	while (rs.next()){
		System.out.print (rs.getString ("COL1") + "\t");
		System.out.print (rs.getInt ("COL2") + "\t");
		System.out.println (rs.getInt("COL3"));
		}//while
		con.close();
	}//main
	public static Connection prepareConnection()
		throws SQLException,
		ClassNotFoundException	{
		String driverClassName="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@192.168.1.123:1521:XE";
		String username="scott";
		String password="tiger";
		//Load driver class
		Class.forName (driverClassName);
		// Obtain a connection
		return DriverManager. getConnection (url, username, password);
	}//prepareConnection
}//class
