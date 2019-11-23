package com.company.customexceptions;

public class CheckedExceptionDemo {

    public static void main(String[] args) {
        CheckedExceptionDemo demo = new CheckedExceptionDemo();
        try {
            Student.checkName("sadsad");
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static  class Student{

        public Student(){

        }

        public static void  checkName(String name) throws NameNotFoundException {
            if(name.equals("")){
                throw new NameNotFoundException("name not found");
            }
            System.out.println(name);
        }


    }
}
