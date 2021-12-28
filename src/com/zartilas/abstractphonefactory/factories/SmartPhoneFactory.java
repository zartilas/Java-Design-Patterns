package com.zartilas.abstractphonefactory.factories;

import com.zartilas.abstractphonefactory.phones.Phone;
import com.zartilas.abstractphonefactory.phones.SmartPhones;

public class SmartPhoneFactory implements PhoneAbstractFactory{
    private final int screenSize;
    private final int storage;
    private final int battery;
    private final String phoneNumber;
    private final String OS;

    public SmartPhoneFactory(int screenSize, int storage, int battery, String phoneNumber, String os) {
        this.screenSize = screenSize;
        this.storage = storage;
        this.battery = battery;
        this.phoneNumber = phoneNumber;
        OS = os;
    }

    @Override
    public Phone createPhone() {
        return new SmartPhones(screenSize,storage,battery,phoneNumber,OS,true);
    }
}
