package com.zartilas.abstractphonefactory.phones;

public class SmartPhones extends Phone {
    private final int screenSize;
    private final int storage;
    private final int battery;
    private final String phoneNumber;
    private final String OS;
    private final boolean Camera;

    public String getOS() {
        return OS;
    }

    public boolean getCAMERA() {
        return Camera;
    }

    public SmartPhones(int screenSize, int storage, int battery, String phoneNumber, String os, boolean camera) {
        this.screenSize = screenSize;
        this.storage = storage;
        this.battery = battery;
        this.phoneNumber = phoneNumber;
        OS = os;
        Camera = camera;
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
                +"OS: "+getOS()
                +"Camera: " +getCAMERA();
    }
}

