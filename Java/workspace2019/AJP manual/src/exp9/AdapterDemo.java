/**
 * 
 */
package exp9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Anmoldeep
 *
 */
public class AdapterDemo extends JApplet {
	@Override
	public void init() {
		// TODO Auto-generated method stub
		addMouseListener(new MyMouseAdapter(this));
		addMouseMotionListener(new MyMouseMotionAdapter(this));
	}
}
