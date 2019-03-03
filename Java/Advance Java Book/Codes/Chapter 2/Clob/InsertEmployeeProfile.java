package com.kogent.jdbc;
import java.sql.*;
import java.util.*;
import java.io.*;
/**
 * @author Suchita
 */
public class InsertEmployeeProfile {
	public static void main(String s[]) throws Exception {
		Driver d= (Driver) ( Class.forName( 
		"oracle.jdbc.driver.OracleDriver").newInstance());
		Properties p=new Properties();
		p.put("user","scott");
		p.put("password","tiger");
		Connection
con=d.connect("jdbc:oracle:thin:@192.168.1.123:1521:XE",p);
		PreparedStatement ps= con.prepareStatement(
		"insert into empprofiles values(?,?)");	
		ps.setInt(1,Integer.parseInt(s[0]));
		File f=new File(s[1]);
		FileReader fr= new FileReader(f);
		ps.setCharacterStream(2,fr, (int)f.length());
		int i=ps.executeUpdate();
		System.out.println("Record inserted successfully , count : "+i);
		con.close();
	}//main
}//class
