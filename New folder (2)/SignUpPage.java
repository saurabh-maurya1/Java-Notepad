package mypk;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.*;

class Sign implements ActionListener {
JFrame f;
JTextField t1,t3,t4;
JPasswordField t2;
JButton btn;
JLabel l1,l2,l3,l4,l5;
Sign(){
 Font font = new Font("TimesRoman",Font.BOLD,15);
 Font font1 = new Font("TimesRoman",Font.BOLD,26);

f=new JFrame();
f.setBackground(Color.CYAN);


l4= new JLabel("REGISTER");
l4.setFont(font1);
l4.setBounds(130,20,150,50);
l4.setBackground(Color.YELLOW);
l4.setForeground(Color.RED);
f.add(l4);

l1=new JLabel("Name");
l1.setFont(font);
l1.setBounds(20,100,100,40);
f.add(l1);

t1= new JTextField();
t1.setBounds(130,100,160,40);
f.add(t1);


l2=new JLabel("Email");
l2.setFont(font);
l2.setBounds(20,150,100,40);
f.add(l2);

t3= new JTextField();
t3.setBounds(130,150,160,40);
f.add(t3);
l3=new JLabel("Password");
l3.setFont(font);
l3.setBounds(20,200,105,40);
f.add(l3);

t2=new JPasswordField();
t2.setBounds(130,200,160,40);
f.add(t2);




l4=new JLabel("City");
l4.setFont(font);
l4.setBounds(20,250,100,40);
f.add(l4);

t4= new JTextField();
t4.setBounds(130,250,160,40);
f.add(t4);
btn = new JButton("sign_up");
btn.setFont(font);
btn.setBackground(Color.BLACK);
btn.setForeground(Color.WHITE);
btn.setBounds(150,310,100,40);
btn.addActionListener(this);
f.add(btn);

f.setSize(450,430);
f.setLayout(null);
f.setVisible(true);

}

public void actionPerformed(ActionEvent e){
if((e.getSource()==btn) &&
		(t1.getText().matches("[a-zA-Z0-9]+")
		&&(t2.getText().matches("[a-zA-Z0-9\\W]+")
				&&(t3.getText().matches("[a-zA-Z0-9.@]+")))
		&&(t4.getText().matches("[a-zA-Z0-9]+")))){
	String name,city,email;
	name=t1.getText();
	char[] ch=t2.getPassword();
	String pas = new String(ch);
	city=t4.getText();
	email = t3.getText();
	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/saurabh","root","149104");
		 String insert ="insert into user2(name,email,city,pass)values(?,?,?,?);" ;
		 PreparedStatement ps = con .prepareStatement(insert);
		 ps.setString(1,name);
		 ps.setString(4, pas);
		 ps.setString(2,email);
		 ps.setString(3, city);
		 int i=ps.executeUpdate();
		if(i>0) {
			JOptionPane.showMessageDialog(f,"Sign_up SuccessFully");
			new LoginForm();
		}
	} catch(Exception ee) {
	     ee.printStackTrace();

	}

new LoginForm();


} else {
      JOptionPane.showMessageDialog(f,"Something went Wrong");

}}}
public class SignUpPage {
public static void main(String[] args) {
new Sign();	
}
}
