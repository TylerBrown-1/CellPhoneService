package com.pluralsight;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone phone  = new CellPhone();

        System.out.println("Enter your cellphone information");

        System.out.println("What is the serial number? ");
        phone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.println("What model is the phone? ");
        phone.setModel(scanner.nextLine());

        System.out.println("Who is the carrier? ");
        phone.setCarrier(scanner.nextLine());

        System.out.println("What is the phone number? ");
        phone.setPhoneNumber(scanner.nextLine());

        System.out.println("Who is the owner of the phone?");
        phone.setOwner(scanner.nextLine());

    }
}