package com.kogent.filter;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FilterPrePost extends MyGenericFilter
{
	public void doFilter(final ServletRequest req, final ServletResponse res, 	FilterChain chain) throws IOException, ServletException
	{
        	OutputStream outstream = res.getOutputStream();
        	outstream.write("<HR>PRE<HR>".getBytes());

        	MyGenericResponseWrapper wrap = new MyGenericResponseWrapper((HttpServletResponse) res);
        	chain.doFilter(req, wrap);
        	outstream.write(wrap.getData());
        	outstream.write("<HR>POST<HR>".getBytes());
        	outstream.close();
    	}
}
