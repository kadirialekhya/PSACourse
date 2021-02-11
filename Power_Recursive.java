package org.PSA_INFO6205;

public class Power_Recursive {
    public static int power(int x, int n)
    {
        // base condition
        if (n == 0) {
            return 1;
        }

        if ((n & 1) == 1) { // if `n` is odd
            return x * power(x, n / 2) * power(x, n / 2);
        }

        // otherwise, `n` is even
        return power(x, n / 2) * power(x, n / 2);
    }

    public static void main(String[] args)
    {
        int x = 3;
        int n = 7;

        System.out.println("pow(" + x + "," + n + ") in Recursive method is= " + power(x, n));
    }
}
/*
OUTPUT:
"C:\Program Files\Java\jdk-15.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=49842:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\alekh\IdeaProjects\Leetcode\out\production\Leetcode org.PSA_INFO6205.Power_Recursive
pow(3,7) in Recursive method is= 2187

Process finished with exit code 0

 */