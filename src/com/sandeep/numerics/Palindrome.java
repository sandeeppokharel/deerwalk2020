package com.sandeep.numerics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num =scanner.nextInt();

        int rem, temp;
        int sum =0;
        temp= num;

        while(num>0) {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num/ 10;
        }
        if (temp == sum){
            System.out.println(+temp +" is Palindrome");
        }
        else {
            System.out.println(+temp +" Is Not Palindrome");
        }

    }
}

