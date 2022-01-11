package com.zartilas;

import com.zartilas.abstractphonefactory.phones.Phone;
import com.zartilas.observer.Customer;
import com.zartilas.observer.Publisher;
import com.zartilas.singleton.Store;
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

        int sp = 0;
        int fp = 0;
        for(int i=0; i < phonesForFactory; i++ ){
            String randPhone = tool.randPhoneChoice();
            if(randPhone.equals(SMARTPHONE)){
                phones.add(store.createdRandSmartPhone());
                sp++;
            }else if(randPhone.equals(FEATURE_PHONE)){
                phones.add(store.createdRandFeaturePhone());
                fp++;
            }
        }
        System.out.println("\nCreated " + sp + " smartphones and " + fp + " featurephones\n");

        for(int i=0; i < customers.length; i++){
            customers[i] = new Customer(
                    UUID.randomUUID().toString(),
                    tool.randPhoneChoice(),
                    false);
            staff.addCustomer(customers[i]);
            System.out.println("The customer: " +  customers[i].getCustomerID()
                    + " need " + customers[i].getRandomPhone() + "\n");
        }

        for (Customer cstmr : customers) {
            staff.removeCustomer(cstmr); //removed customer from list (INotifyForPhones)
            for (int i = 0; i < phones.size(); i++) {
                if (cstmr.getRandomPhone().equals(SMARTPHONE)) {
                    if (phones.get(i).getPhoneType().equals(SMARTPHONE)) {
                        staff.notifyPhone(SMARTPHONE);
                        phones.remove(i);
                        cstmr.setGotPhone(true);
                        System.out.println("\n-----------------------------------------\n");
                        System.out.println("\nCustomer: Say cheese ... I just took a picture! I have a " + cstmr.getRandomPhone());
                        System.out.println();
                        break;
                    }
                } else if (cstmr.getRandomPhone().equals(FEATURE_PHONE)) {
                    if (phones.get(i).getPhoneType().equals(FEATURE_PHONE)) {
                        staff.notifyPhone(FEATURE_PHONE);
                        cstmr.setGotPhone(true);
                        System.out.println("\n-----------------------------------------\n");
                        System.out.println("\nCustomer: [sound at the touch of a button] .... the customer is dialing a number I have a " + cstmr.getRandomPhone() );
                        phones.remove(i);
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
