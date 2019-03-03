package com.kogent.jdbc;
import java.sql.*;
import java.util.*;
import java.io.*;
/**
 * @author Suchita
 */
public class TransferAmount {
	public static void main(String s[]) throws Exception {
		Driver d= (Driver) ( Class.forName( 
		"oracle.jdbc.driver.OracleDriver").newInstance());
		Properties p=new Properties();
		p.put("user","scott");
		p.put("password","tiger");
Connection con=d.connect("jdbc:oracle:thin:@192.168.1.123:1521:XE",p);
		con.setAutoCommit(false);
		String srcaccno=s[0];
		String destaccno=s[1];
		PreparedStatement ps= con.prepareStatement(
		"update bank set bal=bal+? where accno=?");
		ps.setInt(1,500);
		ps.setString(2,destaccno);
		int i=ps.executeUpdate();
		ps.setInt(1,-500);
		ps.setString(2,srcaccno);
		int j=ps.executeUpdate();
		if (i==1&&j==1){
			con.commit();
			System.out.println("Amount transfered");
			con.close();
			return;
		}
		con.rollback();
		System.out.println("Cannot transfer the amount");
		con.close();
	}//main
}//class
