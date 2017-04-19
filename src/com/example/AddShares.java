package com.example;

/**
 * Created by admin on 4/19/17.
 */
public class AddShares implements Runnable {

    private TraderServiceImpl traderService;

    public AddShares(TraderServiceImpl traderService) {
        this.traderService = traderService;
    }

    @Override
    public void run() {
        while(true){
            traderService.addShares("ABC", 10, 45);
            System.out.println(traderService);
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                //do nothing
            }
        }

    }
}
