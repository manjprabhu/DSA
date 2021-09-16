package com.example.dsa;

import android.util.Log;

public class SumOfDigit {

    public SumOfDigit() {
    }

    public void sumOfDigit() {
        int num = 123456;

        int r = 0;

        int sum = 0;

        sum = sum + r;

        while (num > 0) {
            // Get the last digit of the number by using modulus operator
            r = num % 10;
            sum = sum + r;
            num = num / 10;
        }
        Log.v("===>>", " Sum:" + sum);
    }

    public void reverseTheNumber() {

        int num = 123;

        int reverse = 0;

        int reminder = 0;

        while (num > 0) {

            reminder = num % 10;

            reverse = reverse * 10 + reminder;

            num = num / 10;
        }
        Log.v("===>>", " reverse:" + reverse);

    }

    public void isMagicNumber() {

        int n = 163, number = 163;

        int sum = 0, rem = 0;

        while (sum > 9 || n > 0) {

            // Once the first iteration of adding the digits in number is done
            // set the value of sum to n and reset sum to zero.

            if (n == 0) {
                n = sum;
                sum = 0;
            }

            rem = n % 10;

            sum = sum + rem;

            n = n / 10;
        }

        if (sum == 1) {
            Log.v("===>>>", number + " is MagicNumber:");
        } else {
            Log.v("===>>>", number + " is not MagicNumber:");
        }

    }

    //A Harshad number is one which is divisible by sum of its digits e.g 21 =  2+ 1 = 3 -> 21/3 = 7
    public void isHarshdNumber() {

        int number  = 171;

        int copyNumber =  number;

        int sum =0;
        int r = 0;

        //Calculate the sum of the digits
        while(number > 0) {
             r = number % 10;

             sum = sum + r;

             number = number /10;

        }

        if(copyNumber % sum ==0) {
            Log.v("===>>>" ,copyNumber +" is Harshad number");
        } else {
            Log.v("===>>>" ,copyNumber +" is not Harshad number");
        }

    }
}
