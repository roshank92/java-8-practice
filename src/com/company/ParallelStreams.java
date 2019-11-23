package com.company;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreams {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);


        numbers.stream().forEach(n->{
            System.out.println(Thread.currentThread().getName());
            System.out.println(n);

        });

        System.out.println("with thread");
        numbers.parallelStream().forEach(n->{
            System.out.println(Thread.currentThread().getName());
            System.out.println(n);
        });

        Integer n1= numbers.parallelStream().filter(n-> n==12).findAny().get();
        System.out.println("search"+n1);


    }
}
