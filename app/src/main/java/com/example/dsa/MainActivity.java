package com.example.dsa;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pyramid pyramid = new Pyramid();

        pyramid.invertedHalfNumberPyramid();

        SumOfDigit sumOfDigit = new SumOfDigit();


        PrimeNumber primeNumber = new PrimeNumber();

        ArrayAlgo arrayAlgo = new ArrayAlgo();

        arrayAlgo.OddOccurrenceNumber();

    }
}