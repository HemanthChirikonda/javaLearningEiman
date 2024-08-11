package com.learning.day19;

public class MyThreadExample extends Thread{

    @Override
    public void run() {
      for (int i = 0; i < 100; i++) {
          System.out.println("Thread 1 --"+ i);
      }
    }
}
