package com.example;

/**
 * Created by admin on 4/19/17.
 */
public class GetShares implements Runnable {

    private TraderServiceImpl traderService;

    public GetShares(TraderServiceImpl traderService) {
        this.traderService = traderService;
    }

    @Override
    public void run() {
        while(true){
            Stock stock =  traderService.getStock("ABC");
            System.out.println(stock);
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                //do nothing
            }
        }

    }
}
