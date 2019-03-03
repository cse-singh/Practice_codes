package com.kogent.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.FilterConfig;
import javax.swing.*;

public class MsgFilter extends MyGenericFilter
{
	private FilterConfig filterConfig = null;	    

	public void init(FilterConfig config)
    	{
        	this.filterConfig = config;
    	}

	public void doFilter(final ServletRequest req,final ServletResponse res, FilterChain chain) throws java.io.IOException, javax.servlet.ServletException
	{
		System.out.println("Entering Filter");
		JOptionPane.showMessageDialog(null," Entering Filter!");
		String message=filterConfig.getInitParameter("message");
		req.setAttribute("message",message);
		chain.doFilter(req,res);
		System.out.println("Exiting Filter");
		JOptionPane.showMessageDialog(null," Exiting Filter!");
    	}
}
