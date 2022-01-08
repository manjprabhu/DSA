package com.example.dsa;

import android.util.Log;

public class StackImpl {

    int limit = 10;

    int[] array = new int[limit];

    int top = -1;

    void push(int data) {
        if(top == limit) {
            Log.v("TAG", "Stack overflow");
            return;
        }

        top = top +1;
        array[top] = data;
    }

    void pop () {
        int data = 0;
        if(top ==-1) {
            Log.d("TAG", "stack underflow");
            return;
        } else {
            data = array[top];
            top = top -1;
        }

        Log.d("TAG", "pop: element is: "+ data);
    }

    void peek() {
       if(top == -1) {
           Log.d("TAG", "peek: Stack is empty");
           return;
       }
        Log.d("TAG", "Top element is :"+ array[top]);

    }

    void display() {
        if(top == -1) {
            Log.d("TAG", "display: Stack is empty");
            return;
        }

        for(int i =top;i >=0;i--)  {
            Log.d("TAG", "display: :"+ array[i]);
        }
    }
}
