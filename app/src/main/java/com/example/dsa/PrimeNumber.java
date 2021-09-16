package com.example.dsa;

import android.util.Log;

public class PrimeNumber {

    public PrimeNumber() {
    }

    public void isNumberPrimerNumber() {
        int num = 33;
        boolean isPrime = true;

        for (int k = 2; k < num / 2; k++) {
            if (num % k == 0)
                isPrime = false;
        }

        if (isPrime)
            Log.v("===>>>>", num + " is prime number");
        else
            Log.v("===>>>>", num + " is not prime number");
    }


    public void GetFirstNPrimeNumber() {

        int n = 10; // get first "n" prime numbers
        int count = 0; // to track number of prime numbers;

        int number  = 2;
        while (count < n) {

            if(isPrime(number)) {
                count++;
                Log.v("===>>>" ,"Number:"+ number);
            }
            number++;
        }
    }

    private boolean isPrime(int number) {
        for (int l = 2; l <= number / 2; l++) {
            if (number % l == 0) {
                return false;
            }
        }
        return true;
    }

}
