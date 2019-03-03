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
public class MyMouseMotionAdapter extends MouseMotionAdapter{
	
	AdapterDemo adapterDemo;
	
	public MyMouseMotionAdapter(AdapterDemo adapterDemo) {
		// TODO Auto-generated constructor stub
		this.adapterDemo = adapterDemo;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		adapterDemo.showStatus("Mouse Dragged");
	}
}
