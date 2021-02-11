package org.PSA_INFO6205;

public class Power_Iterative {
    public static void main(String[] args) {

        int base = 3, exponent = 7;

        long result = 1;

        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println("Answer in iterative method = " + result);
    }
}
/*
OUTPUT:

"C:\Program Files\Java\jdk-15.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=49381:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\alekh\IdeaProjects\Leetcode\out\production\Leetcode org.PSA_INFO6205.Power_Iterative
Answer in iterative method = 2187

Process finished with exit code 0

 */