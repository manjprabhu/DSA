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

        for (int i = 1; i < length; i++) {

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

    //    Find all the pair of number in a given array whose sum is given number. Time complexity is O(n^2).
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

    //    Improved solution. time complexity O(n) and spance complexity is O(n)
    public void pairWithGivenSumSolutionTwo() {
//        int[] a = getRandomArray(10);

        int[] a = {2, 4, 6, 5, 3};

        for (int value : a) {
//            Log.v(TAG, "Input array:" + value);
        }
        int sum = 8;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < a.length; i++) {

            if (hashMap.containsKey(sum - a[i])) {
                Log.v(TAG, "===>>> Sum: " + sum + " Pair( " + a[i] + " ," + a[hashMap.get(sum - a[i])] + ")");
            }
            hashMap.put(a[i], i);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            Log.v(TAG, "===>>> (" + entry.getKey() + "," + entry.getValue() + ")");
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

        for (int i : arr) {

            if (i < smallest) {
                smallest = i;
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

        for (int i : arr) {

            if (!hashSet.add(i)) {
                Log.v(TAG, " Duplicate element in array :" + i);
            }
        }
    }

    //    Find the single missing number from given array of natural number.
    public void findMissingNumber() {
        int[] a = {1, 2, 3, 4, 6, 7, 8, 9, 10, 11};

        int sum = 0;

        for (int i : a) {
            sum = sum + i;
        }

        int sum1 = a[a.length - 1] * (a[a.length - 1] + 1) / 2;

        Log.v(TAG, "Missing Number is:" + (sum1 - sum));

    }

    //    Find largest and smallest in an array
    public void LargestSmallest() {
        int[] a = getRandomArray(10);

        for (int value : a) {
            Log.v(TAG, "Input array:" + value);
        }

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int x = 0; x < a.length; x++) {

            if (a[x] > largest) {
                largest = a[x];
            } else if (a[x] < smallest) {
                smallest = a[x];
            }
        }

        Log.v(TAG, "Largest Element is :" + largest + " Smallest element is :" + smallest);

    }

    //    Factorial of a number
    public void factorialOfNumber() {
        int num = 6;
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        Log.v(TAG, "Factorial of " + num + " is :" + fact);
    }

    //    Find the Number Occurring Odd Number of Times , Brute force way O(n^2)
    public void OddOccurrenceNumber() {

        int[] a = {1, 2, 3, 2, 3, 1, 3};

        for (int value : a) {
            Log.v(TAG, "===>>> value:" + value);
        }

        for (int value : a) {

            int i;
            for (i = 0; i < a.length; i++) {
                int count = 0;
                for (int k : a) {
                    if (a[i] == k)
                        count++;
                }
                if (count % 2 != 0)
                    Log.v(TAG, "===>>> Number:" + value);
            }
        }

    }
}
