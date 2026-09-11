package fff;
import javax.swing.*;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.*;
import java.util.ArrayList;
public class screen1 extends JPanel
{
	 JButton changeButton= new JButton("Change Background");
	 Color[] colors= {Color.LIGHT_GRAY, Color.PINK, Color.red, Color.YELLOW};
	 int index=0;
	JLabel us=new JLabel ("User Name:");
	JLabel pass=new JLabel ("password:");
	JTextField t=new JTextField ();
	JPasswordField p=new JPasswordField ();
	JButton b1=new JButton ("Save");
	JButton b2=new JButton ("Log In");
	ArrayList<Student> data= new ArrayList<>();
	ImageIcon img = new ImageIcon("logo.png");
	JLabel label = new JLabel(img);
	
	screen1(JPanel container,CardLayout maincard)
	{
		this.setLayout(null);
		this.setBounds(0, 0, 400, 400);
		this.add(us);
		this.add(pass);
		this.add(label);
		label.setBounds(20, 0, 330, 100);
		this.add(t);
		this.add(p);
		this.add(b1);
		this.add(b2);
		this.add(changeButton);
       this.setBackground(colors[index]);
		b1.setBackground(Color.cyan);
		b1.setForeground(Color.red);
		b2.setBackground(Color.cyan);
		b2.setForeground(Color.red);
		changeButton.setBackground(Color.cyan);
		changeButton.setForeground(Color.red);
		
		us.setBounds(40,70,100,100);
		pass.setBounds(50,140,120,40);
		
		t.setBounds(110,110,200,20);
		p.setBounds(110,150,200,20);
		
		b1.setBounds(90,300,100,30);
		b2.setBounds(190,300,100,30);
		changeButton.setBounds(110,280,150,20);
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==b1)
				{
					
					String s1 =t.getText();
					String s2 = p.getText();
					Student x = new Student(s1, s2);
					data.add(x);
		
					System.out.println("username:" + s1);
					System.out.println("password:" + s2);
				}
			
			}	
		});
		b2.addActionListener(new ActionListener()
				{		
		public void actionPerformed(ActionEvent e)
				{
			String input1 = t.getText();
			String input2 =p.getText();
			boolean found=false;
			for(Student  a: data)
			{
				if(a.name.equalsIgnoreCase(input1)&&a.password.equalsIgnoreCase(input2))
				   {
					found=true;
					
			        break;
				   }
			}
			if(found)
			{
				maincard.show(container,"screen2");
			}
				else
			{
				JOptionPane.showMessageDialog(null, "May be Username Or Password is Wrong","Error Message ",JOptionPane.ERROR_MESSAGE);
			}

			}
				
	});
      changeButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) 
          {
              if(index==colors.length-1)
          		index=0;
          	else
          		index++;
              
             setBackground(colors[index]);
		
          }
          });
          
}
}
	

