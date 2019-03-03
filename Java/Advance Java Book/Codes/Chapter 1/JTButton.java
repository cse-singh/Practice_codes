//A toggle button with start and stop images
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class JTButton extends JFrame implements ActionListener
{
	//vars
	JToggleButton but;
	ImageIcon img1;
  
	JTButton()
	{
		//create content pane with flow layout
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
  
		//image with start signal 
		img1 = new ImageIcon("start.jpg");

		//create toggle button with start image
		but = new JToggleButton("Start/Stop", img1);

		//add button to content pane
		c.add(but);

		//add action listener to button
		but.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) 
	{
		//image with stop signal 
		ImageIcon img2 = new ImageIcon("stop.jpg");

		//if toggle button is selected display stop signal image 
		//else display start signal image
		if(but.isSelected())
		but.setIcon(img2);
		else but.setIcon(img1);
   
	}

	public static void main(String args[])
	{
		//create the frame
		JTButton demo = new JTButton();
		demo.setSize(400,400);
		demo.setVisible(true);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
