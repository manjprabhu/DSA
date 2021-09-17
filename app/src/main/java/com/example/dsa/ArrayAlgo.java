package com.example.dsa;

import android.util.Log;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArrayAlgo {

    public ArrayAlgo() {
    }

    //Count the occurrence of each number in an array
    public void countTheOccurrence() {

        int[] arr = {1, 3, 4, 6, 6, 8, 9, 9, 8, 8};

        HashMap<Integer, Integer> countMap = new HashMap<>();
        int count = 0;

        for (int k = 0; k < arr.length; k++) {

            if (countMap.containsKey(arr[k])) {
                count = countMap.get(arr[k]);
                count++;
                countMap.put(arr[k], count);
            } else {
                countMap.put(arr[k], 1);
            }
        }

        Iterator iterator = countMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Log.v("===>>>" ,""+iterator.next());
        }

        for(Map.Entry entry : countMap.entrySet()) {
            Log.v("===>>" ,entry.getKey() + " occurred " + entry.getValue() + " times");

        }
    }
}
