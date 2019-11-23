package com.company;

import java.io.*;

public class TreeTraversal {

    public static void main(String[] args) throws IOException {

     String m = "adsad";
     char[] arr = m.toCharArray();
        FileOutputStream fileOutputStream = new FileOutputStream("/home/roshan/workspace/JavaTest/src/com/company/a.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);



        File file = new File("/home/roshan/workspace/JavaTest/src/com/company/a.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String s;
            while ((s=reader.readLine())!=null){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}

