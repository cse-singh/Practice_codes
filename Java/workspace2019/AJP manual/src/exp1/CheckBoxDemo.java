/**
 * 
 */
package exp1;

import java.awt.*;
import java.applet.*;

/**
 * @author Anmoldeep
 *
 */
public class CheckBoxDemo extends Applet{
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		Checkbox c1,c2,c3,c4;
		CheckboxGroup via = new CheckboxGroup();
		
		c1 = new Checkbox("Hello");
		c2 = new Checkbox("World");
		c3 = new Checkbox("By Java", via, false);
		c4 = new Checkbox("By Applet", via, false);
		
		add(c1);
		add(c2);
		add(c3);
		add(c4);
	}
//	<applet code= CompDemo.class height=100 width=200></applet>
}
