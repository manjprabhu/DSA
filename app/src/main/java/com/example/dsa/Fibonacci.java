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
        int k = 3;
        int sum_so_far = 0;
        int arr[] = {1, 4, 3, 1, 0, 5, 2, 3, 6, 8};
        for ( int i = 0; i <= arr.length - k; i++ ) {

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


    void sumofAllSubarrays() {
        int a[] = {1, 2, 3};

        int sum = 0;

        for ( int i = 0; i < a.length; i++ ) {
            int temp = 0;
            for ( int j = i; j < a.length; j++ ) {
                temp = temp + a[j];
                sum = sum + temp;
            }
        }

        Log.v(TAG, "Sum of all SubArrays:" + sum);
    }

    void subArrayWithGivenSum() {
        int a[] = {1, 4, 20, 3, 10, 5};
        int sum = 33;

        for ( int i = 0; i < a.length; i++ ) {

            int temp = 0;

            for ( int j = i; j < a.length; j++ ) {

                if (temp == sum) {
                    Log.v(TAG, "SubArray with given sum can be found b/w: " + i + " And " + j);
                    return;
                }
                temp = temp + a[j];
            }
        }
    }

    //    Given an array of integers and a number x, find the smallest subarray with sum greater than the given value.
    void smallestSubArrayWithSumGreater() {
        int a[] = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
        int sum = 280;
        int smallest_so_far = a.length;
        for ( int i = 0; i < a.length; i++ ) {
            int temp_sum = 0;
            for ( int j = i; j < a.length; j++ ) {
                temp_sum = temp_sum + a[j];

                if (temp_sum > sum && smallest_so_far > (j - i + 1)) {
                    smallest_so_far = (j - i + 1);
                }
            }
        }
        Log.v(TAG, "Smallest SubArray with :" + smallest_so_far);
    }

    void rotateLeftArray() {
        int a[] =  {1, 2, 3, 4, 5, 6, 7};
        int d = 2;


        for(int m=0;m<d;m++) {
            int temp = a[0];

            for(int i=0;i<a.length-1;i++) {
                a[i] = a[i+1];
            }
            a[a.length-1] = temp;
        }

        for(int j=0;j<a.length;j++) {
            Log.v(TAG,"Rotated Array is:"+a[j]);
        }

    }
}
