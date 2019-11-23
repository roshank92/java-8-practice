package com.company.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        List<Person> p = new ArrayList<>();
        p.add(new Person(12,"Roshan"));
        p.add(new Person(11,"Arnab"));

        Collections.sort(p, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return 0;
            }
        });

    }


}
