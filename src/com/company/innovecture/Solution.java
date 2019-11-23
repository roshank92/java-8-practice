package com.company.innovecture;

import java.util.HashMap;
import java.util.Map;

public class Solution   {

    private static Solution instance ;
    private String msg;


    public String  getMessage(){
        return msg;
    }

    public static  Solution getInstance(){
        if(instance==null){
            instance = new Solution();
        }
        return instance;
    }

    public static void main(String[] args) {
        Solution inst1 = Solution.getInstance();
        inst1.msg = "this is one";
        System.out.println(inst1.getMessage());

        Solution inst2 = Solution.getInstance();
        inst2.msg="this is change";
        Solution inst3 = Solution.getInstance();



        System.out.println(inst1.hashCode());

        System.out.println(inst2.getMessage());
        System.out.println(inst2.hashCode());

        System.out.println(inst3.getMessage());
        System.out.println(inst3.hashCode());



    }

}
