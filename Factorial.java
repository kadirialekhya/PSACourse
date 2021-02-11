package org.PSA_INFO6205;

public class Factorial {
        static int fact(int n) {
            if (n == 1 || n == 0) {
                return 1;
            }
            return n * fact(n - 1);
        }

        public static void main(String args[]) {
            System.out.println("Factorial for the given Input: 6!");
            System.out.println("Result: " + fact(6));
        }
    }
/*
OUTPUT:
"C:\Program Files\Java\jdk-15.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=65031:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\alekh\IdeaProjects\Leetcode\out\production\Leetcode org.PSA_INFO6205.Factorial
Factorial for the given Input: 6!
Result: 720

 */

