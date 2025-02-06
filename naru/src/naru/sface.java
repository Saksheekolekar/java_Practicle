package naru;
import java.applet.*;
import java.awt.*;
public class sface extends Applet
{
public void paint(Graphics g)
{
	g.setColor(Color.yellow);
	g.fillOval(700, 200, 600, 640);
	g.setColor(Color.black);
	g.drawOval(700, 200, 600, 640);
	g.drawOval(700, 200, 601, 641);
	g.fillOval(800, 380, 130, 130);
	g.fillOval(1050, 380, 130, 130);
	g.setColor(Color.black);
	g.drawArc(820, 580, 350, 400,30,120);
	g.drawArc(820, 581, 350, 400,30,120);
	g.drawArc(820, 582, 350, 400,30,120);
	g.drawArc(820, 583, 350, 400,30,120);
	g.drawArc(820, 584, 350, 400,30,120);
	g.setColor(Color.WHITE);
	g.fillOval(850, 400, 30, 30);
	g.fillOval(1100, 400, 30, 30);
	g.drawOval(850, 400, 30, 30);
	g.drawOval(1100, 400, 30, 30);



}

}
