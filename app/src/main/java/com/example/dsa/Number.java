package com.example.dsa;

import android.util.Log;

public class Number {

    private final String TAG = Number.class.getSimpleName();

    void RoundtoNearestTen() {
        int number = 23468;
        int x = number/10;
        int y = number%10;

        int n =0;

        if(y>=5) {
            n = (x+1)*10;
        } else {
            n = x*10;
        }

        Log.v(TAG,"===>>> Nearest number:"+n);
    }
}
