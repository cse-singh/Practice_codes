package com.kogent.jdbc;
import java.sql.*;
/**
 * @author Suchita
 */
public class PreparedStatementEx1 {
	public static void main(String s[]) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		Connection con= DriverManager.getConnection (
		"jdbc:oracle:thin:@192.168.1.123:1521:XE","scott","tiger");		
		String query="insert into mytable values (?,?,?)";
		//Step1: Get PreparedStatement
		PreparedStatement ps=con.prepareStatement (query);		
		//Step2: set parameters
		ps.setString(1,"abc1");
		ps.setInt(2,38);
		ps.setDouble(3,158.75);		
		//Step3: execute the query
		int i=ps.executeUpdate();
		System.out.println("record inserted count:"+i);
		//To execute the query once again
		ps.setString(1,"abc2");
		ps.setInt(2,39);
		ps.setDouble(3,158.75);		
		i=ps.executeUpdate();
		System.out.println("query executed for the second time count: "+i);
		con.close();
	}//main
}//class
