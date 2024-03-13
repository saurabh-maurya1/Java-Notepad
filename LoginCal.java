import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Demo implements ActionListener {
JFrame f;
JTextField t1;
JPasswordField t2;
JButton btn;
JLabel l1,l2,l3;
Demo(){
 Font font = new Font("TimesRoman",Font.BOLD,15);
f=new JFrame();
f.setBackground(Color.CYAN);

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

btn = new JButton("click");
btn.setFont(font);
btn.setBackground(Color.BLACK);
btn.setForeground(Color.WHITE);
btn.setBounds(130,200,80,40);
btn.addActionListener(this);
f.add(btn);

f.setSize(400,300);
f.setLayout(null);
f.setVisible(true);

}
public void actionPerformed(ActionEvent e){
if(e.getSource()==btn){

String s1= t1.getText();
char[] ch=t2.getPassword();
String s2=new String(ch);
if(s1.equals("Saurabh@gmail.com") && s2.equals("s123")) {
JOptionPane.showMessageDialog(f,"login SuccessFully");
new Test();

} else {
      JOptionPane.showMessageDialog(f,"Something went Wrong");

}}}
   public static void main(String[] args){
new Demo();
}}
