package com.company.GenericsExample;

public class GenericsNewDemo<T> {

    private T t;

    public  T get(){
        return  t;
    }

    public  void set(T t){
        this.t = t;
    }




    public static void main(String[] args) {
        GenericsNewDemo<String> str  = new GenericsNewDemo<>();
        str.set("hello");
        System.out.println(str);

        GenericsNewDemo<Integer> i  = new GenericsNewDemo<>();
        i.set(123);
        System.out.println(i);


    }

}
