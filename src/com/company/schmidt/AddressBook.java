package com.company.schmidt;
import java.util.HashMap;

public class AddressBook {

    private HashMap<String, String> address = new HashMap<>();
    public String retrieveName(String name){
        return this.address.get(name);
    }
    public void addInInfo(Contact person){
        this.address.put(person.getName(), person.getEmail());
    }


}