package org.PSA_INFO6205;

public class TOH {

    public static void TOH(int n, char src, char des, char aux) {
        if (n > 0) {
            TOH(n - 1, src, aux, des);
            System.out.println("Move disc from: " + src + " to " + des);
            TOH(n - 1, aux, des, src);
        }

    }

    public static void main(String[] args) {
        TOH(8, 'a', 'b', 'c');
    }
}
