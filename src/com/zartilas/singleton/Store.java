package com.zartilas.singleton;

import java.util.Scanner;

public class Store {
    private static Store instance;
    Scanner sc;
    private Store(){}
    public static Store getInstance(){
        if (instance==null)
            instance = new Store();
        return instance;
    }

    public int employeeAsk(String askFor) {
        sc = new Scanner(System.in);
        System.out.println("Welcome\n"
                + "How many " + askFor + " would you like?");
        while(true)
        try
        {
            int number = sc.nextInt();
            if(number >= 1){
                return number;
            }else{
                throw new Exception();
            }
        } catch (Exception ime)
        {
            System.out.println(
                    """
                        ------------------------------
                        - It is not a number or a negative value.
                        - The value 0 is not allowed.
                        How many phones would you like?
                        Please enter a number:""");
            sc.nextLine();
        }

    }


}
