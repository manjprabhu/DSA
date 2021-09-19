package com.example.dsa;

import android.os.Bundle;

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

        arrayAlgo.LargestSmallest();

    }
//     Print the below sequence
//     5 4 3 2 1
//     4 3 2 1
//     3 2 1
//     2 1
//     1

    private void pattern() {
        int n = 5;

        for (int k = 0; k < n; k++) {

            for (int j = n - k; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}