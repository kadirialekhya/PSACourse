package org.PSA_INFO6205;
/**
 *
 * @author alekhya
 */
import java.util.Stack;

public class InfixToPostfix {
// order of precedence
    public static int precedence(char ch) {
// for + and - took 1
        if (ch == '+' || ch == '-') {
            return 1;
        }
        // for * and / took 2
        if (ch == '/' || ch == '*') {
            return 2;
        }
// else return -1
        return -1;
    }

    static String infixToPostfixNotation(String infixExpression) {

        StringBuilder stringBuilder = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < infixExpression.length(); i++) {
            char ch = infixExpression.charAt(i);
            // ignore spaces
            if (ch == ' ') {
                continue;
            } else if (Character.isLetterOrDigit(ch)) {
                stringBuilder.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() &&
                        stack.peek() != '(') {
                    stringBuilder.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(ch)
                        <= precedence(stack.peek())) {
                    stringBuilder.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        // input without spaces
        System.out.println(infixToPostfixNotation("(A+B)*C+D/(E+F*G)-H"));
       // input with spaces
        System.out.println(infixToPostfixNotation("(A + B) * C + D / (E + F * G) - H"));
        // input from above 6th question
        System.out.println(infixToPostfixNotation("(4+8)*(6-5)/(3-2)*(2+2)"));
        // input from above 6th question
        System.out.println(infixToPostfixNotation("(1+3+((4/2)*(8*4)"));
    }
}
/*
OUTPUT
"C:\Program Files\Java\jdk-15.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=51335:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\alekh\IdeaProjects\Leetcode\out\production\Leetcode org.PSA_INFO6205.InfixToPostfix
AB+C*DEFG*+/+H-
AB+C*DEFG*+/+H-
48+65-*32-/22+*
13+42/84**(+(

Process finished with exit code 0


 */

