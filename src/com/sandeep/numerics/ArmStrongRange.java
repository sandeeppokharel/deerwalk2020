package com.sandeep.numerics;

import java.util.Scanner;

public class ArmStrongRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range of values to check: \n" + "Lower Value");
        int lv = scanner.nextInt();

        System.out.println("Enter the highest value in range");
        int hv = scanner.nextInt();
        scanner.close();

        for (int num = lv+1 ; num < hv; num++) { //+1 to satisfy range definition
            int checkNum, rem, sum = 0;
            checkNum = num;
            while (checkNum != 0) {
                rem = checkNum % 10;
                sum = (int) (sum + (Math.pow(rem, 3)));
                checkNum = checkNum / 10;
            }
            if (sum == num) {
                System.out.println(num + " IS AN ARMSTRONG NUMBER");
            }
        }
    }
}