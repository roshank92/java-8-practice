package com.company.GenericsExample;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundExample {


    //unbounded example
    public static double sum(List<? extends  Number> list){
        double sum=0d;

        for(Number n:list){
            sum = sum+n.doubleValue();
        }
        return sum;
    }



    public static void main(String[] args) {
        List variousNumbers = new ArrayList();
        variousNumbers.add(100);
        variousNumbers.add(10d);
        variousNumbers.add(10l);
        variousNumbers.add(10f);

        System.out.println(UpperBoundExample.sum(variousNumbers));



    }

}
