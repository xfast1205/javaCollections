package com.myBank.domain;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Customer> customers = new ArrayList<>();

    private int numofClients = 0;
    
    private static Bank MyBank = new Bank();

    public static Bank getBank() {
        return MyBank;
    }

    private Bank() {
    }


    public Customer getCustomer (int custNo){


        if (custNo < customers.size()) {
            return customers.get(custNo);
        }
        else
            return null;

    }

    public void addCustomer (Customer newCustomer) {

        customers.add(newCustomer);
        numofClients++;
       
    }
    public int getNumofClients () {
        return numofClients;
    }

 }


