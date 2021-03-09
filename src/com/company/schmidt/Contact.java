package com.company.schmidt;
import java.util.Scanner;

public class Contact {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact(String firstInput, String secondInput){
        Scanner input= new Scanner(System.in);
        System.out.println(firstInput);
        String name=input.nextLine();
        System.out.println(secondInput);
        String email=input.nextLine();

        this.setName(name);
        this.setEmail(email);
    }

    @Override
    public String toString() {
        //will we learn how to make theses look better in the future???
        //if not how can i because just adding || is boring
        return "Persons Contact: " + "Name= " + name + " || Email= " + email;
    }
}
