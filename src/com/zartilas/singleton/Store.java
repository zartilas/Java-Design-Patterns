package com.zartilas.singleton;

import java.util.Scanner;

public class Store {
    private static Store instance;
    private Store(){}
    public static Store getInstance(){
        if (instance==null)
            instance = new Store();
        return instance;
    }

    public void employee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome\n"
                + "How many phones would you like?");
        boolean isNumeric = false;

        while(!isNumeric)
        try
        {
            int numberOfPhones = sc.nextInt();
            if(numberOfPhones >= 1){
                System.out.println(numberOfPhones + " is a valid integer");
                isNumeric = true;
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

        System.out.println("\nHow many customers will share the phones?");
        boolean isNumericV2= false;

        while(!isNumericV2)
            try
            {
                int numberOfPhones = sc.nextInt();
                if(numberOfPhones >= 1){
                    System.out.println(numberOfPhones + " is a valid integer");
                    isNumericV2 = true;
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

        sc.close();
    }
}
