/**
 * 
 */
package exp4;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

/**
 * @author Anmoldeep
 * <applet code="ComboDemo11.class height=100 width=200>
 * </applet>
 * 
 */
public class ComboDemo11 extends JApplet{

	@Override
	public void init() {
		// TODO Auto-generated method stub
		Container co = getContentPane();
		co.setLayout(new FlowLayout());
		JComboBox jc = new JComboBox<>();
		
		jc.addItem("Cricket");
		jc.addItem("Football");
		jc.addItem("Hockey");
		jc.addItem("Tennis");
		
		co.add(jc);
	}
}
