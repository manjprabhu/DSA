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

        ArrayAlgo arrayAlgo = new ArrayAlgo();

        arrayAlgo.smallestNumber();


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

}