package com.example.dsa;

public class practice {

    public practice() {
        pyramidNumber1();
    }

    //     Print the below sequence
//     1
//     1 2
//     1 2 3
//     1 2 3 4
//     1 2 3 4 5

    private void pyramidNumber() {

        for ( int i = 1; i <= 5; i++ ) {
            for ( int j = 1; j <= i; j++ ) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

//     Print the below sequence
//    1
//    2  3
//    4  5  6
//    7  8  9  10
//    11 12 13 14 15

    private void pyramidNumber1() {
        int k =1;
        for ( int i = 1; i <=5; i++ ) {

            for(int j=1;j<=i;j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();

        }

    }
}
