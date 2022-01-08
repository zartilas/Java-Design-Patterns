package com.zartilas;

import com.zartilas.observer.Customer;
import com.zartilas.singleton.Store;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Store store = Store.getInstance();
        Utils tool = new Utils();
        int phones = store.employeeAsk("phones");
        int customer = store.employeeAsk("customers");
        System.out.println(phones +" phones");
        System.out.println(customer +" customers");

        Customer[] customers = new Customer[customer];

        for(int i=0; i < customers.length; i++){
            customers[i] = new Customer(
                    UUID.randomUUID().toString(),
                    tool.customerPhoneChoice(),
                    false);
            System.out.println("The customer: " +  customers[i].getCustomerID()
            + " has " + customers[i].getRandomPhone());
        }

        





    }






}
