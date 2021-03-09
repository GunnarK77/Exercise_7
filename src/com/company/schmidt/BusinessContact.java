package com.company.schmidt;

import java.util.Scanner;

public class BusinessContact extends Contact{
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BusinessContact(String firstInput, String secondInput, String lastInput) {
        super(firstInput, secondInput);
        System.out.println(lastInput);
        Scanner input = new Scanner(System.in);

        this.phoneNumber = input.nextLine();
    }

    @Override
    public String toString() {
        //same thing here i dislike how bland the output is
        return "Business Contact: " + "Business phone number= " + phoneNumber + " || Business email: " + this.getEmail()+ " || Business name: " + this.getName();
    }
}
