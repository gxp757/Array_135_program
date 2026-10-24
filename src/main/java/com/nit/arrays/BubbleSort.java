package com.nit.arrays;

import java.util.Arrays;
import java.util.Random;



public class BubbleSort {

    public static void main(String[] args) {
        // int[] a= {36,19,29,5,11,18,56,1};
        int[] a = getArray();
        int n = a.length;
        long initialTine = System.currentTimeMillis();
        int[] a1 = getBubbleSort(a, n);
        long currentTime = System.currentTimeMillis();
        System.out.println("Time taken to sort in milliSecond  " + (currentTime - initialTine));
        System.out.println(Arrays.toString(a1));

    }

    private static int[] getBubbleSort(int[] a, int n) {
        System.out.println("Array length " + n);
        int temp;
        for (int i = 0; i < n; i++) {
            int flag = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }

        }
        return a;
    }

    private static int[] getArray() {
        int[] arr = new int[100000];
        Random random = new Random();

        // Generate 100000 random integers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 1;
        }
        return arr;
    }
}
