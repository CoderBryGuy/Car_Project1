package com.company.Cars;

/**
 * Created by Bryan on 3/11/2016.
 */
public class CarSales {
//fields
    private Car[] cars;
    private int numberOfCars;

//contructors
    public CarSales(int numberOfCars) {
        this.numberOfCars = numberOfCars;
        cars = new Car[numberOfCars];
    }
//general methods
    public boolean addCar(Car newCar){
        boolean isRoom = false;

        for (int i = 0; i < cars.length; i++) {
            if(cars[i] == null) {
                cars[i] = newCar;
                isRoom = true;
            }
        }
        return isRoom;
    }

    public Car getNewest(){
        int newestCarYear = 1900;
        Car newestCar = null;

        for (int i = 0; i < cars.length; i++) {
            if(newestCarYear > cars[i].getYear())
            {
                newestCarYear = cars[i].getYear();
                newestCar = cars[i];
            }
        }
        return newestCar;
    }

    public String allAttractive(){
        String attractiveCars = "";
        for (int i = 0; i < cars.length; i++) {
            if(cars[i].isAttractive());
            attractiveCars +="\n " + cars[i];
        }
        return  attractiveCars;
    }

    public String ownersOfType(String manufacturer){
        String OwnersOfManufacturer ="";
        for (int i = 0; i < cars.length; i++) {
            if(cars[i].getManufacturer() == manufacturer)
            {
                OwnersOfManufacturer = "\n \n" + cars[i].getOwner();
            }
        }
        return OwnersOfManufacturer;
    }
    //I'm not sure what the specs are on this method :(:(
  /*  public void makeBidsOnCheapNotOverUsed(int bidPice, String tel)
    {

        Bid bid = new Bid(bidPice, tel);

        for (Car car : cars) {
           // car
        }


    }
*/
    public void removeCar(String licenseNum){

        for (int i = 0; i <cars.length ; i++)
        {
            if(cars[i].getLicensePlate() == licenseNum) {

                cars[i] = null;

                for (int j = i; j < cars.length; j++) {
                    if(j+1 >= cars.length)
                        cars[j] = cars[j+1];
                }
            }
        }
    }
}
