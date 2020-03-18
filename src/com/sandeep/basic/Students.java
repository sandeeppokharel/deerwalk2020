package com.sandeep.basic;


public class Students {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a/b;
    }

    public void printData(String operation, int result){
        System.out.println(operation+" "+result);

    }

    public static void main(String[] args){

        Students s = new Students();
        s.printData("The value of addition:",s.add(3,5));
        s.printData("The value of subtraction:",s.sub(3,5));
        s.printData("The value of  multiplication:", s.mul(3,5));
        s.printData("The value of division is :",s.div(35,5));
    }
}