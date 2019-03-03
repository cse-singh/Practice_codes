/**
 * 
 */
package exp2;

import java.awt.*;
import java.applet.*;

/**
 * @author Anmoldeep
 *
 */
public class BordLayoutDemo  extends Applet{
	
	Button left, right, top, bottom;
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		left = new Button("Left");
		right = new Button("Right");
		top = new Button("Top");
		bottom = new Button("Bottom");
		
		BorderLayout bl = new BorderLayout();
		
		setLayout(bl);
		
		add(left, BorderLayout.EAST);
		add(right, BorderLayout.WEST);
		add(top, BorderLayout.NORTH);
		add(bottom, BorderLayout.SOUTH);
	}
	
//	<applet code= CompDemo.class height=100 width=200></applet>
}
