package com.pluralsight;
import java.util.*;

public class CellPhoneApplication {
    public static void main(String[] args) {
        int serialNumber = 0;
        String model = "", carrier = "", owner = "", phoneNumber = "";
        Scanner kbScanner = new Scanner(System.in);
        CellPhone userCellPhone = new CellPhone(serialNumber, model, carrier, owner, phoneNumber);

        System.out.print("What is the serial number? ");
        userCellPhone.setSerialNumber(kbScanner.nextInt());
        kbScanner.nextLine();
        System.out.print("What model is the phone? ");
        userCellPhone.setModel(kbScanner.nextLine());
        System.out.print("Who is the carrier? ");
        userCellPhone.setCarrier(kbScanner.nextLine());
        System.out.print("What is the phone number? ");
        userCellPhone.setPhoneNumber(kbScanner.nextLine());
        System.out.print("Who is the owner of the phone? ");
        userCellPhone.setOwner(kbScanner.nextLine());
        System.out.println();

        System.out.println("Serial Number: " + userCellPhone.getSerialNumber());
        System.out.println("Phone Number: " + userCellPhone.getPhoneNumber());
        System.out.println("Carrier: " + userCellPhone.getCarrier());
        System.out.println("Model: " + userCellPhone.getModel());
        System.out.println("Owner: " + userCellPhone.getOwner());
    }
}
