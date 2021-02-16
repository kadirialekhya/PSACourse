package org.PSA_HW4;

import java.util.Arrays;

public class TimSort {
    static class TimSort32 {

        static int RUN = 32;

        // this function sorts array from left index to
        // to right index which is of size atmost RUN
        public static void insertionSort(int[] arr, int left, int right) {
            for (int i = left + 1; i <= right; i++) {
                int temp = arr[i];
                int j = i - 1;
                while (j >= left && arr[j] > temp) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = temp;
            }
        }

        // merge function merges the sorted runs
        public static void merge(int[] arr, int l,
                                 int m, int r) {
            // original array is broken in two parts
            // left and right array
            int len1 = m - l + 1, len2 = r - m;
            int[] left = new int[len1];
            int[] right = new int[len2];
            for (int x = 0; x < len1; x++) {
                left[x] = arr[l + x];
            }
            for (int x = 0; x < len2; x++) {
                right[x] = arr[m + 1 + x];
            }

            int i = 0;
            int j = 0;
            int k = l;

            // after comparing, we merge those two array
            // in larger sub array
            while (i < len1 && j < len2) {
                if (left[i] <= right[j]) {
                    arr[k] = left[i];
                    i++;
                } else {
                    arr[k] = right[j];
                    j++;
                }
                k++;
            }

            // copy remaining elements of left, if any
            while (i < len1) {
                arr[k] = left[i];
                k++;
                i++;
            }

            // copy remaining element of right, if any
            while (j < len2) {
                arr[k] = right[j];
                k++;
                j++;
            }
        }

        // iterative Timsort function to sort the
        // array[0...n-1] (similar to merge sort)
        public static void timSort(int[] arr, int n) {

            // Sort individual subarrays of size RUN
            for (int i = 0; i < n; i += RUN) {
                insertionSort(arr, i, Math.min((i + 31), (n - 1)));
            }

            // start merging from size RUN (or 32). It will merge
            // to form size 64, then 128, 256 and so on ....
            for (int size = RUN; size < n; size = 2 * size) {

                // pick starting point of left sub array. We
                // are going to merge arr[left..left+size-1]
                // and arr[left+size, left+2*size-1]
                // After every merge, we increase left by 2*size
                for (int left = 0; left < n; left += 2 * size) {

                    // find ending point of left sub array
                    // mid+1 is starting point of right sub array
                    // int mid = left + size - 1;
                    int right = Math.min((left + 2 * size - 1), (n - 1));
                    int mid = (left + right) / 2;

                    // merge sub array arr[left.....mid] &
                    // arr[mid+1....right]
                    merge(arr, left, mid, right);
                }
            }
        }

        static void printArray(int arr[])
        {
            System.out.print(Arrays.toString(arr));
            System.out.println();
        }
    }

    static class TimSort64 {

        static int RUN = 64;

        // this function sorts array from left index to
        // to right index which is of size atmost RUN
        public static void insertionSort(int[] arr, int left, int right) {
            for (int i = left + 1; i <= right; i++) {
                int temp = arr[i];
                int j = i - 1;
                while (j >= left && arr[j] > temp) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = temp;
            }
        }

        // merge function merges the sorted runs
        public static void merge(int[] arr, int l,
                                 int m, int r) {
            // original array is broken in two parts
            // left and right array
            int len1 = m - l + 1, len2 = r - m;
            int[] left = new int[len1];
            int[] right = new int[len2];
            for (int x = 0; x < len1; x++) {
                left[x] = arr[l + x];
            }
            for (int x = 0; x < len2; x++) {
                right[x] = arr[m + 1 + x];
            }

            int i = 0;
            int j = 0;
            int k = l;

            // after comparing, we merge those two array
            // in larger sub array
            while (i < len1 && j < len2) {
                if (left[i] <= right[j]) {
                    arr[k] = left[i];
                    i++;
                } else {
                    arr[k] = right[j];
                    j++;
                }
                k++;
            }

            // copy remaining elements of left, if any
            while (i < len1) {
                arr[k] = left[i];
                k++;
                i++;
            }

            // copy remaining element of right, if any
            while (j < len2) {
                arr[k] = right[j];
                k++;
                j++;
            }
        }

        // iterative Timsort function to sort the
        // array[0...n-1] (similar to merge sort)
        public static void timSort(int[] arr, int n) {

            // Sort individual subarrays of size RUN
            for (int i = 0; i < n; i += RUN) {
                insertionSort(arr, i, Math.min((i + 63), (n - 1)));
            }

            // start merging from size RUN (or 32). It will merge
            // to form size 64, then 128, 256 and so on ....
            for (int size = RUN; size < n; size = 2 * size) {

                // pick starting point of left sub array. We
                // are going to merge arr[left..left+size-1]
                // and arr[left+size, left+2*size-1]
                // After every merge, we increase left by 2*size
                for (int left = 0; left < n; left += 2 * size) {

                    // find ending point of left sub array
                    // mid+1 is starting point of right sub array
                    // int mid = left + size - 1;
                    int right = Math.min((left + 2 * size - 1), (n - 1));
                    int mid = (left + right)/2;
                    // merge sub array arr[left.....mid] &
                    // arr[mid+1....right]
                    merge(arr, left, mid, right);
                }
            }
        }
        static void printArray(int arr[])
        {
            System.out.print(Arrays.toString(arr));
            System.out.println();
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


        TimSort32 ob = new TimSort32();
        ob.timSort(arr, n);

        System.out.println("sorted array --using Run - 32");
        ob.printArray(arr);

        int arr1[] = {62,18,77,24,11, 27, 43, 38, 3, 9, 82, 10, 21, 8 , 34, 19, 6};
        TimSort64 ob1 = new TimSort64();
        ob1.timSort(arr1, n);

        System.out.println("sorted array --using Run - 64");
        ob1.printArray(arr1);
    }
}
