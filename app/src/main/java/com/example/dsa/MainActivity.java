package com.example.dsa;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        Pyramid pyramid = new Pyramid();
//
        practice practice = new practice();
//
//        SumOfDigit sumOfDigit = new SumOfDigit();
//
//        PrimeNumber primeNumber = new PrimeNumber();
//
//        ArrayAlgo arrayAlgo = new ArrayAlgo();
////        arrayAlgo.PairWithLargestProduct();
//
////        StringAlgo stringAlgo = new StringAlgo();
//
////        ArrayAlgorithms arrayAlgorithms = new ArrayAlgorithms();

        QueueImpl queue  = new QueueImpl();

        queue.enQueue(10);
        queue.enQueue(11);
        queue.enQueue(12);
        queue.enQueue(13);
        queue.enQueue(14);

        queue.display();

        queue.deQueue();
        queue.deQueue();

//        queue.display();

      ArrayAlgo arrayAlgo = new ArrayAlgo();
      arrayAlgo.nextLargestElement();

    }
}