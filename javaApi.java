  import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Cal implements ActionListener {
   JFrame  frame;
   JTextField t1, t2;
JButton btn;
JLabel l1, l2 , l3;
Cal(){
  frame = new JFrame();
Font f = new Font("Times New Roman ", Font.BOLD, 20);
l1=new JLabel("Calculator");
l1.setFont(f);
l1.setBounds(130,50,200,40);
frame.add(l1);

l2=new JLabel("Enter No:1");
l2.setFont(f);
l2.setBounds(40,100,100,40);
frame.add(l2);

t1 = new JTextField();
t1.setBounds(150,100,100,40);
frame.add(t1);

l3=new JLabel("Enter No:2");
l3.setFont(f);
l3.setBounds(40,150,100,40);
frame.add(l3);

t2=new JTextField();
t2.setBounds(150,150,100,40);
frame.add(t2);

btn=new JButton("+");
btn.addActionListener(this);
btn.setBounds(170,200,60,30);
frame.add(btn);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(400,400);
frame.setLayout(null);
frame.setVisible(true);
}
public void actionPerformed(ActionEvent e){
int a, b, c = 0;
if(e.getSource()==btn){
String s1 = t1.getText();
String s2 = t2.getText();

a = Integer.parseInt(s1);
b= Integer.parseInt(s2);
c=a+b;
}JOptionPane.showMessageDialog(frame,"this sum is :"+c);
}

public static void main(String[] args) {
new Cal();
}}

