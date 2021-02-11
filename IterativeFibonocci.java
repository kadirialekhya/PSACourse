package org.PSA_INFO6205;

public class IterativeFibonocci {

        int fib(int n) {
            if (n == 0) {
                return 0;
            }
            int prev, current = 0, res = 1;
            for (int i = 1; i < n; i++) {
                prev = current;
                current = res;
                res = prev + current;
            }
            return res;
        }

        public static void main(String args[]) {
            System.out.println("Calculating Fibonacci Series when n = 6 iteratively");
            System.out.println("Result: " + new IterativeFibonocci().fib(6));
            System.out.println("Calculating Fibonacci Series when n = 7 iteratively");
            System.out.println("Result: " + new IterativeFibonocci().fib(7));
        }
    }

/*
"C:\Program Files\Java\jdk-15.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=55293:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\alekh\IdeaProjects\Leetcode\out\production\Leetcode org.PSA_INFO6205.IterativeFibonocci
Calculating Fibonacci Series when n = 6 iteratively
Result: 8
Calculating Fibonacci Series when n = 7 iteratively
Result: 13

Process finished with exit code 0

 */