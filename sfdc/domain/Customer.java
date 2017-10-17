package com.myBank.domain;

import java.util.*;

public class Customer {

    private ArrayList<Account> accounts;

    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    private String lastName;

    private int customerNumber;

    private static int customerNumberBase = 1000;

    private int numofAccounts;

    public int getNumofAccounts() {
        return numofAccounts;
    }

    public Customer(String firstName, String lastName) {
        accounts = new ArrayList<Account>();
        this.firstName = firstName;
        this.lastName = lastName;
        customerNumber = customerNumberBase++;
        numofAccounts = 0;
    }

    public Account getAccount(int accNo) {
        if (accNo < accounts.size() && numofAccounts != 0) {
            return accounts.get(accNo);
        } else {
            return null;
        }
    }

    public void addAccount(Account acc) {
        accounts.add(acc);
        numofAccounts++;
    }

    @Override
    public String toString() {
        String s = "Customer" + "\n fullName=" + firstName + ",\n customerNumber=" + customerNumber + ",\n numofAccounts=" + numofAccounts;

        for (int i = 0; i < numofAccounts; i++) {
            Account acc = getAccount(i);
            if (acc instanceof SavingsAccount) {
                s +=  "\n" + (i+1) + "\tSaving account with interest rate %" + ((SavingsAccount) acc).getInterestRate();
            } else {
                s += "\n" + (i+1) + "\tChecking account with interest rate %" + ((CheckingAccount) acc).getOverdraftAmount();
            }
            s += ", balance $" + acc.getBalance();
        }
        s += "\n";
        return s;
    }

}
