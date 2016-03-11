package com.company.Cars;

/**
 * Created by Bryan on 3/11/2016.
 */
public class Owner {
//fields
    private String name;
    private String telNumber;

//contructors
    public Owner(String name, String telNumber) {
        this.name = name;
        this.telNumber = telNumber;
    }

    public Owner(Owner o) {
        this.name = o.getName();
        this.telNumber = o.getTelNumber();
    }

//setters n getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

//override obj methods
    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(this == obj)
            return true;
        if(obj instanceof Owner){
            Owner other = (Owner)obj;
            return other.name == this.name && other.telNumber == this.telNumber;
        }
        return false;
    }

    @Override
    public String toString(){
        return "Owner: " + this.getName()
                + " Tel: " + this.getTelNumber();
    }

}
