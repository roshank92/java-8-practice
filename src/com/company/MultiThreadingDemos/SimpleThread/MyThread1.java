package com.company.MultiThreadingDemos.SimpleThread;

public class MyThread1 extends Thread {

    StringBuffer myname = new StringBuffer("rkboss");

    @Override
    public void run() {
        int count =1;
        while (count<=10){
            System.out.println("string1  "+myname.append(count));
            count++;
        }
    }


}
