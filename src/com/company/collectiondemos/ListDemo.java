package com.company.collectiondemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList();
       l.add(6);
       l.add(3);
       l.add(2);

        Iterator a = l.iterator();

        while (a.hasNext()){
            System.out.println(a.next());
        }

        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l.toString());


        //System.out.println(myThnigs.toString());

    }
}
