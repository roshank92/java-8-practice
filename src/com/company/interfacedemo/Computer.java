package com.company.interfacedemo;

interface DisplayModule {
    void display();
}

class Monitor implements  DisplayModule{


    @Override
    public void display() {
        System.out.println("display through monitor");

    }
}

class Projector implements  DisplayModule{
    @Override
    public void display() {
        System.out.println("displaying through projector");
    }
}

public class Computer {

    DisplayModule dm;

    public DisplayModule getDm() {
        return dm;
    }

    public void setDm(DisplayModule dm) {
        this.dm = dm;
    }

    public void  display(){
        dm.display();
    }

    public static void main(String[] args) {
        DisplayModule monitorModule = new Monitor();
        DisplayModule projectorModule = new Projector();
        Computer computer = new Computer();
        computer.setDm(monitorModule);
        computer.display();

    }
}



