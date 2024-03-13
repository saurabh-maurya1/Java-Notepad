import javax.swing.*;
import  java.awt.event.*;
import java.awt.*;
class Cal implements ActionListener
{
JFrame frame;
JTextField t1,t2;
JButton btn1,btn2,btn3,btn4;
JLabel l1,l2,l3;
Cal() {
frame = new JFrame();
Font f = new Font("Times New Roman", Font.BOLD,20);
l1= new JLabel("Calculater");
l1.setFont(f);
l1.setBounds(130,50,200,40);
frame.add(l1);

l2 = new JLabel("Enter No:1");
l2.setFont(f);
l2.setBounds(40,100,100,40);
frame.add(l2);
t1= new JTextField();
t1.setBounds(150,100,100,40);
frame.add(t1);

l3= new JLabel("Enter No2");
l3.setFont(f);
l3.setBounds(40,150,100,40);
frame.add(l3);
 t2= new JTextField();
t2.setBounds(150,150,100,40);
frame.add(t2);
btn1= new JButton("+");
btn1.setBounds(130,200,60,30);
frame.add(btn1);
btn2=new JButton("-");
btn2.setBounds(200,200,60,30);
frame.add(btn2);
btn3=new JButton("*");
btn3.setBounds(270,200,60,30);
frame.add(btn3);
btn4=new JButton("/");
btn4.setBounds(340,200,60,30);
frame.add(btn4);

btn1.addActionListener(this);
btn2.addActionListener(this);
btn3.addActionListener(this);
btn4.addActionListener(this);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(500,400);
frame.setLayout(null);
frame.setVisible(true);
}
public void actionPerformed(ActionEvent e){
String s1=t1.getText();
String s2= t2.getText();
int a , b, c=0;
a = Integer.parseInt(s1);
b= Integer.parseInt(s2);

if(e.getSource()==btn1){
c=a+b;

JOptionPane.showMessageDialog(frame,"the sum is "+c);
}
else if(e.getSource()==btn2){
c= a-b;

JOptionPane.showMessageDialog(frame,"the Subs is "+c);
}
else if(e.getSource()==btn3){
c= a*b;

JOptionPane.showMessageDialog(frame,"the Mul is "+c);
}
else if(e.getSource()==btn4){
c=a/b;

JOptionPane.showMessageDialog(frame,"the Div is "+c);
}else {
JOptionPane.showMessageDialog(frame,"Enter Valid Number");
}
}
public static void main(String[] args){
new Cal();
}}