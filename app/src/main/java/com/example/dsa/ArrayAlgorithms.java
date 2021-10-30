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
}
