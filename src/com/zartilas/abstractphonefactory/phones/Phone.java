package com.zartilas.abstractphonefactory.phones;

public abstract class Phone {
    public abstract String getPhoneType();
    public abstract int getScreenSize();
    public abstract int getStorage();
    public abstract int getBattery();
    public abstract String getPhoneNumber();

    @Override
    public String toString(){
        return "Phone specs: "
                +" Screen size: "+getScreenSize()
                +" Storage: "+getStorage()
                +" Battery: "+getBattery()
                +" Phone number: "+getPhoneNumber()
                +" Phone Type: " +getPhoneType();
    }
}
