package com.zartilas.abstractphonefactory.factories;

import com.zartilas.abstractphonefactory.phones.FeaturePhones;
import com.zartilas.abstractphonefactory.phones.Phone;

public class FeaturePhoneFactory implements PhoneAbstractFactory {
    private final int screenSize;
    private final int storage;
    private final int battery;
    private final String phoneNumber;

    public FeaturePhoneFactory(int screenSize, int storage, int battery, String phoneNumber) {
        this.screenSize = screenSize;
        this.storage = storage;
        this.battery = battery;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Phone createPhone() {
        return new FeaturePhones(screenSize,storage,battery,phoneNumber);
    }
}
