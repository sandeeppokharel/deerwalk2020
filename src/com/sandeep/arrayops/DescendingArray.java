package com.sandeep.arrayops;

import java.util.Scanner;

import static java.lang.System.*;

public class DescendingArray {
    public static void main(String[] args) {
        int n, temp;

        Scanner scanner = new Scanner(in);
        out.println("Enter the size of array");
        n = scanner.nextInt();

        out.println("Enter the elements in array");
        int[] e = new int[n];
        for (int i = 0; i < n; i++) {
            e[i] = scanner.nextInt();
        }
        out.print("Entered Array Order: " );
        for (int i = 0; i < n; i++) {
            {
                out.print(e[i] + ", ");
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (e[i] < e[j]) {
                    temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;
                }
            }
        }
        out.println();
        out.print("Array In Descending Order: ");
        for (int i = 0; i < n-1 ; i++) {
            out.print(e[i] + " ,");
        }
        out.print(e[n-1]);
        out.println();
        out.println("The Smallest Number in array is :"+ e[n-1]);

        out.print("The Largest Number in array is :"+ e[0]);
    }

}
