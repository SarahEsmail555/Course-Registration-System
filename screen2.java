package fff;
import javax.swing.JScrollPane;
import javax.swing .JButton;
import javax.swing.JTextArea;
import javax.swing .JLabel;
import javax.swing .JCheckBox;
import java.awt.GridLayout;
import javax.swing .JPanel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.awt.Color;
public class screen2 extends JPanel implements ItemListener
{
	JTextArea t ;
	JLabel l1,l2,l3,l4 ;	 
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16 ;
	JButton backButton = new JButton ("Back");
	
	
screen2(JPanel container,CardLayout maincard)
{

	this.setLayout(new GridLayout(5,5,2,2));
	  t=new JTextArea();
	  JScrollPane sc=new JScrollPane(t);
	  this.add(sc);
  l1=new JLabel("LEVEL 1");	
 l2=new JLabel("LEVEL 2");	
	  l3=new JLabel("LEVEL 3");	
	  l4=new JLabel("LEVEL 4");	
  c1=new JCheckBox("CS");
 c2=new JCheckBox("math");
	  c3=new JCheckBox("programing");
  c4=new JCheckBox("ENGLISH1");

	  c5=new JCheckBox("VISHUAL");
	 c6=new JCheckBox("DATABASE");
  c7=new JCheckBox("MATH2");
	  c8=new JCheckBox("ENGLISH2");

	  c9=new JCheckBox("Datastructure");
  c10=new JCheckBox("HUMANRESOURCES");
	 c11=new JCheckBox("NATURAL RESOURCES");
	  c12=new JCheckBox("MATH3");

  c13=new JCheckBox("CREATIVE");
  c14=new JCheckBox("OS");
	  c15=new JCheckBox("SECURITY");
	  c16=new JCheckBox("ARCHETECTCHER");
		
		this.add(l1);
		this.add(c1);
		this.add(c2);
		this.add(c3);
		this.add(c4);

		this.add(l2);
		this.add(c5);
		this.add(c6);
		this.add(c7);
		this.add(c8);
        
		this.add(l3);
		this.add(c9);
		this.add(c10);
		this.add(c11);
		this.add(c12);

		this.add(l4);
		this.add(c13);
		this.add(c14);
		this.add(c15);
		this.add(c16);

		this.add(sc);
	this.add(backButton);
	c1.addItemListener(this) ;
	c2.addItemListener(this) ;
	c3.addItemListener(this) ;
	c4.addItemListener(this) ;
	c5.addItemListener(this) ;
	c6.addItemListener(this) ;
	c7.addItemListener(this) ;
	c8.addItemListener(this) ;
	c9.addItemListener(this) ;
	c10.addItemListener(this) ;
	c11.addItemListener(this) ;
	c12.addItemListener(this) ;
	c13.addItemListener(this) ;
	c14.addItemListener(this) ;
	c15.addItemListener(this) ;
	c16.addItemListener(this) ;
	backButton.setBackground(Color.green);
	backButton.setForeground(Color.red);
	backButton.addActionListener(new ActionListener() 
	   {
	    public void actionPerformed(ActionEvent e)
	    {
	        maincard.show(container, "screen1");
	    }
	});

	
	
}

public void itemStateChanged(ItemEvent e) 
   {
    JCheckBox selected=(JCheckBox) e.getItemSelectable();
    if(selected.isSelected())
    {
    	 t.append(selected.getText() +"\n");
    }
    
    else
    {
    	String text=t.getText();
    	text=text.replace(selected.getText(), "");
    	t.setText(text);
    	
    }
    
}
}