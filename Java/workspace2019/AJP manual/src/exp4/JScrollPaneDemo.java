/**
 * 
 */
package exp4;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Anmoldeep
 *
 */
public class JScrollPaneDemo extends JApplet{

	public void init()
	{
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(10, 10));
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				jp.add(new JButton("Button " + (i + j)));
			}
		}
		
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		
		JScrollPane js = new JScrollPane(jp, v, h);
		c.add(jp, BorderLayout.CENTER);
	}
}
