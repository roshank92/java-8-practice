package com.company.simpledemo;

public class ThreadDemo {

    public static void main(String[] args) {
        String names[]= new String[]{"Ravi","ganesh","manish","man","babo","asa"};

        PrintNames job1 = new PrintNames(names,0,2);
        PrintNames job2 = new PrintNames(names,3,5);

        job1.start();
        try {
            job1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        job2.start();


    }
}
