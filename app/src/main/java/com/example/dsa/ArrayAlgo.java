package com.example.dsa;

import android.util.Log;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

public class ArrayAlgo {

    private final String TAG = ArrayAlgo.class.getSimpleName();

    public ArrayAlgo() {
    }

    /**
     * Utility method to return random array of Integers in a range of 0 to 10
     */
    public static int[] getRandomArray(int length) {
        int[] randomArray = new int[length];

        for ( int i = 1; i < length; i++ ) {

            randomArray[i] = (int) (Math.random() * 25);
        }
        return randomArray;
    }

    static void lengthOfLongSubArray() {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int n = arr.length;
        int k = 15;
        // HashMap to store (sum, index) tuples
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        // traverse the given array
        for ( int i = 0; i < n; i++ ) {

            // accumulate sum
            sum += arr[i];

            // when subarray starts from index '0'
            if (sum == k)
                maxLen = i + 1;

            // make an entry for 'sum' if it is
            // not present in 'map'
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

            // check if 'sum-k' is present in 'map'
            // or not
            if (map.containsKey(sum - k)) {

                // update maxLength
                if (maxLen < (i - map.get(sum - k)))
                    maxLen = i - map.get(sum - k);
            }
        }

        Log.v("ArrayAlgo", "Maxlen:" + maxLen);
    }

    //    Count the occurrence of each number in an array
    public void countTheOccurrence() {

        int[] arr = {1, 3, 4, 6, 6, 8, 9, 9, 8, 8};

        HashMap<Integer, Integer> countMap = new HashMap<>();
        int count;

        for ( int i : arr ) {

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

        for ( Map.Entry entry : countMap.entrySet() ) {
            Log.v(TAG, entry.getKey() + " occurred " + entry.getValue() + " times");

        }
    }

    //    Reverse the given array
    public void reverseArray() {
        int[] a = getRandomArray(10);

        for ( int value : a ) {
            Log.v(TAG, "Input array:" + value);
        }

        for ( int k = 0; k < a.length / 2; k++ ) {

            int temp = a[k];

            a[k] = a[a.length - 1 - k];

            a[a.length - 1 - k] = temp;
        }

        for ( int j : a ) {
            Log.v(TAG, " Element:" + j);
        }
    }

    //    Find all the pair of number in a given array whose sum is given number. Time complexity is O(n^2).
    public void pairWithGivenSum() {
        int[] a = getRandomArray(10);

        for ( int value : a ) {
            Log.v(TAG, "Input array:" + value);
        }
        int sum = 16;

        for ( int i = 0; i < a.length; i++ ) {

            for ( int j = i + 1; j < a.length; j++ ) {

                if (a[i] + a[j] == sum) {
                    Log.v(TAG, a[i] + " and " + a[j] + " makes sum: " + sum);
                }
            }
        }
    }

    //    Improved solution. time complexity O(n) and space complexity is O(n)
    public void pairWithGivenSumSolutionTwo() {
//        int[] a = getRandomArray(10);

        int[] a = {2, 4, 6, 5, 3};

        for ( int value : a ) {
//            Log.v(TAG, "Input array:" + value);
        }
        int sum = 8;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for ( int i = 0; i < a.length; i++ ) {

            if (hashMap.containsKey(sum - a[i])) {
                Log.v(TAG, "===>>> Sum: " + sum + " Pair( " + a[i] + " ," + a[hashMap.get(sum - a[i])] + ")");
            }
            hashMap.put(a[i], i);
        }
        for ( Map.Entry entry : hashMap.entrySet() ) {
            Log.v(TAG, "===>>> (" + entry.getKey() + "," + entry.getValue() + ")");
        }

    }

    //    Find the largest element in an given array
    public void largestNumber() {
        int[] arr = getRandomArray(10);

        for ( int value : arr ) {
            Log.v(TAG, "Input array:" + value);
        }

        int largest = Integer.MIN_VALUE;

        for ( int k = 0; k < arr.length; k++ ) {

            if (arr[k] > largest) {
                largest = arr[k];
            }
        }
        Log.v(TAG, "Largest number is :" + largest);
    }

    //    Find  the smallest element in an given array
    public void smallestNumber() {
        int[] arr = getRandomArray(10);

        for ( int value : arr ) {
            Log.v(TAG, "Input array:" + value);
        }

        int smallest = Integer.MAX_VALUE;

        for ( int i : arr ) {

            if (i < smallest) {
                smallest = i;
            }
        }
        Log.v(TAG, "Smallest number is :" + smallest);
    }

    //    Find the Largest and second Second largest element in an array
    public void secondLargest() {
        int[] arr = getRandomArray(10);

        for ( int value : arr ) {
            Log.v(TAG, "Input array:" + value);
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for ( int i : arr ) {

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

        for ( int value : arr ) {
            Log.v(TAG, "Input array:" + value);
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for ( int k : arr ) {
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

        for ( int value : arr ) {
            Log.v(TAG, "Input array:" + value);
        }

        for ( int x = 0; x < arr.length; x++ ) {

            for ( int y = x + 1; y < arr.length; y++ ) {

                if (arr[x] == arr[y] && x != y) {
                    Log.v(TAG, " Duplicate element:" + arr[y]);
                }
            }
        }
    }

    //Find all the duplicate element in array, using HashSet, time complexity of this solution is O(n).
    public void duplicateElementInArrayUsingHashSet() {

        int[] arr = getRandomArray(10);

        for ( int value : arr ) {
            Log.v(TAG, "Input array:" + value);
        }

        HashSet hashSet = new HashSet();

        for ( int i : arr ) {

            if (!hashSet.add(i)) {
                Log.v(TAG, " Duplicate element in array :" + i);
            }
        }
    }

    //    Find the single missing number from given array of natural number.
    public void findMissingNumber() {
        int[] a = {1, 2, 3, 4, 6, 7, 8, 9, 10, 11};

        int sum = 0;

        for ( int i : a ) {
            sum = sum + i;
        }

        int sum1 = a[a.length - 1] * (a[a.length - 1] + 1) / 2;

        Log.v(TAG, "Missing Number is:" + (sum1 - sum));

    }

    //    Find largest and smallest in an array
    public void LargestSmallest() {
        int[] a = getRandomArray(10);

        for ( int value : a ) {
            Log.v(TAG, "Input array:" + value);
        }

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for ( int x = 0; x < a.length; x++ ) {

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
        int num = 13;
        long fact = 1;

        for ( int i = 1; i <= num; i++ ) {
            fact = fact * i;
        }
        Log.v(TAG, "Factorial of " + num + " is :" + fact);
    }

    //    Find the Number Occurring Odd Number of Times. Using Hashmap.
    public void OddOccurrenceNumber() {

        int[] a = {1, 2, 2, 1, 3, 1, 3, 3};

        for ( int value : a ) {
            Log.v(TAG, "===>>> value:" + value);
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;

        for ( int x = 0; x < a.length; x++ ) {

            if (hashMap.containsKey(a[x])) {
                count = hashMap.get(a[x]);
                count++;
                hashMap.put(a[x], count);
            } else {
                hashMap.put(a[x], 1);
            }
        }

        for ( Map.Entry entry : hashMap.entrySet() ) {
            if ((Integer) entry.getValue() % 2 != 0) {
                Log.v(TAG, "Number  " + entry.getKey() + " Occurred odd number of times");
            }
        }
    }

    public void fibbonacciNumber() {
        int n1 = 0, n2 = 1, sum = 0;

        int limit = 7;

        Log.v(TAG, "===>>> " + n1);

        Log.v(TAG, "===>>> " + n2);

        for ( int i = 2; i <= limit; i++ ) {

            sum = n1 + n2;

            Log.v(TAG, "===>>> " + sum);

            n1 = n2;

            n2 = sum;
        }
    }

    public void NthFibonacciNUmber() {

        int n1 = 0, n2 = 1, sum = 0;

        int x = callRecursion(5);

        Log.v(TAG, "===>>> Recursion:" + callRecursion(6));
    }

    private int callRecursion(int limit) {

        if (limit < 2) {
            Log.v(TAG, "Element :" + limit);
            return limit;
        } else return callRecursion(limit - 1) + callRecursion(limit - 2);
    }

    //Count all the occurence of a given number in an array in such a way that
    //next number of given number is greater the given number
    // Given number is 2 and next of given number in array shall be greater than given number (i.e >2)
    public void findtheOccurence() {
        int[] a = {1, 2, 4, 2, 6, 4, 2, 3};

        int count = 0, givenNumber = 2;
        for ( int i = 0; i < a.length; i++ ) {

            //Check if current number is givenNumber  (i.e 2) and next element in array shall be greater than
            // than givenNumber (> 2).
            if (a[i] == givenNumber && a[i + 1] > givenNumber) {
                count++;
            }
        }
        Log.d(TAG, "===>>> Count of 2:" + count);
    }

    public void firstRepeatingElement() {
        int[] a = {9, 12, 4, 3, 6, 4, 2, 9};

        for ( int x : a ) {
            Log.d(TAG, "===>> Array: " + x);
        }

        boolean found = false;
        for ( int x = 0; x < a.length; x++ ) {
            for ( int y = 0; y < a.length; y++ ) {
                if (a[x] == a[y] && x != y) {
                    Log.v(TAG, "===>>> First Duplicate element is:" + a[x]);
                    found = true;
                    break;
                }
            }
            if (found)
                break;
        }
    }

    public void rotateBruteForce(int k) {
        int[] nums = {9, 12, 4, 3, 6, 4, 2};
        for ( int i = 0; i < k; i++ ) {
            for ( int j = nums.length - 1; j > 0; j-- ) {
                // move each number by 1 place
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;

                Log.v(TAG, " --------------------------");
            }
        }
        for ( int x = 0; x < nums.length; x++ ) {
            Log.v(TAG, " ===>>> Rotated array:" + nums[x]);
        }
    }

    //Using temp array.
    public void rotateArrayKtimes() {
        int[] nums = {9, 12, 4, 3, 6, 4, 2};
        int k = 2;
        //Output
//        int[] nums = {4,3,6,4,2,12,9};
        int[] temp = new int[k];

        for ( int i = 0; i < k; i++ ) {
            temp[i] = nums[i];
            //temp = {9,12}
        }

        for ( int i = k; i < nums.length - 1; i++ ) {
            nums[i - k] = nums[i];
        }

    }

    //Incomplete
    public void rotateleft() {
        int k = 2;
        int[] nums = {9, 12, 4, 3, 6, 4, 2};
        int[] temp = new int[k];

        for ( int i = 0; i < k; i++ ) {
            temp[i] = nums[i];
        }

        for ( int x = k; x < nums.length; x++ ) {
            nums[x - k] = nums[x];
        }
        for ( int y = 0; y < k; y++ ) {
            nums[y + nums.length - k] = temp[y];
        }

        for ( int m = 0; m < nums.length; m++ ) {
            Log.v(TAG, "===> array:" + nums[m]);
        }
    }

    public void SubArrayWithGivenSum() {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int sum = 5;

        for ( int i = 0; i < arr.length; i++ ) {

            int sum_so_far = 0;

            for ( int j = i; j < arr.length; j++ ) {

                sum_so_far = sum_so_far + arr[j];

                if (sum_so_far == sum) {
                    Log.v(TAG, "===> Element found b/w:" + i + " and " + j);
                }
            }
        }
    }

    public void allSubArray() {
        int[] arr = new int[]{1, 2, 3, 4};

        //Starting point of subarray
        for ( int i = 0; i < arr.length; i++ ) {

            //Ending point of subarray
            for ( int j = i; j < arr.length; j++ ) {

                for ( int k = i; k <= j; k++ ) {
                    System.out.print("" + arr[k] + " ");
                }
                System.out.println();
            }

        }
    }

    public void sumOfAllSubarray() {
        int[] arr = {1, 2, 3, 4};

        int sum = 0;
        for ( int i = 0; i < arr.length; i++ ) {

            int temp_sum = 0;

            for ( int j = i; j < arr.length; j++ ) {

                for ( int k = i; k <= j; k++ ) {

                    temp_sum = temp_sum + arr[k];
                }
            }

            sum = sum + temp_sum;

        }

        Log.v(TAG, "Sum of subarray:" + sum);
    }

    public void subArrayWithGivenSum() {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int sum = 33;

        int cur_sum = 0;

        for ( int i = 0; i < arr.length; i++ ) {

            cur_sum = arr[i];

            for ( int j = i + 1; j <= arr.length; j++ ) {

                if (cur_sum == sum) {
                    Log.v(TAG, " Sum is found b/w:  " + i + " and " + (j - 1));
                    return;
                }
                if (cur_sum > sum || j == arr.length)
                    break;
                cur_sum = cur_sum + arr[j];
            }

        }
    }

    //Find the smallest subArray whose sum is greater than the given value
    public void smallestSubArray() {

        int[] arr = {1, 4, 45, 6, 10, 19};
        int x = 51;
        int cur_sum = 0;

        // to track the current minimum length subarray
        int cur_min = arr.length;

        for ( int i = 0; i < arr.length; i++ ) {

            cur_sum = arr[i];

            for ( int j = i + 1; j < arr.length; j++ ) {

                cur_sum = cur_sum + arr[j];

                if (cur_sum > x && ((j - i + 1) < cur_min)) {
                    cur_min = (j - i + 1);
                }
            }
        }
        Log.v(TAG, "Minimum length of subarray:" + cur_min);
    }

    // Java implementation to find first
// element occurring k times
    void firstElement() {
        int arr[] = {1, 7, 4, 3, 4, 8, 7};
        int n = arr.length;

        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for ( int i = 0; i < n; i++ ) {
            int count = 0;
            if (map.containsKey(arr[i])) {
                count = map.get(arr[i]);
                count = count + 1;
                map.put(arr[i], count);
            } else {
                map.put(arr[i], 1);
            }
        }


        for ( int i = 0; i < n; i++ ) {
            if (map.get(arr[i]) == k) {
                Log.v(TAG, "Value:" + arr[i]);
                return;
            }
        }
    }

    void PairWithLargestProduct() {
        int a[] = {10, 20, 12, 40, 50};

        int n = a.length;

        //get all the pair

        int largest_product = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        int largest = 0, secondLargest = 0;


        for ( int i = 0; i < n - 1; i++ ) {


            for ( int j = i + 1; j <= n - 1; j++ ) {

                int prod = a[i] * a[j];
                if (prod > largest_product && prod > second_largest) {
                    second_largest = largest_product;
                    largest_product = prod;

                } else if (prod < largest_product && prod > second_largest) {
                    second_largest = prod;
                    largest = a[i];
                    secondLargest = a[j];
                }

            }
        }
        Log.v(TAG, "===>>> Largest Product:" + largest);
        Log.v(TAG, "===>>> Second largest  Product:" + secondLargest);
    }


//    previous smallest Element
//    previous largest element
//    Next smallest element
//    Next largest element

    void nextLargestElement() {
        int[] a = {4, 10, 5, 8, 20, 15, 3, 12};

        Stack<Integer> stack = new Stack<>();

        for(int i=a.length-1;i>=0;i--) {

            while(!stack.isEmpty() && stack.peek()<=a[i]) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                Log.d(TAG, "nextLargestElement: "+a[i] + " is :" + -1);
            } else {
                Log.d(TAG, "nextLargestElement: "+a[i] + " is :"+stack.peek());
            }

            stack.push(a[i]);

        }

    }


}
