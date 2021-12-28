package com.zartilas.abstractphonefactory.factories;

import com.zartilas.abstractphonefactory.phones.Phone;

public class PhoneFactory {
    public static Phone getPhone(PhoneAbstractFactory factory){
        return factory.createPhone();
    }
}
