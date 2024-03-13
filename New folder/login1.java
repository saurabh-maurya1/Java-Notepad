package mypack;

import java.sql.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

	class Login1 implements ActionListener {
		JFrame f;
		JTextField t1;
		JPasswordField t2;
		JButton btn,btn2;
		JLabel l1,l2,l4;
		Login1(){
		 Font font = new Font("TimesRoman",Font.BOLD,15);
		 Font font1 = new Font("TimesRoman",Font.BOLD,26);
		f=new JFrame();
		f.setBackground(Color.CYAN);

		l4= new JLabel("Login Form");
		l4.setFont(font1);
		l4.setBounds(130,20,150,50);
		l4.setBackground(Color.YELLOW);
		l4.setForeground(Color.RED);
		f.add(l4);
		
		l1=new JLabel("Enter Email");
		l1.setFont(font);
		l1.setBounds(20,100,100,40);
		f.add(l1);

		t1= new JTextField();
		t1.setBounds(130,100,160,40);
		f.add(t1);

		l2=new JLabel("Password");
		l2.setFont(font);
		l2.setBounds(20,150,105,40);
		f.add(l2);

		t2=new JPasswordField();
		t2.setBounds(130,150,160,40);
		f.add(t2);

		btn = new JButton("Login");
		btn.setFont(font);
		btn.setBackground(Color.BLACK);
		btn.setForeground(Color.WHITE);
		btn.setBounds(150,200,100,40);
		btn.addActionListener(this);
		f.add(btn);
		
		btn2 = new JButton("Sign_Up");
		btn2.setFont(font);
		btn2.setBackground(Color.BLACK);
		btn2.setForeground(Color.WHITE);
		btn2.setBounds(55,250,300,40);
		btn2.addActionListener(this);
		f.add(btn2);
		

		f.setSize(430,430);
		f.setLayout(null);
		f.setVisible(true);

		}
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==btn2){
				
				new Signup();
			}
			
		if(e.getSource()==btn){

		String s1= t1.getText();
		char[] ch=t2.getPassword();
		String s2=new String(ch);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root","root");
			 String read ="select * from login where name ='"+s1+"' and pass='"+s2+"'" ;
			 PreparedStatement ps = con .prepareStatement(read);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				JOptionPane.showMessageDialog(f,"login SuccessFully");
			
			}else {
			JOptionPane.showMessageDialog(f,"Something went Wrong");
			}
		} catch(Exception ee) {
		     ee.printStackTrace();

		}}}
		public static void main(String[] args) {
			new Login1();
		}
}

