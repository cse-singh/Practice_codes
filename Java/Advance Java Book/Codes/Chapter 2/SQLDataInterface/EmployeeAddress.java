package com.kogent.jdbc;
import java.sql.*;
/**
 * @author Suchita
 */
public class EmployeeAddress implements SQLData {
	public EmployeeAddress(){}
	public void writeSQL(SQLOutput so) throws SQLException {
		so.writeInt(fno);
		so.writeString(street);
		so.writeString(city);
		so.writeString(state);
		so.writeInt(pin);
	}//writeSQL
	public void readSQL(SQLInput si, String name) throws SQLException{
		fno=si.readInt();
		street=si.readString();
		city=si.readString();
		state=si.readString();
		pin=si.readInt();
		typename=name;
	}//readSQL
	public String getSQLTypeName()
	{return typename;}
		public void setFlatno(int i){fno=i;}
	public void setStreet(String s){street=s;}
	public void setCity(String s){city=s;}
	public void setState(String s){state=s;}
	public void setPin(int i){pin=i;}
	public void setTypeName(String s){typename=s;}
	public int getFlatno(){return fno;}
	public String getStreet(){return street;}
	public String getCity(){return city;}
	public String getState(){return state;}
	public int getPin(){return pin;}
	String street,city,state, typename;
	int fno,pin;
}//class
