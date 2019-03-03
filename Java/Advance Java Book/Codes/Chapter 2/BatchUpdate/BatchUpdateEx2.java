package com.kogent.jdbc;
import java.sql.*;
import java.util.*;
import java.io.*;
/**	
 * @author Suchita
 */
public class BatchUpdateEx2 {
	public static void main(String s[]) throws Exception {
Driver d= (Driver) ( Class.forName("oracle.jdbc.driver.OracleDriver").newInstance());
		Properties p=new Properties();
		p.put("user","scott");
		p.put("password","tiger");
		Connection con=d.connect("jdbc:oracle:thin:@192.168.1.123:1521:XE",p);
 		PreparedStatement ps= con.prepareStatement("insert into emp(empno,sal,deptno) 
 		values(?,?,?)");
		ps.setInt(1,301);
		ps.setDouble(2,1000);
		ps.setInt(3,10);
		ps.addBatch();

		ps.setInt(1,302);
		ps.setDouble(2,2000);
		ps.setInt(3,10);
		ps.addBatch();
		try {
			int counts[]= ps.executeBatch();
			System.out.println("Batch Executed Successfully");
			for (int i=0;i<counts.length;i++){
 			System.out.println("Number of records effected by statement"+(i+1)+": 
 			"+counts[i]);
			}//for
		}//try
		catch(BatchUpdateException e){
 			System.out.println("Batch terminated with an abnormal condition");
			int[] counts=e.getUpdateCounts();
 			System.out.println("Batch terminated at statement"+ (counts.length+1));
			for (int i=0;i<counts.length;i++) {
 			System.out.println("Number of records effected by the statement"+ 
 			(i+1)+":"+counts[i]);
			}//for
		}//catch
		con.close();
	}//main
}//class
