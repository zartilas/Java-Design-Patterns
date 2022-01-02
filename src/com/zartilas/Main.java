package com.zartilas;

import com.zartilas.singleton.Store;

public class Main {

    public static void main(String[] args) {
        Store store = Store.getInstance();
        store.employee();
    }

}
