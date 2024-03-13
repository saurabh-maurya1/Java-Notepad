//JCheckBox
import javax.swing.*;
class Demo{
JFrame frame; 
Demo()
{
frame = new JFrame();
JCheckBox b1 = new JCheckBox("c++");
b1 . setBounds(100,100,100,50);
frame.add(b1);
JCheckBox b2 = new JCheckBox("java");
b2.setBounds(100,150,100,50);
frame.add(b2);

JCheckBox b3 = new JCheckBox("Reat js");
b3.setBounds(100,200,100,50);
frame.add(b3);

frame.setSize(400,400);
frame.setLayout(null);
frame.setVisible(true);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args){
new Demo();
}}