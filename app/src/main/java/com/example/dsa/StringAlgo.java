package com.example.dsa;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;

public class StringAlgo {

    private final String TAG = StringAlgo.class.getSimpleName();

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
// One way
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            nStr = nStr + c;
        }
//Other way
        char[] chars = str.toCharArray();
        int start = 0, end = chars.length-1;

        while(start<=end) {
            char temp  = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        nStr =new String(chars);

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

        Log.v("StringAlgo", " " + name.charAt(0));
        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i) == ' ') {
                Log.v("StringAlgo", " " + name.charAt(i + 1));
            }
        }
    }

    public void swapFirstnLastCharofWord() {
        String name = "Prakash Kumar Sharma";

        char[] chars = name.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            int k = i;
            while (i < chars.length && chars[i] != ' ')
                i++;
                char temp = chars[i-1];
                chars[i-1] = chars[k];
                chars[k] = temp;
        }

        Log.v("StringAlgo", "new String:" + new String(chars));
    }


    void reverseWordinString() {
        String str = "i,like,this,program,very,much";
        //output = " much very program this like i"

        String[] str1 = str.split(",");

        Log.v(TAG,"Str1 length:"+ str1.length);

        String output = "";

        for(int i= str1.length-1;i>=0;i--) {
            output = output + (str1[i] + ".");
        }

        Log.v(TAG," Reverse String:"+output);
    }


}

