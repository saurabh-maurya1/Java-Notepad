import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Stack;
import java.util.*;

class Test1 implements ActionListener {
    JFrame frame;
    JTextField t;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,
            btnDot, btnClear, btnAdd, btnSubtract, btnMultiply, btnDivide, btnDelete, btnEquals;
    JLabel lblTitle;

    Test1() {
        frame = new JFrame("Calculator");
        Font titleFont = new Font("Arial", Font.BOLD, 35);
        Font btnFont = new Font("Arial", Font.BOLD, 20);

        lblTitle = new JLabel("Calculator");
        lblTitle.setFont(titleFont);
        lblTitle.setBounds(110, 50, 200, 40);
        frame.add(lblTitle);

        t = new JTextField();
        t.setFont(btnFont);
        t.setBounds(52, 140, 270, 70);
        t.setEditable(false);
        frame.add(t);

        btn7 = createButton("7", 52, 220, btnFont);
        btn8 = createButton("8", 122, 220, btnFont);
        btn9 = createButton("9", 192, 220, btnFont);
        btnAdd = createButton("+", 262, 220, btnFont);

        btn4 = createButton("4", 52, 270, btnFont);
        btn5 = createButton("5", 122, 270, btnFont);
        btn6 = createButton("6", 192, 270, btnFont);
        btnSubtract = createButton("-", 262, 270, btnFont);

        btn1 = createButton("1", 52, 320, btnFont);
        btn2 = createButton("2", 122, 320, btnFont);
        btn3 = createButton("3", 192, 320, btnFont);
        btnMultiply = createButton("*", 262, 320, btnFont);

        btn0 = createButton("0", 52, 370, btnFont);
        btnDot = createButton(".", 122, 370, btnFont);
        btnClear = createButton("C", 192, 370, btnFont);
        btnDivide = createButton("/", 262, 370, btnFont);

        btnDelete = createButton("Del", 52, 420, btnFont);
        btnEquals = createButton("=", 172, 420, btnFont);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(384, 560);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    private JButton createButton(String text, int x, int y, Font font) {
        JButton button = new JButton(text);
        button.setBounds(x, y, 60, 30);
        button.setFont(font);
        button.addActionListener(this);
        frame.add(button);
        return button;
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
            } else if (containsOperator(number)) {
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

        return operandStack.pop() + "";
    }

    private static boolean isPrecedenceHigher(String op1, String op2) {
        int index1 = getOperatorIndex(op1);
        int index2 = getOperatorIndex(op2);
        return PRECEDENCE[index1] >= PRECEDENCE[index2];
    }

    private static boolean containsOperator(String operator) {
        for (String op : OPERATORS) {
            if (op.equals(operator)) {
                return true;
            }
        }
        return false;
    }

    private static int getOperatorIndex(String operator) {
        for (int i = 0; i < OPERATORS.length; i++) {
            if (OPERATORS[i].equals(operator)) {
                return i;
            }
        }
        return -1;
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
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public void actionPerformed(ActionEvent e) {
        String buttonText = ((JButton) e.getSource()).getText();

        switch (buttonText) {
            case "Del":
                if (!t.getText().isEmpty()) {
                    String currentText = t.getText();
                    t.setText(currentText.substring(0, currentText.length() - 1));
                }
                break;
            case "=":
                try {
                    String data = calculate(t.getText());
                    t.setText(data);
                } catch (Exception ex) {
                    t.setText("Error");
                }
                break;
            case "C":
                t.setText("");
                break;
            default:
                t.setText(t.getText().concat(buttonText));
                break;
        }
    }

    public static void main(String[] args){
     
        SwingUtilities.invokeLater(Test1::new);
       
    }
}
