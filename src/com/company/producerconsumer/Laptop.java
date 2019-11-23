package com.company.producerconsumer;

import java.util.LinkedList;

public class Laptop {

    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 2;

    public void produce() throws InterruptedException {
        int value=0;
        while (true){
            synchronized (this){
                //waiting for consumer thread to consume
                while( list.size() == capacity )
                    wait();

                System.out.println("Producer Thread produced "+value);

                list.add(value++);

                //notify other thread to
                notify();


                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {

        while (true){
            synchronized (this){

                //waiting for producer thread
                while (list.isEmpty())
                    wait();

                int val = list.removeFirst();

                System.out.println("Consumer consumed "+val);

                //notify producer that object is consumed
                notify();

                Thread.sleep(1000);

            }
        }
    }



}
