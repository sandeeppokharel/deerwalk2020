package com.sandeep.numerics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num= scan.nextInt();
        int i;
        for (i = 2 ; i < num ; i++){
            if(num % i == 0){
                System.out.println("NOT PRIME");
                break;
            }
        }
            if (num == i){
                System.out.println("Prime");
            }
        }
    }
