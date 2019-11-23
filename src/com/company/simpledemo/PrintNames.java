package com.company.simpledemo;

public class PrintNames extends  Thread {
    public String[] names;
    public int from;
    public int to;


    public PrintNames(String[] n,int from,int to){
        this.names = n;
        this.from = from;
        this.to = to;
    }

    public void run(){
        for (int i=this.from;i<=this.to;i++ ) {
            System.out.println(Thread.currentThread().getName()+"Name is: "+names[i]);
        }
    }
}
