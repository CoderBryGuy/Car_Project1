package com.company.Cars;

/**
 * Created by Bryan on 3/11/2016.
 */
public class Car {
//fields
    private Owner owner;
    private String manufacturer;
    private boolean airbags;
    private boolean leasingOrRental;

    private int year;
    private byte seats;
    private long km;

    private int price;
    private int blueBookValue;
    private Bid highestBid;
    private String licensePlate;
//Constructors
    public Car(Owner owner, String manufacturer, boolean airbags,
               boolean leasingOrRental, int year, byte seats, long km,
               int price, int blueBookValue, String licensePlate) {
        this.owner = owner;
        this.manufacturer = manufacturer;
        this.airbags = airbags;
        this.leasingOrRental = leasingOrRental;
        this.year = year;
        this.seats = seats;
        this.km = km;
        this.price = price;
        this.blueBookValue = blueBookValue;
        this.highestBid.setBidPrice(0);
        this.highestBid.setTelNum("");
        this.licensePlate = licensePlate;
    }

    public Car(Car c) {
        this.owner = c.getOwner();
        this.manufacturer = c.getManufacturer();
        this.airbags = c.isAirbags();
        this.leasingOrRental = c.isLeasingOrRental();
        this.year = c.getYear();
        this.seats = c.getSeats();
        this.km = c.getKm();
        this.price = c.getPrice();
        this.blueBookValue = c.getBlueBookValue();
        this.highestBid = c.getHighestBid();
        this.licensePlate = c.getLicensePlate();
    }
//setters n getters

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isAirbags() {
        return airbags;
    }

    public void setAirbags(boolean airbags) {
        this.airbags = airbags;
    }

    public boolean isLeasingOrRental() {
        return leasingOrRental;
    }

    public void setLeasingOrRental(boolean leasingOrRental) {
        this.leasingOrRental = leasingOrRental;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public byte getSeats() {
        return seats;
    }

    public void setSeats(byte seats) {
        this.seats = seats;
    }

    public long getKm() {
        return km;
    }

    public void setKm(long km) {
        this.km = km;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBlueBookValue() {
        return blueBookValue;
    }

    public void setBlueBookValue(int blueBookValue) {
        this.blueBookValue = blueBookValue;
    }

    public Bid getHighestBid() {
        return highestBid;
    }

    public void setHighestBid(Bid highestBid) {
        this.highestBid = highestBid;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
//other methods

    private boolean isAttractive;

    public void makeBid(Bid b){

        if (b.getBidPrice() > highestBid.getBidPrice())
            highestBid.setBidPrice(b.getBidPrice());
    }
    public boolean isAttractive(){
     return
    }
}
