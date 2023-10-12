package com.pluralsight;
import java.util.*;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner kbScanner = new Scanner(System.in);
        int serialNumber = 13377331;
        String model = "iPhone 115", carrier = "NASA", owner = "Peter Parker", phoneNumber = "123-456-7890";
        CellPhone userCellPhone = new CellPhone(serialNumber, model, carrier, owner, phoneNumber);
        CellPhone userCellPhone2 = new CellPhone(serialNumber, model, carrier, owner, phoneNumber);

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

        display(userCellPhone);
        System.out.println();
        display(userCellPhone2);
        System.out.println();

        userCellPhone.dial(userCellPhone2.getPhoneNumber());
        System.out.println();
        userCellPhone2.dial(userCellPhone.getPhoneNumber());
    }

    public static void display(CellPhone phone) {
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Owner: " + phone.getOwner());
    }
}
