package com.sandeep.multilevelinheritance;

public class Child extends  Parent{

    public void childMethod(){
        System.out.println(super.name);
        System.out.println("Child Method");
    }

}
