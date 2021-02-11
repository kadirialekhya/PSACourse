package org.PSA_INFO6205;
/**
 *
 * @author alekhya
 */
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class PostFixEval {


    public static int evaluatePostFixMethod1(String[] tokens_inp) {

        if (tokens_inp.length < 1) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens_inp) {
            if (!token.isEmpty() && "+/*-".contains(token)) {
                Integer firstValue = stack.pop();
                Integer secondValue = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(firstValue + secondValue);
                        break;
                    case "-":
                        stack.push(secondValue - firstValue);
                        break;
                    case "*":
                        stack.push(firstValue * secondValue);
                        break;
                    case "/":
                        stack.push(secondValue / firstValue);
                        break;
                    default:
                        break;
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.peek();
    }

    public static int evaluatePostFixMethod2(String[] tokens_inp) {

        if (tokens_inp.length < 1) {
            return 0;
        }

        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens_inp) {
            if (!token.isEmpty() && "+/*-".contains(token)) {
                Integer firstValue = stack.pollFirst();
                Integer secondValue = stack.pollFirst();
                switch (token) {
                    case "+":
                        stack.addFirst(firstValue + secondValue);
                        break;
                    case "-":
                        stack.addFirst(secondValue - firstValue);
                        break;
                    case "*":
                        stack.addFirst(firstValue * secondValue);
                        break;
                    case "/":
                        stack.addFirst(secondValue / firstValue);
                        break;
                    default:
                        break;
                }
            } else {
                stack.addFirst(Integer.parseInt(token));
            }
        }

        return stack.peekFirst();
    }

    public static void main(String[] args) {
        String input = "10 2 8 * + 3 -";
        System.out.println("Evaluate Post Fix notation");
        System.out.println("Evaluated Post Fix using method1:");
        System.out.println(evaluatePostFixMethod2(input.split(" ")));
        System.out.println("Evaluated Post Fix using method2:");
        System.out.println(evaluatePostFixMethod1(input.split(" ")));
    }
}

/*OUTPUT:
"C:\Program Files\Java\jdk-15.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=53771:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\alekh\IdeaProjects\Leetcode\out\production\Leetcode org.PSA_INFO6205.PostFixEval
Evaluate Post Fix notation
Evaluated Post Fix using method1:
23
Evaluated Post Fix using method2:
23

Process finished with exit code 0

*/
