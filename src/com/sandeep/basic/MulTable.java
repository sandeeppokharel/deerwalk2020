package com.sandeep.basic;

import java.util.Scanner;

public class MulTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = scan.nextInt();

        for(int i = 1; i<=10 ; i++){
            System.out.println("The value of " +num +"*" +i+ " is: " +(i*num));
        }

    }
}
