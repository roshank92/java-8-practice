package com.company.hashmap;

public class StringDemo {
    public static void main(String[] args) {
        String a = new String("abc");
        String b = new String("abc");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        StringBuffer buf = new StringBuffer("java");
        StringBuilder builder = new StringBuilder("java");
        System.out.println(buf.replace(0,1,""));
        System.out.println(buf);
        String c = a.replaceFirst("a","java");
        System.out.println(c);
        System.out.println(a);




    }
}
