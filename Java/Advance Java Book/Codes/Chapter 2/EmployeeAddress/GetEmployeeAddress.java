package com.kogent.jdbc;
import java.sql.*;
import java.util.*;
import java.io.*;
/**
 * @author Suchita
 */
public class GetEmployeeAddress {
	public static void main(String s[]) throws Exception {
		Driver d= (Driver) ( Class.forName( 
		“oracle.jdbc.driver.OracleDriver”).newInstance());
		Properties p=new Properties();
		p.put(“user”,”scott”);
		p.put(“password”,”tiger”);
		Connection
con=d.connect(“jdbc:oracle:thin:@192.168.1.123:1521:XE”,p);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(
		“select permanent_address from personaldetails where empno=”+s[0]);
		if (rs.next()){
			HashMap map=new HashMap();
			map.put(“EMPADDRESS”, EmployeeAddress.class);
			EmployeeAddress addr=(EmployeeAddress)rs.getObject(1,map);
			System.out.println(“Employee Found Address:”);
			System.out.println(“Flatno : “+addr.getFlatno());
			System.out.println(“Street : “+ addr.getStreet());
			System.out.println(“Pin    : “+addr.getPin());
		}//if
		con.close();
	}//main
}//class
