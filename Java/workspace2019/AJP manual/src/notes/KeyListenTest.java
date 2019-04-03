/**
 * 
 */
package notes;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Anmoldeep
 *
 */
public class KeyListenTest extends Applet implements KeyListener{
	
	String msg="";
	int x=10, y=20;
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		addKeyListener(this);
		requestFocus();
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		showStatus("Key Down");
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		showStatus("Key up");
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
//		msg += e.getKeyChar(); basic one
		int key = e.getKeyCode();
		
		switch (key) {
		case KeyEvent.VK_F1:
			msg += "F1";
			break;

		case KeyEvent.VK_PAGE_UP:
			msg += "F1";
			break;
		
		case KeyEvent.VK_PAGE_DOWN:
			msg += "F1";
			break;
		
		case KeyEvent.VK_LEFT:
			msg += "F1";
			break;
		
		case KeyEvent.VK_RIGHT:
			msg += "F1";
			break;

		case KeyEvent.VK_UP:
			msg += "F1";
			break;

		case KeyEvent.VK_DOWN:
			msg += "F1";
			break;

		default:
			break;
		}
		
		repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawString(msg, x, y);
	}
	
}
