import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JFrame frame;
    private JTextField displayField;
    private double memoryValue;
    private StringBuilder historyLog;

    public Calculator() {
        memoryValue = 0;
        historyLog = new StringBuilder();
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setLayout(new BorderLayout());

        displayField = new JTextField();
        displayField.setEditable(false);
        frame.add(displayField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4));

        JButton addButton = createButton("+");
        JButton subtractButton = createButton("-");
        JButton multiplyButton = createButton("*");
        JButton divideButton = createButton("/");
        JButton sqrtButton = createButton("sqrt");
        JButton exponentButton = createButton("^");
        JButton logButton = createButton("log");
        JButton sinButton = createButton("sin");
        JButton cosButton = createButton("cos");
        JButton tanButton = createButton("tan");
        JButton memoryStoreButton = createButton("MS");
        JButton memoryRecallButton = createButton("MR");
        JButton historyButton = createButton("History");
        JButton clearButton = createButton("C");
        JButton equalsButton = createButton("=");

        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);
        buttonPanel.add(sqrtButton);
        buttonPanel.add(exponentButton);
        buttonPanel.add(logButton);
        buttonPanel.add(sinButton);
        buttonPanel.add(cosButton);
        buttonPanel.add(tanButton);
        buttonPanel.add(memoryStoreButton);
        buttonPanel.add(memoryRecallButton);
        buttonPanel.add(historyButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(equalsButton);

        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private JButton createButton(String label) {
        JButton button = new JButton(label);
        button.addActionListener(new ButtonClickListener());
        return button;
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JButton source = (JButton) event.getSource();
            String buttonText = source.getText();

            switch (buttonText) {
                case "+":
                case "-":
                case "*":
                case "/":
                case "^":
                    handleArithmeticOperation(buttonText);
                    break;
                case "sqrt":
                    handleSquareRoot();
                    break;
                case "log":
                    handleLogarithm();
                    break;
                case "sin":
                    handleTrigonometricFunction("sin");
                    break;
                case "cos":
                    handleTrigonometricFunction("cos");
                    break;
                case "tan":
                    handleTrigonometricFunction("tan");
                    break;
                case "MS":
                    handleMemoryStore();
                    break;
                case "MR":
                    handleMemoryRecall();
                    break;
                case "History":
                    displayHistoryLog();
                    break;
                case "C":
                    clearDisplay();
                    break;
                case "=":
                    performFinalCalculation();
                    break;
                default:
                    appendDigit(buttonText);
                    break;
            }
        }

        private void handleArithmeticOperation(String operator) {
            String displayText = displayField.getText();
            if (!displayText.isEmpty()) {
                double currentValue = Double.parseDouble(displayText);
                memoryValue = currentValue;
            }
            displayField.setText("");
            historyLog.append(memoryValue).append(" ").append(operator).append(" ");
        }

        private void handleSquareRoot() {
            String displayText = displayField.getText();
            if (!displayText.isEmpty()) {
                double currentValue = Double.parseDouble(displayText);
                double result = Math.sqrt(currentValue);
                displayField.setText(String.valueOf(result));
                historyLog.append("sqrt(").append(currentValue).append(")");
            }
        }

        private void handleLogarithm() {
            String displayText = displayField.getText();
            if (!displayText.isEmpty()) {
                double currentValue = Double.parseDouble(displayText);
                double result = Math.log10(currentValue);
                displayField.setText(String.valueOf(result));
                historyLog.append("log(").append(currentValue).append(")");
            }
        }

        private void handleTrigonometricFunction(String functionName) {
            String displayText = displayField.getText();
            if (!displayText.isEmpty()) {
                double currentValue = Double.parseDouble(displayText);
                double result;
                switch (functionName) {
                    case "sin":
                        result = Math.sin(Math.toRadians(currentValue));
                        historyLog.append("sin(").append(currentValue).append(")");
                        break;
                    case "cos":
                        result = Math.cos(Math.toRadians(currentValue));
                        historyLog.append("cos(").append(currentValue).append(")");
                        break;
                    case "tan":
                        result = Math.tan(Math.toRadians(currentValue));
                        historyLog.append("tan(").append(currentValue).append(")");
                        break;
                    default:
                        result = 0;
                }
                displayField.setText(String.valueOf(result));
            }
        }

        private void handleMemoryStore() {
            String displayText = displayField.getText();
            if (!displayText.isEmpty()) {
                memoryValue = Double.parseDouble(displayText);
            }
        }

        private void handleMemoryRecall() {
            displayField.setText(String.valueOf(memoryValue));
        }

        private void displayHistoryLog() {
            JOptionPane.showMessageDialog(frame, historyLog.toString(), "History Log", JOptionPane.INFORMATION_MESSAGE);
        }

        private void clearDisplay() {
            displayField.setText("");
        }

        private void appendDigit(String digit) {
            String displayText = displayField.getText();
            displayField.setText(displayText + digit);
        }

        private void performFinalCalculation() {
            String displayText = displayField.getText();
            if (!displayText.isEmpty()) {
                historyLog.append(displayText);
                String history = historyLog.toString();
                double result = evaluateExpression(history);
                displayField.setText(String.valueOf(result));
                historyLog.setLength(0);
                historyLog.append(result);
            }
        }

        private double evaluateExpression(String expression) {
            try {
                return new Object() {
                    int pos = -1, ch;

                    void nextChar() {
                        ch = (++pos < expression.length()) ? expression.charAt(pos) : -1;
                    }

                    boolean eat(int charToEat) {
                        while (ch == ' ') nextChar();
                        if (ch == charToEat) {
                            nextChar();
                            return true;
                        }
                        return false;
                    }

                    double parse() {
                        nextChar();
                        double x = parseExpression();
                        if (pos < expression.length()) {
                            throw new RuntimeException("Unexpected: " + (char) ch);
                        }
                        return x;
                    }

                    double parseExpression() {
                        double x = parseTerm();
                        for (; ; ) {
                            if (eat('+')) x += parseTerm();
                            else if (eat('-')) x -= parseTerm();
                            else return x;
                        }
                    }

                    double parseTerm() {
                        double x = parseFactor();
                        for (; ; ) {
                            if (eat('*')) x *= parseFactor();
                            else if (eat('/')) x /= parseFactor();
                            else return x;
                        }
                    }

                    double parseFactor() {
                        if (eat('+')) return parseFactor();
                        if (eat('-')) return -parseFactor();

                        double x;
                        int startPos = this.pos;
                        if (eat('(')) {
                            x = parseExpression();
                            eat(')');
                        } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                            while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                            x = Double.parseDouble(expression.substring(startPos, this.pos));
                        } else {
                            throw new RuntimeException("Unexpected: " + (char) ch);
                        }

                        return x;
                    }
                }.parse();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "Invalid expression!", "Error", JOptionPane.ERROR_MESSAGE);
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Calculator();
            }
        });
    }
}
