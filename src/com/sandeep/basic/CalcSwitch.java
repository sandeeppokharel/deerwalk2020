package com.sandeep.basic;

import java.util.Scanner;

public class CalcSwitch{

    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int quo(int a, int b){
        return a/b;
    }
    public int mod(int a, int b){
        return a%b;
    }

   public void printerMethod(String message,int result){
        System.out.println(message+" "+result);
    }


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = scan.nextInt();

        System.out.println("Enter the second number");
        int num2 = scan.nextInt();

        System.out.println("Enter the operation");
        String oper = scan.next();

        CalcSwitch cs = new CalcSwitch();

        try {
            switch (oper) {
                case "+": {
                    cs.printerMethod("The Sum: ", cs.add(num1, num2));
                    break;
                }
                case "-": {
                    cs.printerMethod("The Diff: ", cs.sub(num1, num2));
                    break;
                }
                case "*": {
                    cs.printerMethod("The Pro: ", cs.mul(num1, num2));
                    break;
                }
                case "/": {
                    cs.printerMethod("The Quotient: ", cs.quo(num1, num2));
                    break;
                }
                case "%": {
                    cs.printerMethod("The Mod: ", cs.mod(num1, num2));
                    break;
                }
                default: {
                    System.out.println("ONLY + , - , * , / & % are defined");
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}