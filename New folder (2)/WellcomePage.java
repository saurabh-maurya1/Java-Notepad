package mypk;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;



class Wel implements ActionListener {
	JFrame f;

	JLabel l4;
	Wel(){
	 Font font = new Font("TimesRoman",Font.BOLD,15);
	 Font font1 = new Font("TimesRoman",Font.BOLD,26);
	f=new JFrame();
	f.setBackground(Color.CYAN);

	l4= new JLabel("***** Welcome ****");
	l4.setFont(font1);
	l4.setBounds(100,100,330,100);
	l4.setBackground(Color.YELLOW);
	l4.setForeground(Color.RED);
	f.add(l4);


	f.setSize(430,430);
	f.setLayout(null);
	f.setVisible(true);

	}
	public void actionPerformed(ActionEvent e){
		
	}}
public class WellcomePage {
public static void main(String[] args) {
	 new Wel();
}
}
