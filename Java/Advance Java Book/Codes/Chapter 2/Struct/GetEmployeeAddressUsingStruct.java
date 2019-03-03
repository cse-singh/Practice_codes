package com.kogent.jdbc;
import java.sql.*;
import java.util.*;
import java.io.*;
/**
 * @author Suchita
 */
public class GetEmployeeAddressUsingStruct {
	public static void main(String s[]) throws Exception {
		Driver d= (Driver) ( Class.forName(
		"oracle.jdbc.driver.OracleDriver").newInstance());
		Properties p=new Properties();
		p.put("user","scott");
		p.put("password","tiger");
		Connection
con=d.connect("jdbc:oracle:thin:@192.168.1.123:1521:XE",p);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(
		"select permanent_address from personaldetails where empno="+s[0]);
		if (rs.next()){
			System.out.println("Employee Found: Address");
			Struct struct=(Struct)rs.getObject(1);
			Object addr[]=struct.getAttributes();
			System.out.println("Flatno : "+addr[0]);
			System.out.println("Street : "+ addr[1]);
			System.out.println("Pin    : "+addr[4]);
		}//if
		con.close();
	}//main
}//class
