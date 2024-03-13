import java.awt.*;
import java.awt.event.*;

class Demo implements ActionListener {
Frame f;
TextField t1,t2;
Button btn;
Label l1,l2,l3;
Demo(){
 Font font = new Font("TimesRoman",Font.BOLD,15);
f=new Frame();
f.setBackground(Color.CYAN);

l1=new Label("Enter Email");
l1.setFont(font);
l1.setBounds(20,100,100,40);
f.add(l1);

t1= new TextField();
t1.setBounds(130,100,160,40);
f.add(t1);

l2=new Label("Enter Password");
l2.setFont(font);
l2.setBounds(20,150,100,40);
f.add(l2);

t2=new TextField();
t2.setBounds(130,150,160,40);
f.add(t2);

btn = new Button("click");
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
String s1= t1.getText();
String s2=t2.getText();
if(e.getSource()==btn){
System.out.println(s1+" "+s2);
System.exit(0);
}
}
   public static void main(String[] args){
new Demo();
}}
