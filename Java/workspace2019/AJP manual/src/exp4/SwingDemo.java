/**
 * 
 */
package exp4;

import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * @author Anmoldeep
 *
 */
public class SwingDemo extends JApplet{

	@Override
	public void init() {
		// TODO Auto-generated method stub
		Container contentbox  = getContentPane();
		contentbox.setLayout(new GridLayout());
		
		JLabel L1 = new JLabel("Username");
		JLabel L2 = new JLabel("Password");
		JButton J1 = new JButton("Submit");
		JButton J2 = new JButton("Cancel");
		JTextField T1 = new JTextField();
		JTextField T2 = new JTextField();
		
		add(L1);
		add(L2);
		add(T1);
		add(T2);
		add(J1);
		add(J2);
		
		
	}
}
