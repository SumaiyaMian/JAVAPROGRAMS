import java.util.Stack;

public class PostfixEvaluation {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            
            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // Convert char to int
            } else {
                // Pop two operands from the stack
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                
                // Perform the operation based on the operator
                switch (ch) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2); // Fixed operation
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }
        
        return stack.pop(); // Return the final result
    }

    public static void main(String[] args) {
        String postfixExpression = "231*+9-"; // Corrected variable name
        int result = evaluatePostfix(postfixExpression); // Corrected method call
        System.out.println("The result of the postfix expression \"" + postfixExpression + "\" is: " + result);
    }
}
