import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Login implements ActionListener
{
	JFrame f =new JFrame("Login Window");
	Container c;
	JLabel userlabel=new JLabel("User Name:");
	JLabel passlabel=new JLabel("Password  :");
	JTextField user_tf=new JTextField();
	JPasswordField pass_pf=new JPasswordField();
	JButton login_btn=new JButton("Login");
	
	
	Login()
	{
		c=f.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.pink);
		
		userlabel.setBounds(20,200,200,15);
		passlabel.setBounds(20,250,100,15);
		user_tf.setBounds(110,195,160,25);
		pass_pf.setBounds(110,240,160,25);
		login_btn.setBounds(110,290,80,25);
		
		c.add(userlabel);
		c.add(passlabel);
		c.add(user_tf);
		c.add(pass_pf);
		c.add(login_btn);

		login_btn.addActionListener(this);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,600);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==login_btn)
		{
			String username=user_tf.getText();
			String password=pass_pf.getText();
			if(username.equals("bharath") && password.equals("954"))
			{
				f.setVisible(false);
				MainFrame mf=new MainFrame();	
			}
			else
			{
			JOptionPane.showMessageDialog(null, "username or password is wrong!!");
			}
		}
	}
}

class MainFrame implements ActionListener
{
	JFrame f1 =new JFrame("Main Window");
	Container c1;
	static JTextField t1,t2,t3;
	JRadioButton a11,b11,c11,d11;
	JRadioButton a22,b22,c22,d22;
	JRadioButton a33,b33,c33,d33;
	JRadioButton a44,b44,c44,d44;
	JRadioButton a55,b55,c55,d55;
	JButton b1,b2;
	JLabel l11,l1,l2,l3,lq1,lq2,lq3,lq4,lq5;
	int res=0;
	MainFrame()
	{
	
		c1=f1.getContentPane();
		c1.setLayout(null);
		c1.setBackground(Color.orange);
		l11=new JLabel("WELCOME TO THE ONLINE TEST");
		l11.setBounds(300,10,800,25);
		Font f8=new Font("Arial",Font.BOLD,20);
		l11.setFont(f8);
                l11.setForeground(Color.blue);
		
		l1=new JLabel("Name:");
		l1.setBounds(10,30,60,40);

		t1=new JTextField(20);
		t1.setBounds(58,40,150,20);

		l2=new JLabel("ID:");
		l2.setBounds(10,60,60,40);

		t2=new JTextField();
		t2.setBounds(58,70,150,20);

		l3=new JLabel("RESULT:");
		l3.setBounds(10,560,60,40);

		t3=new JTextField();
		t3.setBounds(58,570,150,20);
		
		lq1=new JLabel("1)Which of these keyword must be used to inherit a class!");
		lq1.setBounds(10,160,400,40);

		a11=new JRadioButton("super");
		a11.setBounds(10,200,140,20);

		b11=new JRadioButton("this");
		b11.setBounds(150,200,120,20);

		c11=new JRadioButton("extent");
		c11.setBounds(270,200,120,20);

		d11=new JRadioButton("extends");
		d11.setBounds(390,200,90,20);

		ButtonGroup q1=new ButtonGroup();
		q1.add(a11);
		q1.add(b11);
		q1.add(c11);
		q1.add(d11);

 		lq2=new JLabel("2)Which  keywords does not allow Method overriding?");
		lq2.setBounds(10,230,400,40);

		a22=new JRadioButton("static");
		a22.setBounds(10,270,140,20);

		b22=new JRadioButton("constant");
		b22.setBounds(150,270,120,20);

		c22=new JRadioButton("protected");
		c22.setBounds(270,270,120,20);

		d22=new JRadioButton("final");
		d22.setBounds(390,270,90,20);
		
		ButtonGroup q2=new ButtonGroup();
		q2.add(a22);
		q2.add(b22);
		q2.add(c22);
		q2.add(d22);

		lq3=new JLabel("3)Which of these methods are used to register a keyboard event listener?");
		lq3.setBounds(10,300,400,40);

		a33=new JRadioButton("KeyListener()");
		a33.setBounds(10,340,140,20);

		b33=new JRadioButton("addKistener()");
		b33.setBounds(150,340,120,20);

		c33=new JRadioButton("addKeyListener()");
		c33.setBounds(270,340,120,20);

		d33=new JRadioButton("eventKeyboardListener()");
		d33.setBounds(390,340,90,20);
		
		ButtonGroup q3=new ButtonGroup();
		q3.add(a33);
		q3.add(b33);
		q3.add(c33);
		q3.add(d33);

		lq4=new JLabel("3)Event class is defined in which of these libraries?");
		lq4.setBounds(10,370,400,40);

		a44=new JRadioButton("java.io");
		a44.setBounds(10,410,140,20);

		b44=new JRadioButton("java.lang");
		b44.setBounds(150,410,120,20);

		c44=new JRadioButton("java.net");
		c44.setBounds(270,410,120,20);

		d44=new JRadioButton("java.util");
		d44.setBounds(390,410,90,20);
		
		ButtonGroup q4=new ButtonGroup();
		q4.add(a44);
		q4.add(b44);
		q4.add(c44);
		q4.add(d44);

		lq5=new JLabel("5)Which of these class is super class of all the events?");
		lq5.setBounds(10,440,400,40);

		a55=new JRadioButton("EventObject");
		a55.setBounds(10,480,140,20);

		b55=new JRadioButton("EventClass");
		b55.setBounds(150,480,120,20);

		c55=new JRadioButton("ActionEvent");
		c55.setBounds(270,480,120,20);

		d55=new JRadioButton("ItemEvent");
		d55.setBounds(390,480,90,20);
		
		ButtonGroup q5=new ButtonGroup();
		q5.add(a55);
		q5.add(b55);
		q5.add(c55);
		q5.add(d55);


		b1=new JButton("Submit");
		b1.setBounds(210,520,85,20);

		b2=new JButton("Logout!");
		b2.setBounds(10,620,80,20);
		

		b1.addActionListener(this);
		b2.addActionListener(this);

               	c1.add(l11);
		c1.add(l1);
		c1.add(l2);
		c1.add(l3);
		c1.add(lq1);
		c1.add(lq2);
		c1.add(lq3);
		c1.add(lq4);
		c1.add(lq5);
		c1.add(b1);
		c1.add(b2);
		c1.add(t1);
		c1.add(t2);
		c1.add(t3);
		c1.add(a11);
		c1.add(b11);
		c1.add(c11);
		c1.add(d11);
		c1.add(a22);
		c1.add(b22);
		c1.add(c22);
		c1.add(d22);
		c1.add(a33);
		c1.add(b33);
		c1.add(c33);
		c1.add(d33);
		c1.add(a44);
		c1.add(b44);
		c1.add(c44);
		c1.add(d44);
		c1.add(a55);
		c1.add(b55);
		c1.add(c55);
		c1.add(d55);

		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setSize(1100,700);
		f1.setLocationRelativeTo(null);
		f1.setResizable(false);	
 
             
	}

	public void actionPerformed(ActionEvent e)
	{
		res=0;
		if(e.getSource()==this.b1)
		{
			if(d11.isSelected())
			{
				res=res+20;
			}
			if(d22.isSelected())
			{
				res=res+20;
			}
			if(c33.isSelected())
			{
				res=res+20;
			}
			if(d44.isSelected())
			{
				res=res+20;
			}
			if(a55.isSelected())
			{
				res=res+20;
			}

			this.t3.setText(Integer.toString(res));
			 
			try
			{
    	
				String dname,did,dres;
				dname=MainFrame.t1.getText();
				did=MainFrame.t2.getText();
				dres=MainFrame.t3.getText();
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost/login1";
				String user="root";
				String password="Kittu954@";
				Connection con=DriverManager.getConnection(url,user,password);
				Statement s=con.createStatement();
				String sql = "INSERT INTO data (name,id,result)" + "VALUES (?, ?, ?)";
				PreparedStatement preparedStatement = con.prepareStatement(sql);
				preparedStatement.setString(1, dname);
				preparedStatement.setString(2, did);
				preparedStatement.setString(3, dres);
				preparedStatement.executeUpdate();
				JOptionPane.showMessageDialog(null, "Success!!");
	
			}
	
			catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null, e1);	   
			}	
		}
		if(e.getSource()==this.b2)
		{
		f1.setVisible(false);
		Login l=new Login();
		}
		
}
	
}

public class Test1
{
	public static void main(String arg[])
	{
		Login l=new Login();
	}
}					