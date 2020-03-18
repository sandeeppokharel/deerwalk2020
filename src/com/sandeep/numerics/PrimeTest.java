package com.sandeep.numerics;

import java.util.Scanner;

public class PrimeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num= scan.nextInt();
        int i;
        int rem = num/2;
        boolean isPrime = true;
        if ( num == 0 || num ==1){
            System.out.println("Not a Prime");
            System.out.print("-For being a prime, it precisely requires two factors :1 & Itself");
            isPrime=false;
        }
        for(i=2; i<=num/2 ;i++){
            if(num%i == 0) {
                isPrime = false;
                break;
            }
            }
            if(isPrime){
                System.out.println("Prime");
            }
            else {
                System.out.println("Not Prime");
            }
        }
    }