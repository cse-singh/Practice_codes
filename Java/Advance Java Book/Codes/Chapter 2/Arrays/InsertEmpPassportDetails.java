package com.kogent.jdbc;
import java.sql.*;
import java.util.*;
import oracle.sql.*;
/**
 * @author Suchita
 */
public class InsertEmpPassportDetails {
	public static void main(String s[]) throws Exception {
		Driver d= (Driver) ( Class.forName( 
		"oracle.jdbc.driver.OracleDriver").newInstance());
		Properties p=new Properties();
		p.put("user","scott");
		p.put("password","tiger");
		Connection con=d.connect(
		"jdbc:oracle:thin:@192.168.1.123:1521:XE",p);
		PreparedStatement ps=con.prepareStatement(
		"insert into emppassportDetails values(?,?,?)");
		ps.setInt(1,7934);
		ps.setString(2,"12345A134");
		String s1[]={"v1","v2","v3","v4","v5"};
		ArrayDescriptor
ad=ArrayDescriptor.createDescriptor("VISA_NOS",con);
		ARRAY a=new ARRAY(ad,con,s1);
		ps.setArray(3,a);
		int i=ps.executeUpdate();
		System.out.println("Row Inserted, count : "+i);
		con.close();
	}//main
}//class
