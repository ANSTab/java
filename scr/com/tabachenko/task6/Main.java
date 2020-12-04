package com.tabachenko.task6;

public class Main {
    public static void main(String[] args) {
        Auto auto1= new Auto();
        auto1.getMarka("Mazda");
        auto1.getColor("red");

        Serializetor serializetor =new Serializetor();

        System.out.println(serializetor.serializetion(auto1));

    }
}
