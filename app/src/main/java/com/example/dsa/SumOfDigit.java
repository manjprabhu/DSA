package com.example.dsa;

import android.util.Log;

public class SumOfDigit {

    private final String TAG = SumOfDigit.class.getSimpleName();

    public SumOfDigit() {
    }

    //    Sum of all the digits of the given number.
    public void sumOfDigitInNumber() {
        int num = 123456;

        int r;

        int sum = 0;

        while (num > 0) {
            // Get the last digit of the number by using modulus operator
            r = num % 10;
            sum = sum + r;
            num = num / 10;
        }
        Log.v(TAG, " Sum of all digits:" + sum);
    }

    //    Reverse the given number.
    public void reverseTheNumber() {

        int num = 123;

        int reverse = 0;

        int reminder;

        while (num > 0) {

            reminder = num % 10;

            reverse = reverse * 10 + reminder;

            num = num / 10;
        }
        Log.v(TAG, "Number:" + num + "  " + " Reverse Number:" + reverse);

    }

    //    Check if given number is Magic number.
    public void isMagicNumber() {

        int n = 163, number = 163;

        int sum = 0, rem;

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
            Log.v(TAG, number + " is MagicNumber:");
        } else {
            Log.v(TAG, number + " is not MagicNumber:");
        }

    }

    //A Harshad number is one which is divisible by sum of its digits e.g 21 =  2+ 1 = 3 -> 21/3 = 7
    public void isHarshadNumber() {

        int number = 171;

        int copyNumber = number;

        int sum = 0;
        int r;

        //Calculate the sum of the digits
        while (number > 0) {
            r = number % 10;

            sum = sum + r;

            number = number / 10;
        }

        if (copyNumber % sum == 0) {
            Log.v(TAG, copyNumber + " is Harshad number");
        } else {
            Log.v(TAG, copyNumber + " is not Harshad number");
        }
    }

//    A special two-digit number is a number such that when the sum of the digits of the number is added to the product of its digits,
//    the result is equal to the original two-digit number. e.g 59,29

    public void isSpecialTwoDigitNumber() {
        int num = 59;

        int first = num / 10;

        int second = num % 10;

        int sum = first + second;

        int product = first * second;

        if ((sum + product) == num) {
            Log.v(TAG, "===>>> " + num + " is Special 2 digits number");
        } else {
            Log.v(TAG, "===>>> " + num + " is not a special 2 digits number");
        }
    }
}
