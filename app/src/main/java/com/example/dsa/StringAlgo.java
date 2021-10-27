package com.example.dsa;

import android.util.Log;

import java.util.ArrayList;

public class StringAlgo {

    public void pangramCheck() {
        String str = "The quick brown fox jumps over the lazy dog";
        int index = 0;
        boolean[] mark = new boolean[26];
        boolean isPangram = false;


        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
            } else {
                continue;
            }
            mark[index] = true;
        }

        for (int x = 0; x < 26; x++) {
            isPangram = mark[x] != false;
        }

        if (isPangram) {
            Log.v("StringAlgo", "Given string is Pangram");
        } else {
            Log.v("StringAlgo", "Given string is not Pangram");
        }
    }

    public void missingCharFromPangram() {
        String str = "The quick brown fox jumps over the lazy dog";

        boolean[] mark = new boolean[26];
        int index = 0;

        for (int x = 0; x < 26; x++) {
            Log.v("StringAlgo", "Mark:" + mark[x]);
        }
        ArrayList<Character> MissingChar = new ArrayList<>(26);

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
            } else {
                continue;
            }
            mark[index] = true;
        }
        for (int x = 0; x < 26; x++) {
            if (mark[x] == false) {
                MissingChar.add((char) (x + 'a'));
            }
        }

        for (int x = 0; x < MissingChar.size(); x++) {
            Log.v("StringAlgo", "Missing Char:" + MissingChar.get(x));
        }

    }

    public void reverseString() {
        String str = "abcdefgh";
        String nStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            nStr = nStr + c;
        }

        Log.v("StringAlgo", "String:" + str + " Reverse String:" + nStr);
    }

    public void reverseStringBuiltInMethod() {
        String str = "abcdefgh";

        StringBuilder stringBuilder = new StringBuilder(str);

        stringBuilder.reverse();

        str = stringBuilder.toString();

        Log.v("StringAlgo", "String:" + str);
    }

    public void isDigitOrString() {
        String str = "123h";
        boolean isDigit = true;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) == false) {
                isDigit = false;
            }
        }
        if (isDigit) {
            Log.v("StringAlgo", "isDigits");
        } else {
            Log.v("StringAlgo", "is not digit");
        }
    }

    public void initialsOfName() {
        String name = " Prakash Kumar Sharma";

        Log.v("StringAlgo", " "+ name.charAt(0));
        for(int i=0;i<name.length();i++) {

            if(name.charAt(i) == ' ') {
                Log.v("StringAlgo", " "+ name.charAt(i+1));
            }

        }
    }

}

