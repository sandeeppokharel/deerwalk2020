package com.sandeep.pattern;

public class StarPattern {
    public static void main(String[] args) {
        for(int i = 1; i<=5 ; i++){
            for (int j=i ; j>=1; j--){
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
