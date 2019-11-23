package com.company.MultiThreadingDemos.SimpleThread;

public class MyThread2 extends Thread {


    @Override
    public void run() {
        int count =1;
        while (count<=10){
            System.out.println("t2 count is "+count);
            count++;
        }
    }
}
