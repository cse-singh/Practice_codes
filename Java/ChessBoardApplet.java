import java.applet.*;
import java.awt.*;

public class ChessBoardApplet extends Applet
{
	public void paint(Graphics g)
	{
		//g.drawString("hello world",70,80);

		for(int j=0; j<160;j+=40)
		{
			for(int i=0; i<160; i+=40)
			{
				g.fillRect(i,j+0,20,20);
				g.fillRect(i+20,j+20,20,20);
			}
		}
	}
}