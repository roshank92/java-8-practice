package com.company.reflectionapidemo;

// A simple Java program to demonstrate the use of reflection
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

// class whose object is to be created
class Test
{
    // creating a private field
    private String s;

    // creating a public constructor
    public Test() { s = "GeeksforGeeks"; }

    public Test(int a) { s = "GeeksforGeeks"+a; }

    // Creating a public method with no arguments
    public void method1() {
        System.out.println("The string is " + s);
    }

    // Creating a public method with int as argument
    public void method2(int n) {
        System.out.println("The number is " + n);
    }

    // creating a private method
    private void method3() {
        System.out.println("Private method invoked");
    }
}

class Demo
{
    public static void main(String args[]) throws Exception
    {
        // Creating object whose property is to be checked
        Test obj = new Test();

        // Creating class object from the object using
        // getclass method
        Class cls = obj.getClass();
        System.out.println("The name of class is " +
                cls.getName());

        // Getting the constructor of the class through the
        // object of the class
        Constructor constructor = cls.getConstructor();
        Constructor constructors[] = cls.getConstructors();
        for(Constructor constructor1: constructors){
            System.out.println("con :" + constructor1.getName());
            System.out.println("con :" + constructor1.getTypeParameters());
        }

    }
}

