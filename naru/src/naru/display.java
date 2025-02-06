package naru;

import java.awt.*;
import java.applet.*;
public class display extends Applet
{
public void paint(Graphics g)
{
Image img=getImage(getDocumentBase(),"hakuna matata.jpg");
g.drawImage(img,150,150,this);
}
}