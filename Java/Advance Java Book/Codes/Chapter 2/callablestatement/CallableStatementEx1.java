package com.kogent.jdbc;
import java.sql.*;
/**
 * @author Suchita
 */
public class CallableStatementEx1 {
	public static void main(String s[]) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		Connection con=DriverManager.getConnection(
		"jdbc:oracle:thin:@192.168.1.123:1521:XE","scott","tiger");		
		// Get CallableStatement
		CallableStatement cs= con.prepareCall ("{call
 		createAccount (?,?,?,?,?,?)}");		
		// set IN parameters
		cs.setInt(1, 103);
		cs.setInt(2, 9);
		cs.setString(3, "Neeraj");
		cs.setDouble(4, 10000);
		cs.setString(5, "Delhi");
		cs.setInt(6, 123456789);		
		// register OUT parameters
		//In this procedure example we don’t have OUT parameters 
		//executing the stored procedure
		cs.execute();
		System.out.println("Account Created");		
		con.close();
	}//main
}//class
