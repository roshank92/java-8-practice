package com.company.producerconsumer;

public class ProducerConsumerDemo {
    public static void main(String[] args) throws InterruptedException {

            Laptop laptop = new Laptop();

        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    laptop.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    laptop.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        producerThread.start();
        consumerThread.start();


        producerThread.join();
        consumerThread.join();
    }
}
