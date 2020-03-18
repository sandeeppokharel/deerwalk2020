package com.sandeep.basic;

import java.util.Scanner;

public class OddEvenTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newline = System.getProperty("line.separator");
        System.out.println("Enter the Lower value");
        int low = scanner.nextInt();
        System.out.println("Enter the Upper value");
        int high = scanner.nextInt();

        System.out.println("List of EVEN :");
        for(int i = low; i<=high; i++){
            if(i%2 == 0)
            {
                System.out.print(i + " ");
            }
            }

        System.out.println(newline);
        System.out.print("List of ODD:\n");
        for(int i = low; i<=high; i++){
            if(i%2 != 0)
            {
                System.out.print(i + " ");
            }
        }
    }
    }
