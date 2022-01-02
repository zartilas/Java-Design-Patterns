package com.zartilas.singleton;

import com.zartilas.Utils;

import java.util.Scanner;

public class Store {
    Utils fromUtils = new Utils();
    private static Store instance;
    private Store(){}
    public static Store getInstance(){
        if (instance==null)
            instance = new Store();
        return instance;
    }

    public void employee(){
        System.out.println("Welcome\n"
                +"How many phones would you like?");
       while(!fromUtils.checkIfNumber(new Scanner(System.in))){
           System.out.println(
                   """
                           ------------------------------
                           - It is not a number or a negative value.
                           - The value 0 is not allowed.
                           How many phones would you like?
                           Please enter a number:""");
       }
       {
            System.out.println(
                    "is number"
            );
       }
    }


}
