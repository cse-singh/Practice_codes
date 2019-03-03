package com.kogent.listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.swing.*;

public class ServletContextAttribListener
    implements ServletContextAttributeListener 
{

  	//This method is invoked when an attribute
  	//is added to the ServletContext object
  	public void attributeAdded (ServletContextAttributeEvent scae)
  	{
		JOptionPane.showMessageDialog(null,"Attribute Added!!!!!");
  	}

  	//This method is invoked when an attribute
  	//is removed from the ServletContext object
  	public void attributeRemoved (ServletContextAttributeEvent scae)
  	{
    		JOptionPane.showMessageDialog(null,"Attribute Removed!!!!!");
  	}

  	//This method is invoked when an attribute
  	//is replaced in the ServletContext object
  	public void attributeReplaced (ServletContextAttributeEvent scae)
  	{
		JOptionPane.showMessageDialog(null,"Attribute Replaced!!!!!");
  	}
}
