package naru;
import java.awt.*;
import java.applet.*;

public class lamp extends Applet
{
public void paint(Graphics g)
{
g.drawLine(1201, 448, 1080, 212);
g.drawLine(1202, 448, 1081, 212);
g.drawLine(700, 450, 797, 219);
g.drawLine(699, 450, 796, 219);
g.drawArc(750, 200, 400,100 , 50 , 90);
g.setColor(Color.yellow);
g.fillOval(700, 400, 500, 100);
g.setColor(Color.BLACK);
g.fillRect(700, 700, 500, 100);	
g.drawOval(700, 400, 502, 102);	
g.setColor(Color.gray);
g.fillRect(930, 450, 30, 250);
g.setColor(Color.BLACK);
g.drawRect(930, 450, 30, 250);
}
}
