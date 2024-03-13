import javax.swing.*;
class Demo{
JFrame frame;
Demo(){
frame=new JFrame();
JTextArea area = new JTextArea("welcome");
area.setBounds(100,100,200,200);
frame.add(area);
frame.setSize(400,400);
frame.setLayout(null);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}	
public static void main(String[] args){
new Demo();
}}