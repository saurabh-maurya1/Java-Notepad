import java.util.*;

class ExpressionEvaluator {

    private static final String[] OPERATORS = {"+", "-", "*", "/"};
    private static final int[] PRECEDENCE = {1, 1, 2, 2};

    public static int evaluateExpression(String expression) {
        Stack<Integer> operandStack = new Stack<>();
        Stack<String> operatorStack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                operandStack.push(c - '0');
            } else {
                           int i1=0,i2=0;
                     for(int i=0; i<OPERATORS.length;i++){
                        if(OPERATORS[i].equals(operatorStack.peek())){
                          i1=i;
			} 
                     if(OPERATORS[i].equals(String.valueOf(c))){
                         i2=i;
                      }
                  
                }
                while (!operatorStack.isEmpty() && PRECEDENCE[i1] >= PRECEDENCE[i2]) {
                    int operand2 = operandStack.pop();
                    int operand1 = operandStack.pop();
                    String operator = operatorStack.pop();
                    operandStack.push(applyOperator(operand1, operand2, operator));
                }
                operatorStack.push(String.valueOf(c));
            }
        }

        while (!operatorStack.isEmpty()) {
            int operand2 = operandStack.pop();
            int operand1 = operandStack.pop();
            String operator = operatorStack.pop();
            operandStack.push(applyOperator(operand1, operand2, operator));
        }

        return operandStack.pop();
    }

    private static int applyOperator(int operand1, int operand2, String operator) {
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

    public static void main(String[] args) {
        String expression = "23*4-5";
        System.out.println(evaluateExpression(expression));
    }
}
