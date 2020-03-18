package com.sandeep.inheritance;

public class ChildClass extends ParentClass{

    public ChildClass(){
        super("khurak");
        System.out.println("Default child's constructor invoked");
    }

    /*example of parametrized constructor*/
    public void childClass(String message){
        System.out.println("Message from Child is: "+ message);
    }
}
