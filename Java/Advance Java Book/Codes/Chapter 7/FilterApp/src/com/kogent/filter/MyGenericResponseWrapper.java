package com.kogent.filter;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyGenericResponseWrapper extends HttpServletResponseWrapper
{
	private ByteArrayOutputStream outstream;
    	private int contentLen;
    	private String contentTyp;

	public MyGenericResponseWrapper(HttpServletResponse res)
    	{
        	super(res);
        	outstream = new ByteArrayOutputStream();
    	}

    	@Override
	public ServletOutputStream getOutputStream()
    	{
        	return new ServletOutputStreamFilter(outstream);
    	}

	public byte[] getData()
    	{
        	return outstream.toByteArray();
    	}

  	@Override
	public PrintWriter getWriter()
  	{
    		return new PrintWriter(getOutputStream(), true);
  	}

    	@Override
	public void setContentType(String type)
    	{
        	this.contentTyp = type;
        	super.setContentType(type);
    	}
    	
	@Override
	public String getContentType()
    	{
        	return this.contentTyp;
    	}
    	
	public int getContentLength()
    	{
        	return contentLen;
    	}
    	@Override
	public void setContentLength(int len)
    	{
        	this.contentLen=len;
		super.setContentLength(len);
    	}
}


