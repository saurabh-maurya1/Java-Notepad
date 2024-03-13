//JCheckBox
import javax.swing.*;
import java.util.*;
class Demo{
JFrame frame; 
Demo()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your task");
String str1=sc.nextLine();
String str2=sc.nextLine();
String str3=sc.nextLine();
frame = new JFrame();
JCheckBox b1 = new JCheckBox(str1);
b1 . setBounds(100,100,100,50);
frame.add(b1);
JCheckBox b2 = new JCheckBox(str2);
b2.setBounds(100,150,100,50);
frame.add(b2);

JCheckBox b3 = new JCheckBox(str3);
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