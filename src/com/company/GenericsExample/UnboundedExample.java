package com.company.GenericsExample;

import java.util.ArrayList;
import java.util.List;

public class UnboundedExample {

    public static void printInfo(List<?> list){
        for(Object o: list){
            System.out.println(o.toString());
        }
    }

    public static void main(String[] args) {
        List l = new ArrayList<>();
        l.add("string");
        l.add(12);
        l.add(12d);
        UnboundedExample.printInfo(l);
    }
}
