package com.company.GenericsExample;

public class GenericsTypeOld {

        private Object t;

        public  Object get(){
            return  t;
        }

    public  void set(Object t){
        this.t = t;
    }

    public static void main(String[] args) {
        GenericsTypeOld old = new GenericsTypeOld();
        old.set("str");
        String str =(String) old.get();
        Integer i =(Integer) old.get();//gives class cast exception
        System.out.println(str);
    }





}

