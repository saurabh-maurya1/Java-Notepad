package mypack;
import java.sql.Connection;
import javax.swing.*;
import java.sql.*;

import java.awt.event.*;
import java.sql.DriverManager;
import java.awt.*;
class Forget implements ActionListener
{
JFrame f;
JTextField t1;
JLabel l1,l2,l3;
JButton b1,b2,b3;

JPasswordField t2;
Forget()
{
Font font=new Font("timeRoman",Font.BOLD,13);
f=new JFrame();
f.setBackground(Color.PINK);
l1=new JLabel("Enter Email:-");
l1.setFont(font);
l1.setBounds(20,100,100,40);
f.add(l1);
t1=new JTextField();
t1.setBounds(130,100,160,30);
f.add(t1);

l2=new JLabel("password:-");
l2.setFont(font);
l2.setBounds(20,150,100,40);
f.add(l2);

l3=new JLabel("LOGIN PAGE");
l3.setFont(font);
l3.setForeground(Color.BLUE);
l3.setBounds(160,60,100,30);
f.add(l3);

t2=new JPasswordField ();
t2.setBounds(130,150,160,30);
f.add(t2);


b1=new JButton("LOGIN");
b1.setFont(font);
b1.setBackground(Color.GRAY);
b1.setForeground(Color.RED);
b1.setBounds(130,200,80,40);
f.add(b1);
b1.addActionListener(this);
b2=new JButton("Signup");
b2.setFont(font);
b2.setBackground(Color.GRAY);
b2.setForeground(Color.GREEN);
b2.setBounds(230,200,80,40);
f.add(b2);
b2.addActionListener(this);

b3=new JButton("Forget Password");
b3.setFont(font);
b3.setBackground(Color.GRAY);
b3.setForeground(Color.WHITE);
b3.setBounds(120,260,200,20);
f.add(b3);
b3.addActionListener(this);



f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);

}

public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b3){
		
	}
if(e.getSource()==b1)
{
String s1=t1.getText();
char[] ch=t2.getPassword();
String s2=new String(ch);

try
{
Class.forName("com.mysql.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/saurabh","root","149104");
String read ="select * from user2 where name ='"+s1+"' and pass='"+s2+"'" ;
PreparedStatement ps=con.prepareStatement(read);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
JOptionPane.showMessageDialog(f,"sucsses");
}else {
JOptionPane.showMessageDialog(f,"wrong password");
}}
catch(Exception ee)
{
	ee.printStackTrace();
}}}}
public class Login{
public static void main(String[]agrs)
{
new Forget();
}}
