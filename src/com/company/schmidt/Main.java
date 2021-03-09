package com.company.schmidt;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Collects first 3 contacts
        Contact person1 = new Contact("Please enter the persons name", "Please enter there email address as well");
        Contact person2 = new Contact("Please enter the persons name", "Please enter there email address as well");
        Contact person3 = new Contact("Please enter the persons name", "Please enter there email address as well");

        System.out.println("Here are the peoples contacts you have entered so far");

        //returns the first 3 contacts
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());

        //start of business contact
        System.out.println("For one of the people you have above, enter there business info");

        //gets the info
        BusinessContact person4 = new BusinessContact("Enter their business name", "Enter their business email", "Finally enter their business phone number");

        //Prints out the contact
        System.out.println(person4.toString());

    }




}