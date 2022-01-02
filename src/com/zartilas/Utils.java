package com.zartilas;

import java.util.Random;
import java.util.Scanner;

public class Utils {

    public String customerPhoneChoice(){
        Random random = new Random();
        final String[] phones = {"featurePhone", "smartPhone"};

        return phones[random.nextInt(phones.length)];
    }

    public boolean checkIfNumber(Scanner num){
        return num.hasNextInt() && num.nextInt() >= 1;
    }
}
