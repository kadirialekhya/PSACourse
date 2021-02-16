package org.PSA_HW4;

import java.util.Arrays;

public class InsertionSort {
    void sort(int[] a) {
        int holePosition;
        int valueToInsert;
        int n = a.length;
        for (int i = 1; i < n; i++) {
            valueToInsert = a[i];
            holePosition = i;

            /*locate hole position for the element to be inserted */
            while (holePosition > 0 && a[holePosition - 1] > valueToInsert) {
                a[holePosition] = a[holePosition - 1];
                holePosition = holePosition - 1;
            }

            /* insert the number at hole position */
            a[holePosition] = valueToInsert;
        }
    }

    static void printArray(int arr[])
    {
        System.out.print(Arrays.toString(arr));
        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = {62,18,77,24,11, 27, 43, 38, 3, 9, 82, 10, 21, 8 , 34, 19, 6};
        int n = arr.length;

        System.out.println("Before sorting");
        printArray(arr);
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        System.out.println("sorted array");
        printArray(arr);
    }
}
