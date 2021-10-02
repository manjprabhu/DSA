package com.example.dsa;

public class Pyramid {

    public Pyramid() {
    }

//     Print the below sequence
//     *
//     * *
//     * * *
//     * * * *
//     * * * * *

    public void halfStarPyramid() {

        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//     Print the below sequence
//     1
//     1 2
//     1 2 3
//     1 2 3 4
//     1 2 3 4 5

    public void halfNumberPyramid() {
        int n = 10;

        for (int k = 1; k <= n; k++) {

            for (int l = 1; l <= k; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }

//     Print the below sequence
//     1
//     2 2
//     3 3 3
//     4 4 4 4
//     5 5 5 5 5

    public void repeatHalfPyramidNumber() {
        int n = 5;

        for (int k = 1; k <= n; k++) {

            for (int l = 1; l <= k; l++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }


//     Print the below sequence
//     5 4 3 2 1
//     4 3 2 1
//     3 2 1
//     2 1
//     1

    public void reversePyramid() {
        int n = 5;

        int limit = n;
        for (int k = 1; k <= n; k++) {

            for (int l = limit; l >= 1; l--) {
                System.out.print(l + " ");
            }
            limit = n - k;
            System.out.println();
        }
    }

//    Print the below pattern
//    1 2 3 4 5
//    1 2 3 4
//    1 2 3
//    1 2
//    1

    public void invertedHalfNumberPyramid() {
        int n = 5;
        for (int k = 0; k < n; k++) {

            for (int l = 1; l <= n - k; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }

//     Print the below sequence
//     5 5 5 5 5
//     4 4 4 4
//     3 3 3
//     2 2
//     1

    public void reverseHalfPyramidRepeatNumber() {
        System.out.print("reverseHalfPyramidRepeatNumber");
        System.out.println();
        int n = 5;

        int limit = n;

        for (int k = 1; k <= n; k++) {

            for (int l = limit; l >= 1; l--) {
                System.out.print(limit + " ");
            }
            limit = limit - 1;
            System.out.println();
        }
    }

//     Print the below sequence
//    1
//    2  3
//    4  5  6
//    7  8  9  10
//    11 12 13 14 15

    public void patternOne() {

        int num = 1;
        int noOfRows = 5;

        for (int k = 0; k < noOfRows; k++) {

            for (int l = 0; l < k + 1; l++) {

                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();
        }
    }

}
