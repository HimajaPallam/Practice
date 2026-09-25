package com.hp.practiceprobs;

import java.util.Stack;

/*Evaluate the value of an arithmetic expression in Reverse Polish Notation.
Valid operators are +,-, *, /. Each operand may be an integer or another
expression.
Some examples:
["2", "1", "+", "3", "*"]-> ((2 + 1) * 3)-> 9
["4", "13", "5", "/", "+"]-> (4 + (13 / 5))-> 6*/
public class Reversepolish {
    public static void main(String[] args) {
        //String[] tokens = new String[] { "2", "1", "+", "3", "*" };
        String[] tokens = new String[] { "4", "13", "5", "/", "+"};
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> inputStack = new Stack<>();
        for(String eachToken: tokens) {
            // if token is not operator
            if(!isOperator(eachToken)) {
                inputStack.push(Integer.parseInt(eachToken));
            } else {
                if(inputStack.size() < 2) {
                    throw new IllegalArgumentException("Insufficient operands");
                }
                int b = inputStack.pop();
                int a = inputStack.pop();
                if(eachToken.equals("/") && b == 0){
                    throw new ArithmeticException("Invalid operation to divide by zero");
                }
                inputStack.push(applyOperator(a,b,eachToken));
            }

        }
        return inputStack.peek();

    }



    /**
     * Helper: Check if token is an operator
     */
    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/");
    }

    /**
     * Helper: Apply operator to two operands
     */
    private static int applyOperator(int a, int b, String operator) {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;  // Integer division (truncates towards zero)
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }
}
