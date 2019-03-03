/**
 * 
 */
package exp2;

import java.awt.*;
import java.awt.event.*;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.applet.*;

/**
 * @author Anmoldeep
 *
 */
public class ButtonDemo extends Applet implements ActionListener{

	/**
	 * @param args
	 */
	Button b1,b2,b3;
	String str = new String("No Button Pressed");
	
	public void init() {
		// TODO Auto-generated method stub
		Button b1,b2,b3;
		b1 = new Button("OK");
		b2 = new Button("Cancel");
		b3 = new Button("Exit");
		
		add(b1);
		add(b2);
		add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawString(str, 100, 100);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		str = e.getActionCommand() + " Key Pressed";
		repaint();
	}
//	<applet code= CompDemo.class height=100 width=200></applet>
}
