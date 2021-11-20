package com.example.dsa;

import android.util.Log;

public class Fibonacci {

    private final String TAG = Fibonacci.class.getSimpleName();

    private boolean isPerfectSquare(int n) {
        double x = Math.sqrt(n);

        double d = Math.floor(x);

        if (x - d == 0)
            return true;
        return false;
    }

    void checkForFibonacci() {
        int n = 8;

        boolean isFib = isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);

        Log.v(TAG, "IsFibonacci Number:" + isFib);

    }

    void NthFibonacci() {
        int n = 5;
        Log.d(TAG, "Nth Fibonacci number is:" + isFibonacci(n));
    }

    private int isFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return isFibonacci(n - 1) + isFibonacci(n - 2);
    }

    void fibonacciSeriesUsingRecursion() {
        int n = 10;
        for ( int i = 1; i <= n; i++ ) {
            Log.d(TAG, "Fibonacci series:" + recursionFib(i));
        }

    }

    private int recursionFib(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return recursionFib(number - 1) + recursionFib(number - 2);
    }

    void maximumOfAllSubArray() {
        int k =3;
        int sum_so_far = 0;
        int arr[] = { 1, 4, 3 ,1 ,0, 5 ,2, 3 ,6,8};
        for ( int i = 0; i <=arr.length - k; i++ ) {

            int max = 0;

            for ( int j = 0; j < k; j++ ) {

                if (max < arr[j + i]) {
                    max = arr[j + i];
                }
            }

            if (sum_so_far < max) {
                sum_so_far = max;

            }
            Log.v(TAG, "Max:" + max);

        }
    }

//    Given an array of integers and a number x, find the smallest subarray with sum greater than the given value.
    void smallestSubArray() {

        int arr[] = {1, 4, 45, 6, 0, 19};
        int x = 51;

        int min_length = arr.length+1;

        for(int i=0;i<arr.length;i++) {
            int sum_so_far = arr[i];

            if(sum_so_far>x) {
                return;
            }
            for(int j=i+1;j<arr.length;j++) {
                sum_so_far = sum_so_far+ arr[j];

                if(sum_so_far > x && (min_length > (j-i+1))) {
                   min_length = (j-i+1);
                }

            }
        }
        Log.v(TAG,"Min length:"+min_length);
    }
}
