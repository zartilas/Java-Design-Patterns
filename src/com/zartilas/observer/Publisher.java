package com.zartilas.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<INotifyForPhone> interestedCustomers  = new ArrayList<>();

    public void addCustomer(INotifyForPhone iNotifyForPhone){
         this.interestedCustomers.add(iNotifyForPhone);
    }

    public void removeCustomer(INotifyForPhone iNotifyForPhone) {
        this.interestedCustomers.remove(iNotifyForPhone);
    }

    public void notifyPhone(String typePhone) {
        for (INotifyForPhone iNotifyForPhone: this.interestedCustomers) {
            iNotifyForPhone.sendMessage("A new " + typePhone +" phone is available!");
        }
    }
}
