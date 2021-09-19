package com.example.dsa;

import android.util.Log;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class ArrayAlgo {

    private final String TAG = ArrayAlgo.class.getSimpleName();

    public ArrayAlgo() {
    }

    /**
     * Utility method to return random array of Integers in a range of 0 to 10
     */
    public static int[] getRandomArray(int length) {
        int[] randomArray = new int[length];

        for (int i = 0; i < length; i++) {

            randomArray[i] = (int) (Math.random() * 25);
        }
        return randomArray;
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
            Log.v(TAG, "" + iterator.next());
        }

        for (Map.Entry entry : countMap.entrySet()) {
            Log.v(TAG, entry.getKey() + " occurred " + entry.getValue() + " times");

        }
    }

    //    Reverse the given array
    public void reverseArray() {
        int[] a = getRandomArray(10);

        for (int value : a) {
            Log.v(TAG, "Input array:" + value);
        }

        for (int k = 0; k < a.length / 2; k++) {

            int temp = a[k];

            a[k] = a[a.length - 1 - k];

            a[a.length - 1 - k] = temp;
        }

        for (int j : a) {
            Log.v(TAG, " Element:" + j);
        }
    }

    //    Find all the pair of number in a given array whose sum is given number.
    public void pairWithGivenSum() {
        int[] a = getRandomArray(10);

        for (int value : a) {
            Log.v(TAG, "Input array:" + value);
        }
        int sum = 16;

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] + a[j] == sum) {
                    Log.v(TAG, a[i] + " and " + a[j] + " makes sum: " + sum);
                }
            }
        }
    }

    //    Find the largest element in an given array
    public void largestNumber() {
        int[] arr = getRandomArray(10);

        for (int value : arr) {
            Log.v(TAG, "Input array:" + value);
        }

        int largest = Integer.MIN_VALUE;

        for (int k = 0; k < arr.length; k++) {

            if (arr[k] > largest) {
                largest = arr[k];
            }
        }
        Log.v(TAG, "Largest number is :" + largest);
    }

    //    Find  the smallest element in an given array
    public void smallestNumber() {
        int[] arr = getRandomArray(10);

        for (int value : arr) {
            Log.v(TAG, "Input array:" + value);
        }

        int smallest = Integer.MAX_VALUE;

        for (int k = 0; k < arr.length; k++) {

            if (arr[k] < smallest) {
                smallest = arr[k];
            }
        }
        Log.v(TAG, "Smallest number is :" + smallest);
    }

    //    Find the Largest and second Second largest element in an array
    public void secondLargest() {
        int[] arr = getRandomArray(10);

        for (int value : arr) {
            Log.v(TAG, "Input array:" + value);
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i : arr) {

            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i < largest && i > secondLargest) {
                secondLargest = i;
            }
        }
        Log.v(TAG, "Largest number is :" + largest);
        Log.v(TAG, "Second Largest number is :" + secondLargest);
    }

    //    Find the Smallest and second smallest element in an array
    public void secondSmallest() {

        int[] arr = getRandomArray(10);

        for (int value : arr) {
            Log.v(TAG, "Input array:" + value);
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int k : arr) {
            if (k < smallest) {
                secondSmallest = smallest;
                smallest = k;
            } else if (k > smallest && k < secondSmallest) {
                secondSmallest = k;
            }
        }

        Log.v(TAG, "Smallest number is :" + smallest);
        Log.v(TAG, "Second smallest number is :" + secondSmallest);
    }

    //Find all the duplicate element in array. This solution has Quadratic time complexity O(n^2)
    public void duplicateElementInArray() {

        int[] arr = getRandomArray(10);

        for (int value : arr) {
            Log.v(TAG, "Input array:" + value);
        }

        for (int x = 0; x < arr.length; x++) {

            for (int y = x + 1; y < arr.length; y++) {

                if (arr[x] == arr[y] && x != y) {
                    Log.v(TAG, " Duplicate element:" + arr[y]);
                }
            }
        }
    }

    //Find all the duplicate element in array, using HashSet, time complexity of this solution is O(n).
    public void duplicateElementInArrayUsingHashSet() {

        int[] arr = getRandomArray(10);

        for (int value : arr) {
            Log.v(TAG, "Input array:" + value);
        }

        HashSet hashSet = new HashSet();

        for (int x = 0; x < arr.length; x++) {

            if (!hashSet.add(arr[x])) {
                Log.v(TAG, " Duplicate element in array :" + arr[x]);
            }
        }
    }
}
