package com.kogent.filter;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletOutputStreamFilter extends ServletOutputStream 
{
    	DataOutputStream datastream;

	public ServletOutputStreamFilter(OutputStream out)
    	{
        	datastream=new DataOutputStream(out);
    	}

	public void write(int num) throws IOException
    	{
        	datastream.write(num);
	}

    	@Override
	public void write(byte[] num) throws IOException
    	{
        	datastream.write(num);
    	}

    	@Override
	public void write(byte[] num, int of, int ln) throws IOException
    	{
        	datastream.write(num, of, ln);
    	}
}

