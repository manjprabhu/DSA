package com.example.dsa;

import android.util.Log;

import java.util.HashMap;

public class ArrayAlgorithms {

    private final String TAG = ArrayAlgorithms.class.getSimpleName();

    //Use temporary array to store the unique elements.
    public void removeDuplicateFromSortedArray() {
        int input[] = {1, 2, 2, 4, 4, 6, 6, 7, 8, 9, 88};

        int temp[] = new int[input.length];

        int j = 0;
        for ( int a = 0; a < input.length - 1; a++ ) {

            //if current and next element are same, don't add the current element.
            if (input[a] != input[a + 1]) {
                temp[j++] = input[a];
            }
        }
        //Store the last element
        temp[j++] = input[input.length - 1];

        // Copy the temporary array element into the original array.
        for ( int b = 0; b < j; b++ ) {
            input[b] = temp[b];
        }

        for ( int i = 0; i < j; i++ ) {
            Log.v(TAG, "Final array: " + input[i]);
        }
    }

    public void removeDuplicateFromSortedArray2() {
        int input[] = {1, 2, 2, 4, 4, 6, 6, 7, 8, 9, 88};
        int j = 0;

        for ( int i = 0; i < input.length - 1; i++ ) {

            if (input[i] != input[i + 1]) {
                input[j++] = input[i];
            }
        }
        input[j++] = input[input.length - 1];

        for ( int x = 0; x < j; x++ ) {
            Log.v(TAG, "Final array: " + input[x]);
        }
    }

    public void putAllZerosToendofArray() {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};

        int count = 0;// to keep track of non zero numbers.

        for ( int x = 0; x < arr.length; x++ ) {

            //If current element is not zero , move to the count index.
            if (arr[x] != 0) {
//                arr[count] = arr[x];
//                count++;
                int temp = arr[count];
                arr[count] = arr[x];
                arr[x] = temp;
                count++;
            }
        }

        //Now count is pointing to the index of first zero, mark all following elements to zero
//        while(count < arr.length) {
//            arr[count++] = 0;
//        }

        for ( int x = 0; x < arr.length; x++ ) {
            Log.v(TAG, "Final array: " + arr[x]);
        }
    }

    public void findMissingAndRepeatingElementinArray() {
        int[] arr = {4, 3, 6, 2, 1, 1};

        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for ( int j : arr ) {

            if (hashMap.get(j) == null) {
                hashMap.put(j, true);
            } else {
                Log.v(TAG, "Repeating element:" + j);
            }
        }

        for ( int i = 1; i <= arr.length; i++ ) {
            if (hashMap.get(i) == null) {
                Log.v(TAG, "Missing element:" + i);
            }
        }
    }

//    Maximum of all subarrays of size k (Sliding window)

    public void MaximumofAllSubarray() {

        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};

        int k = 3;


        for ( int i = 0; i < arr.length - k; i++ ) {

            int max = arr[i];

            for ( int j = 1; j < k; j++ ) {

                if (max < arr[j + i]) {
                    max = arr[j + i];
                }
            }
            Log.v(TAG, "Max:" + max);

        }
    }

    void SegregateZeroAndOnesInArray() {

        int array[] = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};

        int countZero = 0;// Count number of zeros;

        for ( int i = 0; i < array.length; i++ ) {
            if (array[i] == 0) {
                countZero++;
            }
        }

        //Fill the array with countZero number of 0's
        for ( int i = 0; i < countZero - 1; i++ ) {
            array[i] = 0;
        }
        //Fill rest of the arry with 1's
        for ( int i = countZero; i < array.length; i++ ) {
            array[i] = 1;
        }

        for ( int i = 0; i < array.length; i++ ) {
            Log.v(TAG, "Finla array:" + array[i]);
        }
    }

    void SegregateZeroAndOnesInArray2() {

        int array[] = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};

        int n = array.length;
        int left = 0, right = n - 1;

        while (left < right) {

            while (array[left] == 0) {
                left++;
            }

            while (array[right] == 1) {
                right--;
            }

            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }

        for ( int i = 0; i < array.length; i++ ) {
            Log.v(TAG, "Final array:" + array[i]);
        }
    }

    void maximumofPerffectSqaure() {

        int a[] = {16, 20, 25, 2, 3, 10};
        int n = a.length;

        int max = -1;
        for ( int i = 0; i < n; i++ ) {
            if (isPerfectSquare(a[i])) {
                max = Math.max(a[i], max);
            }
        }
        Log.v(TAG, "Max Square root number:" + max);
    }

    private boolean isPerfectSquare(double n) {
        double d = Math.sqrt(n);

        double value = Math.floor(d);

        if (d - value == 0) {
            return true;
        }
        return false;
    }

    void perfectSquareinAArray() {
        int a[] = {16, 20, 25, 2, 3, 10};

        int n = a.length;

        for ( int i = 0; i < n; i++ ) {
            if (isPerfectSquare(a[i])) {
                Log.v(TAG, "Perfect Sqaure:" + a[i]);
            }
        }

    }

    void perfectSquareinARange() {
        int a = 9, b = 25;

        int count = 0;
        for ( int i = a; i <= b; i++ ) {
            if (isPerfectSquare(i)) {
                count++;
            }
        }
        Log.v(TAG, "Count:" + count);
    }

    void floorSqrt() {
        int x = 5;

        int i = 1, result = 1;

        while (result <= x) {
            i++;
            result = i * i;
        }

        Log.v(TAG, "Floor or squareRoot : " + (i - 1));
    }

    //Given a number , find the number in opposite face of cubic dice.
    void diceProblem() {

        //in dice, 6 is opposite 1 , 5 opposite to 2 and 4 is opposite to 3
        // hence sum of opposite face is always 7;

        int x = 1;

        if (x > 6 || x < 1) {
            return;
        }
        int sum = 7;

        Log.v(TAG, "Opposite side is:" + (sum - x));

    }

    void geekonacci() {
//        Given four integers A, B, C and N, where A, B, C represents the first three numbers of the geekonacci series,
//        The Nth term of the geekonacci series is the sum of its previous three terms in the series i.e., sum of (N – 1)th, (N – 2)th, and (N – 3)th geekonacci numbers.
//        Input: A = 1, B = 3, C = 2, N = 4
//        output = 6;

        int A = 1, B = 3, C = 2, N = 6;

        int a[] = new int[N];

        a[0] = A;
        a[1] = B;
        a[2] = C;

        for ( int i = 3; i < N; i++ ) {
            a[i] = a[i - 1] + a[i - 2] + a[i - 3];
        }
        for ( int x = 0; x < a.length; x++ ) {
            Log.v(TAG, "Geek o nacci series:" + a[x]);
        }

    }

    void KSubarraySum() {

        int a[] = {10, 11, 10, 11, 12};
        int n = a.length;
        int k = 2; // SUbarray size

        for ( int i = 0; i < n - k + 1; i++ ) {

            int sum_so_far = a[i];

            for ( int j = 1; j < k; j++ ) {
                sum_so_far = sum_so_far + a[i + j];
            }
            Log.v(TAG, "sum_so_far:" + sum_so_far);
        }
    }

    void findallSubarrayWithSumK() {

        int arr[] = {9, 4, 20, 3, 10, 5};
        int n = arr.length;
        int k = 33;
        int count = 0;

        for ( int start = 0; start < n; start++ ) {

            for ( int end = start + 1; end <= n; end++ ) {
                int sum = 0;

                for ( int m = start; m < end; m++ )
                    sum = sum + arr[m];

                if (sum == k) {
                    count++;
                }
            }
        }

        Log.v(TAG, "Count:" + count);

    }
}
