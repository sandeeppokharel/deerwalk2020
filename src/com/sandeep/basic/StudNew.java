package com.sandeep.basic;

public class StudNew{

    public String  add(int a, int b){
        return ""+(a+b); //type conversion
    }

    public void printData(String operation){
        System.out.println(operation);
    }

    public static void main(String[] args){

        StudNew std = new StudNew();
        std.printData(std.add(356,5));
    }
}