package com.zartilas;

import java.util.Random;

public class Utils {

    public String randPhoneChoice(){
        Random random = new Random();
        final String[] phones = {"featurePhone", "smartPhone"};

        return phones[random.nextInt(phones.length)];
    }

}
