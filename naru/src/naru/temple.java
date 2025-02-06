package naru;
import java.awt.*;
import java.applet.*;
public class temple extends Applet
{
public void paint(Graphics g)
{
g.drawLine(900,80,900,200);
g.drawLine(700,500,900,200);
g.drawLine(1100,500,900,200);
g.setColor(Color.red);
g.drawLine(900,80,1000,100);
g.drawLine(1000,100,920,120);
g.drawLine(1010,160,920,120);
g.drawLine(1010,160,900,160);
g.setColor(Color.ORANGE);
g.fillRect(700,500, 400, 420);
g.setColor(Color.GRAY);
g.fillRect(850,710, 100, 210);
g.fillRect(650,500, 500, 40);
}
}
