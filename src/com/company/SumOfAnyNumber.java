package com.company;


import java.util.*;
import java.util.stream.Collectors;

public class SumOfAnyNumber implements Comparable<SumOfAnyNumber>  {

    public static void main(String[] args) {
String a="abbc";
String b="b";
        StringBuilder sb = new StringBuilder(a);

        System.out.println(sb.indexOf(b));

        System.out.println(sb.replace(sb.indexOf(b),b.length()+1,""));
        System.out.println(sb.replace(sb.indexOf(b),b.length()+1,""));



    }

    @Override
    public int compareTo(SumOfAnyNumber sumOfAnyNumber) {
        return 0;
    }
}
