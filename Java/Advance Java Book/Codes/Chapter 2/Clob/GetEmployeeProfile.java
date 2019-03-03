package com.kogent.jdbc;
import java.sql.*;
import java.util.*;
import java.io.*;
/**
 * @author Suchita
 */
public class GetEmployeeProfile {
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
		"select profile from empprofiles where empno="+s[0]);
		while (rs.next()) {
			Reader r=rs.getCharacterStream(1);
			FileWriter fw=new FileWriter("ProfileOf"+s[0]+".doc");
			int i=r.read();
			while (i!=-1){
				fw.write(i);
				i=r.read();
			}//while
		}//while
		System.out.println("Profile retrieved");
		con.close();
	}//main
}//class
