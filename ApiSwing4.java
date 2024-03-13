import javax.swing.*;
class Demo {
 JFrame frame;
Demo(){
frame = new JFrame();
DefaultListModel<String> l1 = new DefaultListModel<String>();
l1.addElement("Deepak");
l1.addElement("Saurabh");
l1.addElement("Sumit");
l1.addElement("Vikash");
l1.addElement("Akhand");
l1.addElement("Tushar");
JList<String> list= new JList<String>(l1);
list.setBounds(50,100,150,120);
frame.add(list);
frame.setSize(400,400);
frame .setLayout(null);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args){
new Demo();
}}