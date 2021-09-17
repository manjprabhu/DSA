package com.example.dsa;

import android.util.Log;

public class PrimeNumber {

    public PrimeNumber() {
    }

    public void isNumberPrimerNumber() {
        int num = 33;
        boolean isPrime = true;

        for (int k = 2; k < num / 2; k++) {
            if (num % k == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            Log.v("===>>>>", num + " is prime number");
        else
            Log.v("===>>>>", num + " is not prime number");
    }


    public void GetFirstNPrimeNumber() {
        int n = 10; // get first "n" prime numbers
        int count = 0; // to track number of prime numbers;

        int number = 2;
        while (count < n) {

            if (isPrime(number)) {
                count++;
                Log.v("===>>>", "Number:" + number);
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


    // Find "n" prime numbers after given number "limit"
    public void FindPrimeAfterN() {

        int count = 0; // to track the number of prime number
        int limit = 100;// Starting number.
        int n = 10;// Find first "n" prime number after "limit"

        while (count < n) {
            if (isPrime(limit)) {
                count++;
                Log.v("===>>>", "Limit:" + limit);
            }
            limit++;
        }
    }

    //Find all the prime numbers between 2 given numbers ( loweLimit & upperLimit)
    public void primeNumbersBetween2Numbers() {

        int lowerLimit = 10;
        int upperLimit = 1000;

        int number = lowerLimit;

        while (number >= lowerLimit && number < upperLimit) {

            if (isPrime(number)) {
                Log.v("===>>>", "number:" + number);
            }
            number++;
        }
    }

}
