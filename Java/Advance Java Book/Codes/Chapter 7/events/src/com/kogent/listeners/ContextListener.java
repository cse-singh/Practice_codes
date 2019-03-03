package com.kogent.listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.swing.*;

public class ContextListener implements ServletContextListener
{
	private ServletContext cont=null;
	
	public void contextInitialized(ServletContextEvent evt)
	{         
		this.cont = evt.getServletContext();
		System.out.println("Context intialized.........!!!!!");
		JOptionPane.showMessageDialog(null,"Context intialized.........!!!!!");
	}

	public void contextDestroyed(ServletContextEvent evt) 
         {
		System.out.println("Context destroyed.........!!!!!");	
		JOptionPane.showMessageDialog(null,"Context destroyed.........!!!!!");
		this.cont=null;
         }
}