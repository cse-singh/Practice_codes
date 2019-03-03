package com.kogent.jdbc;
import java.sql.*;
import java.util.*;
/**
 * @author Suchita
 */
public class GetEmpPassportDetails 
{
	public static void main(String s[]) throws Exception 
	{
		Driver d= (Driver) ( Class.forName( 
		"oracle.jdbc.driver.OracleDriver").newInstance());
		Properties p=new Properties();
		p.put("user","scott");
		p.put("password","tiger");
		Connection con=d.connect(
		"jdbc:oracle:thin:@192.168.1.123:1521:XE",p);
		Statement st=con.createStatement();
 		ResultSet rs=st.executeQuery("select passportno, visas_taken from 
 		emppassportDetails where empno="+s[0]);
		if (rs.next())
		{
			System.out.println(
			"\nEmployee Found, His Passport Details are:\n");
			System.out.println("PassportNo:"+rs.getString(1)+"\n");
			System.out.print("Visa's Taken are :\n\t");
			Array a=rs.getArray(2);
			ResultSet rs1=a.getResultSet();
			/*
 			The ResultSet produced here to represent Array value has 2
columns where 
 	1st column represents the element index 2nd column

represents the values
			*/
			boolean flag=rs1.next();
			while(flag) {
				System.out.print(rs1.getString(2));
				flag=rs1.next();
				if (flag)
				System.out.print(",");
			}//while
		}//if
		else
			System.out.println("Employee not Found");
		System.out.println();
		con.close();
	}//main
}//class
