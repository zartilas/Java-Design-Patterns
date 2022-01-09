package com.zartilas.singleton;

import com.zartilas.abstractphonefactory.factories.FeaturePhoneFactory;
import com.zartilas.abstractphonefactory.factories.PhoneFactory;
import com.zartilas.abstractphonefactory.factories.SmartPhoneFactory;
import com.zartilas.abstractphonefactory.phones.FeaturePhones;
import com.zartilas.abstractphonefactory.phones.SmartPhones;

import java.util.Random;
import java.util.Scanner;

public class Store {
    private static Store instance;
    Scanner sc;
    private Store(){}
    Random random = new Random();

    String[] phonesScreenSize = {"5,5","5.8","6","6.3"};
    String[] phonesScreenSizeFeature = {"2","3","4"};
    String[] phonesStorage = {"32GB","64GB","128GB","256GB"};
    String[] phonesBattery = {"3000","4000","5000"};
    String[] phonesOS = {"androidOS", "eOS","iOS"};
    Boolean[] phonesCamera = {true,false};

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


    public String randPhoneNumber(){
        int number = random.nextInt(999999999);
        return String.format("%09d", number);
    }


    public SmartPhones createdRandSmartPhone() {
        return (SmartPhones) PhoneFactory.getPhone(new SmartPhoneFactory(
                random.nextInt(phonesScreenSize.length),
                random.nextInt(phonesStorage.length),
                random.nextInt(phonesBattery.length),
                randPhoneNumber(),
                phonesOS[random.nextInt(phonesOS.length)]
        ));
    }

    public FeaturePhones createdRandFeaturePhone(){
        return (FeaturePhones) PhoneFactory.getPhone(new FeaturePhoneFactory(
                random.nextInt(phonesScreenSizeFeature.length),
                random.nextInt(phonesStorage.length),
                random.nextInt(phonesBattery.length),
                randPhoneNumber()
        ));

    }

}
