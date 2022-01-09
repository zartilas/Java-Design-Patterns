package com.zartilas;

import com.zartilas.abstractphonefactory.phones.Phone;
import com.zartilas.abstractphonefactory.phones.SmartPhones;
import com.zartilas.observer.Customer;
import com.zartilas.observer.Publisher;
import com.zartilas.singleton.Store;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Store store = Store.getInstance();
        Publisher staff = new Publisher();
        Utils tool = new Utils();
        int phonesForFactory = store.employeeAsk("phones");
        int customer = store.employeeAsk("customers");
        final String SMARTPHONE = "smartPhone";
        final String FEATURE_PHONE = "featurePhone";
        int customerWithOutPhone = 0;

        System.out.println(phonesForFactory +" phones");
        System.out.println(customer +" customers");

        Customer[] customers = new Customer[customer];
        List<Phone> phones = new ArrayList<>();

        for(int i=0; i < customers.length; i++){
            customers[i] = new Customer(
                    UUID.randomUUID().toString(),
                    tool.randPhoneChoice(),
                    false);
            staff.addCustomer(customers[i]);
            System.out.println("The customer: " +  customers[i].getCustomerID()
                    + " need " + customers[i].getRandomPhone());
        }

        for(int i=0; i < phonesForFactory; i++ ){
            String randPhone = tool.randPhoneChoice();
            if(randPhone.equals(SMARTPHONE)){
                phones.add(store.createdRandSmartPhone());
            }else if(randPhone.equals(FEATURE_PHONE)){
                phones.add(store.createdRandFeaturePhone());
            }
        }


        for(int j=0; j < customers.length; j++){
            for(int i=0; i < phones.size(); i++){
                if(customers[j].getRandomPhone().equals(SMARTPHONE)){
                    if(phones.get(i).getPhoneType().equals(SMARTPHONE)){
                        staff.notifyPhone(SMARTPHONE);
                        customers[i].setGotPhone(true);
                        phones.remove(j);
                        System.out.println("\n-----------------------------------------\n");
                        System.out.println("\nCustomer: "+ customers[i].getCustomerID());
                        System.out.println("\nSay cheese ... I just took a picture! ");
                        break;
                    }

                }else if(customers[j].getRandomPhone().equals(FEATURE_PHONE)){
                    if(phones.get(i).getPhoneType().equals(FEATURE_PHONE)){
                        staff.notifyPhone(FEATURE_PHONE);
                        customers[i].setGotPhone(true);
                        phones.remove(j);
                        System.out.println("\n-----------------------------------------\n");
                        System.out.println("\nCustomer: "+ customers[i].getCustomerID());
                        System.out.println("\n[sound at the touch of a button] .... the customer is dialing a number");
                        break;
                    }
                }
                
            }
        }

        System.out.println("\n--------------------------------------------------\n");
        for (Customer cstmr : customers) {
            if (!cstmr.isGotPhone())
                customerWithOutPhone++;
        }
        System.out.println("Customers with out phones: " + customerWithOutPhone);

    }

}
