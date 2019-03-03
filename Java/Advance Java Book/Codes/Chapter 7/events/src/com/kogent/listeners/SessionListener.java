package com.kogent.listeners;

import javax.servlet.http.*;
import javax.servlet.*;
import javax.swing.*;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class SessionListener implements HttpSessionListener, HttpSessionAttributeListener
{
   	public void sessionCreated(HttpSessionEvent hse)
   	{
    		JOptionPane.showMessageDialog(null, "Session Created!!!!");
   	}

    	public void sessionDestroyed(HttpSessionEvent hse)
   	{
      		JOptionPane.showMessageDialog(null, "Session Destroyed!!!!");
   	}

    	public void attributeAdded(HttpSessionBindingEvent event) 
	{
		JOptionPane.showMessageDialog(null,"Attribute Added:" + event.getName() + "', '" + event.getValue());
    	}

	public void attributeRemoved(HttpSessionBindingEvent event) 
	{
		JOptionPane.showMessageDialog(null,"Attribute Removed:" + event.getName() + "', '" + event.getValue());
    	}

    	public void attributeReplaced(HttpSessionBindingEvent event) 
	{
		JOptionPane.showMessageDialog(null,"Attribute Replaced:" + event.getName() + "', '" + event.getValue());
    	}
}
