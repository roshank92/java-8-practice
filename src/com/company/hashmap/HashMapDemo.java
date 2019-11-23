package com.company.hashmap;

import java.util.HashMap;
import java.util.Map;


public class HashMapDemo {

    private String msg;

    public void msg(){
        System.out.println(msg);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Map<String,Integer> map = new HashMap<>();
        map.put("abc",2);

        map.forEach((k,v) ->{
            System.out.println(k);
            System.out.println(v);
        });

    }
}
