package com.sandeep.pattern;

public class Pyramid {
    public static void main(String[] args) {
        int  j;
        int r =10;

        for ( int i = 1 ; i < r  ; i++){
            for (j = r-1 ; j > i ; j--){
                System.out.print(" ");
            }
            for (j = 1 ; j <= i ; j++){
                System.out.print(j+" ");
               /* System.out.print("* ");*/
            }
            System.out.println();
        }
        }
    }
