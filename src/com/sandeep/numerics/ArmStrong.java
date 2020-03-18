package com.sandeep.numerics;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num =scanner.nextInt();

        int rem, temp;
        double sum =0;
        temp= num;

        while(num>0) {
            rem = num % 10;
            sum = (sum + Math.pow(rem,3));
            num = num/ 10;
        }
        if (temp == sum){
            System.out.println(+temp +" is Armstrong");
        }
        else {
            System.out.println(+temp +" Is Not Armstrong");
        }
    }
}

