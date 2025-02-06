package naru;
import java.applet.*;
import java.awt.*;
public class face extends Applet
{
public void paint(Graphics g)
{
	g.setColor(Color.yellow);
	g.fillOval(700, 200, 600, 640);
	g.setColor(Color.black);
	g.drawOval(700, 200, 600, 640);
	g.setColor(Color.black);
	g.fillOval(800, 330, 100, 150);
	g.fillOval(1050, 330, 100, 150);
	g.setColor(Color.RED);
	g.fillArc(790, 380, 420, 400,180,180);
	g.setColor(Color.black);
	g.drawArc(790, 380, 420, 400,180,180);
	g.setColor(Color.WHITE);
	g.fillRect(793, 577, 416,30);
	g.fillOval(850, 360, 30, 50);
	g.fillOval(1100, 360, 30, 50);

}

}
