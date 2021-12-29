package com.zartilas;

public class Customer {
    private String customerID;
    private String randomPhone;
    private boolean gotPhone = false;

    public Customer(String customerID, String randomPhone,boolean gotPhone) {
        this.customerID = customerID;
        this.randomPhone = randomPhone;
        this.gotPhone = gotPhone;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID() {
        this.customerID = customerID;
    }

    public String getRandomPhone() {
        return randomPhone;
    }

    public void setRandomPhone(String randomPhone){
        this.randomPhone = randomPhone;
    }

    public boolean isGotPhone() {
        return gotPhone;
    }

    public void setGotPhone(boolean gotPhone) {
        this.gotPhone = gotPhone;
    }
}
