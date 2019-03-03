package com.kogent.tags;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.Date;

public class CustomMessage1 extends SimpleTagSupport
{
	public void doTag() throws JspException,IOException {
	
	JspContext context=getJspContext();
	JspWriter Out=context.getOut();
	Out.println("Welcome!!! You are visting this Web page on"+new Date());
	}
}
