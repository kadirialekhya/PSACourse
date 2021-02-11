package org.PSA_INFO6205;

public class RecursiveFibonocci {

        int fib(int n) {
            if (n <= 1) {
                return n;
            }
            return fib(n - 1) + fib(n - 2);
        }

        public static void main(String args[]) {
            System.out.println("Calculating Fibonacci Series when n = 6 recursively");
            System.out.println("Result: " + new RecursiveFibonocci().fib(6));
            System.out.println("Calculating Fibonacci Series when n = 7 recursively");
            System.out.println("Result: " + new RecursiveFibonocci().fib(7));
        }

}
