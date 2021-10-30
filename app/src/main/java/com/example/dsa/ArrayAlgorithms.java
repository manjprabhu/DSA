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
            if(isPerfectSquare(a[i])) {
                max= Math.max(a[i],max);
            }
        }
        Log.v(TAG, "Max Square root number:" + max);
    }

    private boolean isPerfectSquare(double n) {
        double d = Math.sqrt(n);

        if (d * d == n)
            return true;
        return false;
    }

    void perfectSquareinARange() {
        int a[] = {16, 20, 25, 2, 3, 10};

        int n = a.length;

        for(int i=0;i<n;i++) {
            if(isPerfectSquare(a[i])) {
                Log.v(TAG,"Perfect Sqaure:"+ a[i]);
            }
        }

    }
}
