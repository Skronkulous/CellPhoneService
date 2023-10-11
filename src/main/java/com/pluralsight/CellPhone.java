package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model, carrier, owner, phoneNumber;

    public CellPhone (int serialNumber, String model, String carrier, String owner, String phoneNumber){
        this.serialNumber = serialNumber;
        this.phoneNumber = phoneNumber;
        this.model = model;
        this.carrier = carrier;
        this.owner = owner;
    }
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
