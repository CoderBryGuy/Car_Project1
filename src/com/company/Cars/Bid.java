package com.company.Cars;

/**
 * Created by Bryan on 3/11/2016.
 */
public class Bid {
//fields
    private int bidPrice;
    private String telNum;

//constructors
    public Bid(int bidPrice, String telNum) {
        if(bidPrice > -1)
            this.bidPrice = bidPrice;
        else
            this.bidPrice = 0;

        this.telNum = telNum;
    }

    public Bid(Bid b) {
        this.bidPrice = b.bidPrice;
        this.telNum = b.telNum;
    }

//setters n getters

    public int getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(int bidPrice) {
        this.bidPrice = bidPrice;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }
//override object methods
    @Override
    public String toString(){
        return "Bid price: " + this.bidPrice
                + " Tel: " + this.telNum;
    }
}
