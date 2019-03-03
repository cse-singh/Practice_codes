package com.kogent.jdbc;
import java.sql.*;
import java.util.*;
import java.io.*;
/**
 * @author Suchita
 */
public class InsertPersonalDetails {
public static void main(String s[]) throws Exception {
		Driver d= (Driver) ( Class.forName( 
		"oracle.jdbc.driver.OracleDriver").newInstance());
		Properties p=new Properties();
		p.put("user","scott");
		p.put("password","tiger");
		Connection
con=d.connect("jdbc:oracle:thin:@192.168.1.123:1521:XE",p);
		PreparedStatement ps= con.prepareStatement( 
 		"insert into personaldetails(empno,photo,permanent_address)
values(?,?,?)");
		/*
 		Here we consider Present Address is same as Permanent Address, so
we want to 
 		insert null in place of Present Address
		*/
		ps.setInt(1,7934);
		File f=new File("MyImage.gif");
		FileInputStream fis= new FileInputStream(f);
		ps.setBinaryStream(2,fis, (int)f.length());
		EmployeeAddress addr=new EmployeeAddress();
		addr.setFlatno(106);
		addr.setCity("Hyd");
		addr.setStreet("SRN");
		addr.setPin(5000049);
		addr.setState("AP");
		addr.setTypeName("EMPADDRESS");
		ps.setObject(3,addr);
		int i=ps.executeUpdate();
 		System.out.println("Personal Details of employee 7934 inserted
successfully");
		con.close();
	}//main
}//class
