//
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Stack;

class Test implements ActionListener {
    JFrame frame;
    JTextField t;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10,
            btn11, btn12, btn13, btn14, btn15,
            btn16, btn17, btn18;
    JLabel l1;
    static int op;
    static double a, b, res = 0;

    Test() {
        frame = new JFrame();
        Font f1 = new Font("Times New Roman", Font.BOLD, 35);
        Font f = new Font("Times New Roman", Font.BOLD, 20);
        l1 = new JLabel("Calculater");
        l1.setFont(f1);
        l1.setBounds(110, 50, 200, 40);
        frame.add(l1);
        t = new JTextField();
        t.setFont(f);
        t.setBounds(52, 140, 270, 70);
        frame.add(t);

        btn1 = new JButton("7");
        btn1.setBounds(52, 220, 60, 30);
        frame.add(btn1);
        btn2 = new JButton("8");
        btn2.setBounds(122, 220, 60, 30);
        frame.add(btn2);
        btn3 = new JButton("9");
        btn3.setBounds(192, 220, 60, 30);
        frame.add(btn3);
        btn4 = new JButton("+");
        btn4.setBounds(262, 220, 60, 30);
        frame.add(btn4);

        btn5 = new JButton("6");
        btn5.setBounds(52, 270, 60, 30);
        frame.add(btn5);
        btn6 = new JButton("5");
        btn6.setBounds(122, 270, 60, 30);
        frame.add(btn6);
        btn7 = new JButton("4");
        btn7.setBounds(192, 270, 60, 30);
        frame.add(btn7);
        btn8 = new JButton("-");
        btn8.setBounds(262, 270, 60, 30);
        frame.add(btn8);

        btn9 = new JButton("3");
        btn9.setBounds(52, 320, 60, 30);
        frame.add(btn9);
        btn10 = new JButton("2");
        btn10.setBounds(122, 320, 60, 30);
        frame.add(btn10);
        btn11 = new JButton("1");
        btn11.setBounds(192, 320, 60, 30);
        frame.add(btn11);
        btn12 = new JButton("*");
        btn12.setBounds(262, 320, 60, 30);
        frame.add(btn12);

        btn13 = new JButton("0");
        btn13.setBounds(52, 370, 60, 30);
        frame.add(btn13);
        btn14 = new JButton(".");
        btn14.setBounds(122, 370, 60, 30);
        frame.add(btn14);
        btn15 = new JButton("C");
        btn15.setBounds(192, 370, 60, 30);
        frame.add(btn15);
        btn16 = new JButton("/");
        btn16.setBounds(262, 370, 60, 30);
        frame.add(btn16);

        btn17 = new JButton("Del");
        btn17.setBounds(52, 420, 110, 40);
        frame.add(btn17);

        btn18 = new JButton("=");
        btn18.setBounds(172, 420, 150, 40);
        frame.add(btn18);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);

        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);

        btn9.addActionListener(this);
        btn10.addActionListener(this);
        btn11.addActionListener(this);
        btn12.addActionListener(this);

        btn13.addActionListener(this);
        btn14.addActionListener(this);
        btn15.addActionListener(this);
        btn16.addActionListener(this);

        btn17.addActionListener(this);
        btn18.addActionListener(this);


        btn1.setFont(f);
        btn2.setFont(f);
        btn3.setFont(f);
        btn4.setFont(f);
        btn5.setFont(f);
        btn6.setFont(f);
        btn7.setFont(f);
        btn8.setFont(f);
        btn9.setFont(f);
        btn10.setFont(f);
        btn11.setFont(f);
        btn12.setFont(f);
        btn13.setFont(f);
        btn14.setFont(f);
        btn15.setFont(f);
        btn16.setFont(f);
        btn17.setFont(f);
        btn18.setFont(f);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(384, 560);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    private static final String[] OPERATORS = {"+", "-", "*", "/"};
    private static final int[] PRECEDENCE = {1, 1, 2, 2};

    public static String calculate(String text) {
        Stack<Double> operandStack = new Stack<>();
        Stack<String> operatorStack = new Stack<>();


        String[] numbers = text.split(" ");


        for (String number : numbers) {
            if (number.matches("[0-9.]+")) {
                operandStack.push(Double.parseDouble(number));
            } else if (Arrays.asList(OPERATORS).contains(number)) {
                while (!operatorStack.isEmpty() && isPrecedenceHigher(operatorStack.peek(), number)) {
                    double operand2 = operandStack.pop();
                    double operand1 = operandStack.pop();
                    String operator = operatorStack.pop();
                    operandStack.push(applyOperator(operand1, operand2, operator));
                }
                operatorStack.push(number);
            }
        }

        while (!operatorStack.isEmpty()) {
            double operand2 = operandStack.pop();
            double operand1 = operandStack.pop();
            String operator = operatorStack.pop();
            operandStack.push(applyOperator(operand1, operand2, operator));
        }

        return operandStack.pop() + " ";
    }

    private static boolean isPrecedenceHigher(String op1, String op2) {
        int index1 = Arrays.asList(OPERATORS).indexOf(op1);
        int index2 = Arrays.asList(OPERATORS).indexOf(op2);
        return PRECEDENCE[index1] >= PRECEDENCE[index2];
    }

    private static double applyOperator(double operand1, double operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }


    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1){
            t.setText(t.getText().concat("7"));
        }

        if(e.getSource()==btn2){
            t.setText(t.getText().concat("8"));
        }

        if(e.getSource()==btn3){
            t.setText(t.getText().concat("9"));
        }


        if(e.getSource()==btn5){
            t.setText(t.getText().concat("6"));
        }

        if(e.getSource()==btn6){
            t.setText(t.getText().concat("5"));
        }

        if(e.getSource()==btn7){
            t.setText(t.getText().concat("4"));
        }

        if(e.getSource()==btn9){
            t.setText(t.getText().concat("3"));
        }

        if(e.getSource()==btn10){
            t.setText(t.getText().concat("2"));
        }

        if(e.getSource()==btn11){
            t.setText(t.getText().concat("1"));
        }


        if(e.getSource()==btn13){
            t.setText(t.getText().concat("0"));
        }

        if(e.getSource()==btn14){
            t.setText(t.getText().concat("."));
        }


        if(e.getSource()==btn4){
            t.setText(t.getText().concat(" + "));
        }

        if(e.getSource()==btn8){
            t.setText(t.getText().concat(" - "));
        }


        if(e.getSource()==btn12){
            t.setText(t.getText().concat(" * "));
        }
        if(e.getSource()==btn15){
            t.setText("");
        }
        if(e.getSource()==btn16){
            t.setText(t.getText().concat(" / "));
        }
        if (e.getSource() == btn17) {
            String text = t.getText();
            if (!text.isEmpty()) {
                text = text.substring(0, text.length() - 1);
                t.setText(text);
            }
        }




        if(e.getSource()==btn18){
            String data=calculate(t.getText());
            t.setText(data);
        }



    }
    public static void main(String[] args){
        
        new Test();
    
     
    }}


