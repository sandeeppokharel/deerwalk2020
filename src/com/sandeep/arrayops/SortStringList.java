package com.sandeep.arrayops;

import java.util.ArrayList;
import java.util.Collections;

public class SortStringList {
    public static void main(String args[]){
        ArrayList<String> countriesList = new ArrayList<>();
        countriesList.add("Nepal");
        countriesList.add("London");
        countriesList.add("Korea");

        countriesList.add("US");
        countriesList.add("China");
        countriesList.add("Denmark");

        /* Sort statement*/
        Collections.sort(countriesList);

        System.out.println("Sorting List:");
        for(String counter: countriesList){
            System.out.println(counter);
        }
        System.out.println();

        Collections.reverse(countriesList);
        //Collections.sort(countriesList, Collections.reverseOrder());

        System.out.println("Descending Order List");
        for(String counter: countriesList){
            System.out.println(counter);
        }
    }
}

