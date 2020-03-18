package com.sandeep.arrayops;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingArray {
    public static void main(String[] args) {
        int n, temp;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n = scanner.nextInt();

        System.out.println("Enter the elements in array");
        int[] e = new int[n];
        for (int i = 0; i < n; i++) {
            e[i] = scanner.nextInt();
        }
        System.out.print("Entered Array Order: " );
        for (int i = 0; i < n; i++) {
            {
                System.out.print(e[i] + ", ");
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (e[i] > e[j]) {
                    temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;
                }
            }
        }
        System.out.println();

       /* Arrays.sort(e);
        System.out.print("Ascending Order is:%s", Arrays.toString(e));*/

        System.out.print("Array In Ascending Order: ");
        for (int i = 0; i < n-1 ; i++) {
            System.out.print(e[i] + " ,");
        }
            System.out.print(e[n-1]);

        System.out.println();
        System.out.println("The Smallest Number in array is :"+ e[0]);


        System.out.print("The Largest Number in array is :"+ e[n-1]);
       // System.out.println(e[e.length-1]);

    }
}