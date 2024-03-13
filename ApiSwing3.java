import javax.swing.*;
class Demo {
 JFrame frame;
Demo (){
frame = new JFrame();
String[][] data = {{"Saurabh","3233243","Google"},
{"Ajay","3233243","Microsoft"},
{"Deepak","3233243","Hcl"},
{"Sumit","3233243","Amazon"},
{"Manish","3233243","Hcl"},
{"Ganesh","3233243","Amazon"},
{"Vikash","3233243","flipkart"}};
String[] col = {"Name","Phone","Company"};
JTable t1= new JTable(data,col);
JScrollPane sp = new JScrollPane(t1);
sp.setBounds(50,100,300,100);
frame.add(sp);

frame.setSize(400,400);
frame.setLayout(null);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args){
new Demo();
}}









