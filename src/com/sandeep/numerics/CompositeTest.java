package com.sandeep.numerics;

import java.util.Scanner;

public class CompositeTest {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number");
            int num= scan.nextInt();
            int i;
            boolean isComposite = true;
            if ( num == 0 || num ==1 || num == 2 || num ==3){
                isComposite=false;
            }
            for(i=4; i<=num/2 ;i++){
                if(num%i == 0) {
                    isComposite = true;
                    break;
                }
            }
            if(isComposite){
                System.out.println("Composite");
            }
            else {
                System.out.println("Not Composite");
            }
        }

    }

