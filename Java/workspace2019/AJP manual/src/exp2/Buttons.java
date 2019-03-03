/**
 * 
 */
package exp2;

import java.applet.*;
import java.awt.*;

/**
 * @author Anmoldeep
 *
 */
public class Buttons extends Applet{

	@Override
	public void init() {
		// TODO Auto-generated method stub
		Button b1 = new Button("B1");
		Button b2 = new Button("B2");
		Button b3 = new Button("B3");
		Button b4 = new Button("B4");
		Button b5 = new Button("B5");
		
		setLayout(new GridLayout());
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
	}
//	<applet code= CompDemo.class height=100 width=200></applet>
}
