package com.zartilas.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<INotifyForPhone> interestedCustomers  = new ArrayList<>();

    public void addCustomer(INotifyForPhone iNotifyForPhone){
         interestedCustomers.add(iNotifyForPhone);
    }
}
