package fff;
import java.awt.*;

import javax.swing.*;
public class frame extends JFrame
{
 CardLayout maincard=new CardLayout();
 JPanel container=new JPanel(maincard);
 
 screen1 s1=new screen1(container,maincard);
 screen2 s2= new screen2( container, maincard);
public frame()

{

	this.setTitle("Course Registration System");
	this.setSize(400,400);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	container.add(s1,"screen1");
	JScrollPane s4=new JScrollPane (s2);
	container.add(s4, "screen2");
	this.add(container);
	this.setResizable(false);
	this.setVisible(true);
	
}
}