import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
HTML code-
<html>
<head>
<title> Applet Demonstrating Applet and Thread Programming in Java</title>
</head>
<body>
<applet code=FontAnimation.class
height = 800
width = 400>
</applet>
</body>
</html>
*/
public class FontAnimation extends Applet implements ActionListener
{
    private static final long serialVersionUID = 1L;
    TextField text = new TextField(20);
    TextField red = new TextField(20);
    TextField gr = new TextField(20);
    TextField blue = new TextField(20);
    Button b1 = new Button("Apply");
    String str = "Hello";
    int size = 10;
    Font f;
    boolean inc = true;
    int r, g, b;
    Color fColor;

    public void init()
    {
        add(new Label("Enter Text to animate here"));
        add(text);
        text.setText("Hello");
        add(new Label("Enter Value for Red Color here"));
        add(red);
        red.setText("0");
        add(new Label("Enter value for Green Color here"));
        add(gr);
        gr.setText("0");
        add(new Label("Enter value for Blue Color here"));
        add(blue);
        blue.setText("0");
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if ((e.getSource()) == b1)
        {
            str = text.getText();
            if(str == "")
                str = "Hello";
            r = Integer.parseInt(red.getText());
            g = Integer.parseInt(gr.getText());
            b = Integer.parseInt(blue.getText());
            fColor = new Color(r, g, b);
            repaint();
        }
    }

    public void paint(Graphics g)
    {
        f = new Font("Arial", Font.BOLD, size);
        g.setColor(fColor);
        g.setFont(f);
        g.drawString(str, 50, 280);

        try
        {
            Thread.sleep(500);
        }
        catch (Exception e)
        {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }

        if (inc == true) {
            size += 10;
            if(size == 100)
                inc = false;
        }
        else
        {
            size -= 10;
            if(size == 10)
                inc = true;
        }
        repaint();
    }
}