package com.example.dsa;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pyramid pyramid = new Pyramid();

        SumOfDigit sumOfDigit = new SumOfDigit();

        PrimeNumber primeNumber = new PrimeNumber();

        primeNumber.GetFirstNPrimeNumber();


    }

    private void findsmallestNumber() {
        int a[] = {10, 2, 54, -76, 19, 30, 77};
        int smallest = Integer.MAX_VALUE;

        for (int k = 0; k < a.length; k++) {

            if (a[k] < smallest) {
                smallest = a[k];
            }
        }
        Log.v("Main", "===>>> Smallest:" + smallest);
    }

    private void secondSmallestElement() {
        int a[] = {10, 2, -54, 96, 19, 30, 77};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int k = 0; k < a.length; k++) {

            if (a[k] < smallest) {
                secondSmallest = smallest;
                smallest = a[k];
            } else if (a[k] > smallest && a[k] < secondSmallest) {
                secondSmallest = a[k];
            }
        }

        Log.v("Main", "===>>> Smallest:" + smallest + "  secondSmallest: " + secondSmallest);
    }

    private void largestElement() {
        int a[] = {10, 2, -54, 676, 19, 30, 77};
        int largest = Integer.MIN_VALUE;

        for (int k = 0; k < a.length; k++) {

            if (a[k] > largest) {
                largest = a[k];
            }
        }
        Log.v("Main", "===>>> largest:" + largest);
    }

    private void secondLargest() {
        int a[] = {10, 2, -54, 76, 19, 30, 77};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int k = 0; k < a.length; k++) {
            if (a[k] > largest) {
                secondLargest = largest;
                largest = a[k];
            } else if (a[k] < largest && a[k] > secondLargest) {
                secondLargest = a[k];
            }
        }
        Log.v("Main", "===>>> largest:" + largest + "  secondLargest: " + secondLargest);
    }

    private void reverseArray() {
        int a[] = {10, 2, -54, 76, 19, 30, 77};

        for (int k = 0; k <= (a.length / 2); k++) {
            int temp = a[k];
            a[k] = a[a.length - 1 - k];
            a[a.length - 1 - k] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            Log.v("Main", "===>>> :" + a[i]);
        }
    }

    private void findPairwithGivenSum() {
        int[] a = {1, 5, 7, 2, 4, 3, 3};
        int sum = 6;

        for (int k = 0; k < a.length; k++) {

            for (int j = k + 1; j < a.length; j++) {

                if (a[k] + a[j] == sum) {
                    Log.v("Main", "===>>> Pair :" + a[k] + " And " + a[j]);
                }
            }
        }
    }
}