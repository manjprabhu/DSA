package com.example.dsa;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class practice {

    public practice() {
//        pyramidNumber1();
        printPattern();
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

    void reverseArray() {
        int a[] =  {1, 2, 3, 4, 5, 6, 7};

        for(int i=0;i<=a.length/2;i++) {
            int temp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = temp;
        }

        for ( int i = 0; i <a.length; i++ ) {
            Log.v("practice","Reverse Array:"+a[i]);
        }
    }

    void countTheOccurrence() {
        int a[] =  {1, 2, 3, 4, 4, 4, 7};
        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;

        for(int i=0;i<a.length;i++) {

            if(map.get(a[i]) != null) {
                count = map.get(a[i]);
                count = count+1;
                map.put(a[i],count);
            } else {
                map.put(a[i],1);
            }
        }

        for( Map.Entry x : map.entrySet() ) {
            Log.v("practice"," Key:"+ x.getKey() + " Occures :"+ x.getValue());
        }
    }

    void length() {
        String str = "abcdafhsa";

        for(int k=0;k<str.length();k++) {
            char c = str.charAt(k);
        }
    }

    //     Print the below sequence
//     1
//     2 2
//     3 3 3
//     1 2 3 4
//     1 2 3 4 5

    void printPattern() {

        for(int i=1;i<=5;i++) {
            for(int j=5;j>5-i;j--) {
                System.out.print(" ");
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }



}