package com.zartilas.abstractphonefactory.phones;

import com.zartilas.abstractphonefactory.Phone;

public abstract class SmartPhones extends Phone {
    private final int screenSize;
    private final int storage;
    private final int battery;
    private final String phoneNumber;
    private final String OS;

    public String getOS() {
        return OS;
    }


    protected SmartPhones(int screenSize, int storage, int battery, String phoneNumber, String os) {
        this.screenSize = screenSize;
        this.storage = storage;
        this.battery = battery;
        this.phoneNumber = phoneNumber;
        OS = os;
    }


    @Override
    public int getScreenSize() {
        return screenSize;
    }

    @Override
    public int getStorage() {
        return storage;
    }

    @Override
    public int getBattery() {
        return battery;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return super.toString()
                +"OS: "+getOS();
    }
}

