package com.kogent;

public class RegForm implements java.io.Serializable 
{
	private String uname, pass, repass, email, fn, ln, address;

	public void setUserName(String s){uname=s;}
	public void setPassword(String s){pass=s;}
	public void setRePassword(String s){repass=s;}
	public void setEmail(String s){email=s;}
	public void setFirstName(String s){fn=s;}
	public void setLastName(String s){ln=s;}
	public void setAddress(String s){address=s;}

	public String getUserName(){return uname;}
	public String getPassword(){return pass;}
	public String getRePassword(){return repass;}
	public String getEmail(){return email;}
	public String getFirstName(){return fn;}
	public String getLastName(){return ln;}
	public String getAddress(){return address;}
}//class
