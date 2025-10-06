package day3.Session;

import java.util.Scanner;

class Student {
    // Default constructor
    Student() {
        System.out.println("Student object is created");
    }
}

class Commission {
    // Data members
    String name, address, phone;
    double salesAmount;

    // Method to accept employee details
    void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Phone: ");
        phone = sc.nextLine();

        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();
    }

    // Method to calculate and display commission
    void calculateCommission() {
        double commission;

        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        } else {
            commission = 0;
        }

        System.out.println("\n--- Commission Details ---");
        System.out.println("Name       : " + name);
        System.out.println("Address    : " + address);
        System.out.println("Phone      : " + phone);
        System.out.println("Sales Amt  : " + salesAmount);
        System.out.println("Commission : " + commission);
    }
}

public class Assignment {

    public static void main(String[] args) {
        // Create Student object
        Student s = new Student();

        // Create Commission object and process
        Commission c = new Commission();
        c.acceptDetails();
        c.calculateCommission();
    }}