import java.awt.*;
public class mm extends Frame
{
	Menu file,saveas;
	MenuBar mb;
	MenuItem n,open,save,pdf,doc,ppt;
	public mm()
	{
		setVisible(true);
		setSize(50,500);

	mb=new MenuBar();
	file=new Menu("File");
	saveas=new Menu("Save_as");
	n=new MenuItem("New");
	open=new MenuItem("Open");
	save=new MenuItem("Save");
	pdf=new MenuItem(".pdf");
	doc=new MenuItem(".doc");
	ppt=new MenuItem(".ppt");
	mb.add(file);mb.add(saveas);
	file.add(n);file.add(open);file.add(save);file.add(saveas);
	saveas.add(ppt);saveas.add(doc);saveas.add(pdf);
	setMenuBar(mb);
	
	}
	public static void main(String[] args) 
	{
		new mm();
	}
}
