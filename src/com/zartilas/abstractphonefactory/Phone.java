package com.zartilas.abstractphonefactory;

public abstract class Phone {
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
                +" Phone number: "+getPhoneNumber();
    }
}
