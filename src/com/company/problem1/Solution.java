package com.company.problem1;

import java.time.ZonedDateTime;
import java.util.*;

public class Solution {

    static {

    }

    public static void main(String[] args) {
            Customer listOfCust[] = new Customer[]{
                    new Customer((long) 101,"1234534345","322456","Ram","Kadam","Pune", ZonedDateTime.now()),
                    new Customer((long) 102,"1234534346","413507","Kim","Buer","Pune", ZonedDateTime.now()),
                    new Customer((long) 103,"1234538345","500081","John","Buer","Hyderbad", ZonedDateTime.now()),
                    new Customer((long) 104,"1234234345","500081","Tim","Kebo","Hyderbad", ZonedDateTime.now()),
                    new Customer((long) 105,"1234534345","413507","Abram","Linko","Pune", ZonedDateTime.now()),
                    new Customer((long) 106,"1234134345","500081","Saroj","Mehta","Hyderbad", ZonedDateTime.now())
            };

            List<Customer> customers = new ArrayList<>();
            customers.add(new Customer((long) 101,"1234534345","322456","Ram","Kadam","Pune", ZonedDateTime.now()));
            customers.add( new Customer((long) 103,"1234538345","500081","John","Buer","Hyderbad", ZonedDateTime.now()));


        customers.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer c1, Customer c2) {
                return c1.getFirstName().compareTo(c2.getFirstName());
            }
        });


        //todo print the list of customers here

    }

    /*todo Problem Statement :
    * Write a method to sort the customers by given parameters
    * If input is firstName,asc then sort the list by firstName asc Order
    *
    * */
    public List<Customer> sortBy(String parameter){

        return null;
    }

    /*todo Problem Statement :
     * Write a method to get city wise customer count
     * */
    public Map<String,Integer> cityWiseCustomerCount(){

        return null;
    }



    /*todo
    * write the records in csv file -records.csv
    * headers - id,firstName,LastName,city
    * data lines  -----
    * */
    public void writeToFile(Customer[] customers){

    }
}


