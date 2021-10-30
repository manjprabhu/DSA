package com.example.dsa;

import android.util.Log;

public class ArrayAlgorithms {

    private final String TAG = ArrayAlgorithms.class.getSimpleName();

    //Use temporary array to store the unique elements.
    public void removeDuplicateFromSortedArray() {
        int input[] = {1, 2, 2, 4, 4, 6, 6, 7, 8, 9, 88};

        int temp[] = new int[input.length];

        int j = 0;
        for (int a = 0; a < input.length - 1; a++) {

            //if current and next element are same, don't add the current element.
            if (input[a] != input[a + 1]) {
                temp[j++] = input[a];
            }
        }
        //Store the last element
        temp[j++] = input[input.length - 1];

        // Copy the temporary array element into the original array.
        for (int b = 0; b < j; b++) {
            input[b] = temp[b];
        }

        for (int i = 0; i < j; i++) {
            Log.v(TAG, "Final array: " + input[i]);
        }
    }

    public void removeDuplicateFromSortedArray2() {
        int input[] = {1, 2, 2, 4, 4, 6, 6, 7, 8, 9, 88};
        int j=0;

        for(int i=0;i<input.length-1;i++) {

            if(input[i] != input[i+1]) {
                input[j++] = input[i];
            }
        }
        input[j++] = input[input.length-1];

        for(int x=0;x<j;x++) {
            Log.v(TAG, "Final array: " + input[x]);
        }
    }

    public void putAllZerosToendofArray() {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};

        int count =0;// to keep track of non zero numbers.

        for(int x =0;x<arr.length;x++) {

            //If current element is not zero , move to the count index.
            if(arr[x]!=0) {
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

        for(int x=0;x<arr.length;x++) {
            Log.v(TAG, "Final array: " + arr[x]);
        }
    }
}
