package com.example.dsa;

import android.util.Log;

public class QueueImpl {

    int limit = 10;
     int front = 0;
     int rear = 0;
     int[] array = new int[limit];

     void enQueue(int data) {
         if(rear == limit) {
             Log.d("TAG", "enQueue: Queue is full");
             return;
         }
         array[rear] = data;
         rear++;
     }

     void deQueue() {
         if(front == limit) {
             Log.d("TAG", "deQUeue: Queue is empty");
             return;
         }
         Log.d("TAG", "deQUeue: Element removed from Queue :"+ array[front]);
         front++;
     }

     void display() {
         if(front == limit) {
             Log.d("TAG", "display: Queue is empty:");
             return;
         }

         for(int i =front;i<=rear;i++) {
             Log.d("TAG", "display: "+ array[i]);
         }

     }
}
