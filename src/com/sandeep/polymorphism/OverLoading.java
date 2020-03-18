package com.sandeep.polymorphism;

public class OverLoading {

    public void add(){
        int x=5;
        int y=7;
        System.out.println(x+y);
    }

    public void add(int x, int y){
        System.out.println(x+y);
    }

    public void add( int x, int y, int z){
        System.out.println(x+y+z);
    }


    public static void main(String[] args) {
        OverLoading ol = new OverLoading();
        ol.add();
        ol.add(2,3);
        ol.add(2,3,4);
    }

}
