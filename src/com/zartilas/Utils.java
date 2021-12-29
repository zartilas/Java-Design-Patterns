package com.zartilas;

import java.util.Random;

public class Utils {

    public String customerPhoneChoice(){
        Random random = new Random();
        final String[] phones = {"featurePhone", "smartPhone"};

        return phones[random.nextInt(phones.length)];
    }

}
