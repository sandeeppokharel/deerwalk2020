package com.sandeep.menu;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class SelectionMenu{

    public static int menu() {

        int selection;
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose from these choices");
        System.out.println("\n Operation Type: ");
        System.out.println("ENTER 1 FOR ADDITION");
        System.out.println("ENTER 2 FOR SUBTRACTION");
        System.out.println("ENTER 3 FOR MULTIPLICATION");
        System.out.println("ENTER 4 FOR DIVISION");
        selection = scan.nextInt();

        if(selection==1){
            operationSum();
        }
        if (selection == 2){
            operationDiff();
        }
        if (selection == 3){
            operationMul();
        }

        return selection;

    }

    public static void operationSum() {
        Scanner scanner = new Scanner(in);
        out.println("Enter the no's for addition:");
        int n = scanner.nextInt();

        out.println("Enter the numbers to add");
        int sum=0;
        int[] e = new int[n];
        for (int i = 0; i < n; i++) {
            e[i] = scanner.nextInt();
            sum += e[i];

        }
        out.println("RESULT OF ADDITION IS:"+sum);
    }

    public static void operationDiff() {
        Scanner scanner = new Scanner(in);
        out.println("Enter the no's for subtraction");
        int n = scanner.nextInt();

        out.println("Enter the numbers to subtract");
        int  diff=0;
        int[] e = new int[n];
        for (int i = 0; i < n; i++) {
            e[i] = scanner.nextInt();
            diff = e[i]-diff;

        }
        out.println("RESULT OF SUBTRACTION IS:"+diff);
    }

    public static void operationMul() {
        Scanner scanner = new Scanner(in);
        out.println("Enter the no's for Multiplication");
        int n = scanner.nextInt();

        out.println("Enter the numbers to multiply");
        int  mul =1;
        int[] e = new int[n];
        for (int i = 0; i < n; i++) {
            e[i] = scanner.nextInt();
            mul = e[i]*mul;

        }
        out.println("RESULT OF Multiplication IS:"+mul);
    }

}

