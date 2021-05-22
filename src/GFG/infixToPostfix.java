package GFG;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class infixToPostfix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- >0){
            String infix = br.readLine();
            String postfix = infixToPostfix(infix);
            System.out.println(postfix);
        }
        br.close();
    }

    //function to convert infix expression to postfix expression
    public static String infixToPostfix(String infix){
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int n = infix.length();
        for (int i = 0; i < n; i++) {
            char c = infix.charAt(i);
            if(Character.isLetterOrDigit(c)){   // If the scanned character is an operand, add it to output.
                sb = sb.append(c);
            }
            else if(c == '(') stack.push(c);    // If the scanned character is an '(', push it to the stack.
            else if(c == ')') { //  If the scanned character is an ')', pop and output from the stack until an '(' is encountered.
                while(!stack.isEmpty() && stack.peek() != '(') sb = sb.append(stack.pop());
                stack.pop();
            }
            else {  // an operator is encountered
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    sb = sb.append(stack.pop());
                }
                stack.push(c);
            }
        }
        // pop all the operators from the stack
        while (!stack.isEmpty()){
            if(stack.peek() == '(')
                return "Invalid Expression";
            sb = sb.append(stack.pop());
        }
        return sb.toString();
    }

    //function to return int value of precedence of operand - the higher the no. the greater the precedence
    //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
    public static int precedence(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
            case '%':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }
}
/*
1
a+b*(c^d-e)^(f+g*h)-i
 */
/*
abcd^e-fgh*+^*+i-
 */

/**
 * Algorithm
 * 1. Scan the infix expression from left to right.
 * 2. If the scanned character is an operand, output it.
 * 3. Else,
 *       1 If the precedence of the scanned operator is greater than the precedence of the operator in the stack(or the stack is empty or the stack
 *       contains a ‘(‘ ), push it.
 *       2 Else, Pop all the operators from the stack which are greater than or equal to in precedence than that of the scanned operator.
 *       After doing that Push the scanned operator to the stack. (If you encounter parenthesis while popping then stop there and push the scanned
 *       operator in the stack.)
 * 4. If the scanned character is an ‘(‘, push it to the stack.
 * 5. If the scanned character is an ‘)’, pop the stack and output it until a ‘(‘ is encountered, and discard both the parenthesis.
 * 6. Repeat steps 2-6 until infix expression is scanned.
 * 7. Print the output
 * 8. Pop and output from the stack until it is not empty.
 */