package com.company.customexceptions;

import java.util.Scanner;

public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = sc.next();

        if(name.length() !=5){
            throw new InvalidInputException();
        }

    }
}
