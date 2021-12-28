package com.zartilas.abstractphonefactory.phones;

public abstract class FeaturePhones extends Phone {
    private final int screenSize;
    private final int storage;
    private final int battery;
    private final String phoneNumber;

    public FeaturePhones(int screenSize, int storage, int battery, String phoneNumber) {
        this.screenSize = screenSize;
        this.storage = storage;
        this.battery = battery;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int getScreenSize(){return screenSize;}

    @Override
    public int getStorage(){return storage;}

    @Override
    public int getBattery(){return battery;}

    @Override
    public String getPhoneNumber(){return phoneNumber;}
}
