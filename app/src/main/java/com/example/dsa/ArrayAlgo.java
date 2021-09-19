package com.example.dsa;

import android.util.Log;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArrayAlgo {

    private final String TAG =  ArrayAlgo.class.getSimpleName();

    public ArrayAlgo() {
    }

    //    Count the occurrence of each number in an array
    public void countTheOccurrence() {

        int[] arr = {1, 3, 4, 6, 6, 8, 9, 9, 8, 8};

        HashMap<Integer, Integer> countMap = new HashMap<>();
        int count;

        for (int i : arr) {

            if (countMap.containsKey(i)) {
                count = countMap.get(i);
                count++;
                countMap.put(i, count);
            } else {
                countMap.put(i, 1);
            }
        }

        Iterator iterator = countMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Log.v("===>>>", "" + iterator.next());
        }

        for (Map.Entry entry : countMap.entrySet()) {
            Log.v("===>>", entry.getKey() + " occurred " + entry.getValue() + " times");

        }
    }

    //    Reverse the given array
    public void reverseArray() {
        int[] a = {1, 3, 6, 8, 2, 4, 6, 8, 11};

        for (int k = 0; k < a.length / 2; k++) {

            int temp = a[k];

            a[k] = a[a.length - 1 - k];

            a[a.length - 1 - k] = temp;
        }

        for (int j : a) {
            Log.v("===>>> ", " Element:" + j);
        }
    }

    //    Find all the pair of number in a given array whose sum is given number.
    public void pairWithGivenSum() {
        int[] a = {1, 5, 7, 5, 2, 4, 3, 3, -1};
        int sum = 6;

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] + a[j] == sum) {
                    Log.v("===>> ", a[i] + " and " + a[j] + " makes sum: " + sum);
                }
            }
        }
    }

    //    Find the largest element in an given array
    public void largestNumber() {
        int[] a = {11, 5, 7, 5, 2, 4, 3, 3, -1};

        int largest = Integer.MIN_VALUE;

        for (int k = 0; k < a.length; k++) {

            if (a[k] > largest) {
                largest = a[k];
            }
        }
        Log.v("===>>>", "Largest number is :" + largest);
    }

    //    Find  the smallest element in an given array
    public void smallestNumber() {
        int[] a = {11, 5, 7, 5, 2, 4, 3, -13, -1};

        int smallest = Integer.MAX_VALUE;

        for (int k = 0; k < a.length; k++) {

            if (a[k] < smallest) {
                smallest = a[k];
            }
        }
        Log.v("===>>>", "Smallest number is :" + smallest);
    }

    //    Find the Largest and second Second largest element in an array
    public void secondLargest() {
        int[] a = {-1, -5, -7, -5, -2, -41, 3, -13, -1};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i : a) {

            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i < largest && i > secondLargest) {
                secondLargest = i;
            }
        }
        Log.v("===>>>", "Largest number is :" + largest);
        Log.v("===>>>", "Second Largest number is :" + secondLargest);
    }

    //    Find the Smallest and second smallest element in an array
    public void secondSmallest() {
        int[] a = {11, 5, 7, 5, 2, 4, 3, -13, -1};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int k : a) {
            if (k < smallest) {
                secondSmallest = smallest;
                smallest = k;
            } else if (k > smallest && k < secondSmallest) {
                secondSmallest = k;
            }
        }

        Log.v("===>>>", "Smallest number is :" + smallest);
        Log.v("===>>>", "Second smallest Largest number is :" + secondSmallest);
    }

    //Find all the duplicate element in array.
    public void duplicateElementInArray() {

        int[] arr = {1, 2, 7, 3, 8, 4, 6, 9, 3, 9};

        for (int x = 0; x < arr.length; x++) {

            for (int y = x + 1; y < arr.length; y++) {

                if(arr[x] == arr[y]) {
                    Log.v(TAG," Duplicate element:" +arr[y]);
                }

            }
        }

    }
}
