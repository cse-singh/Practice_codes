/**
 * 
 */
package exp2;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Anmoldeep
 *
 */
public class AddNum extends Applet implements ActionListener{

	TextField tf1 = new TextField(30);
	TextField tf2 = new TextField(30);
	TextField tf3 = new TextField(30);
	
	Label L1 = new Label("Enter No.:");
	Label L2 = new Label("Enter No.:");
	Label L3 = new Label("Addition:");
	
	Button b1 = new Button("Add");
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		add(L1);
		add(tf1);
		add(L2);
		add(tf2);
		add(L3);
		add(tf3);
		b1.addActionListener(this);
		add(b1);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int n1 = Integer.parseInt(tf1.getText());
		int n2 = Integer.parseInt(tf2.getText());
		
		tf3.setText("" + (n1+n2));
	}
//	<applet code= CompDemo.class height=100 width=200></applet>	
}
