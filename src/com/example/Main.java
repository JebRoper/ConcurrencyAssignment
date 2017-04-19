package com.example;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        TraderServiceImpl traderService = new TraderServiceImpl();

        // run a thread that calls add stock
        AddShares addShares = new AddShares(traderService);
        Thread thread1 = new Thread(addShares);
        thread1.start();
        // run a thread that calls get stock
        GetShares getShares = new GetShares(traderService);
        Thread thread2 = new Thread(getShares);
        thread2.start();

    }
}
