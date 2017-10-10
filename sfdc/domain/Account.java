package com.mybank.domain;

/**
 * Class Account
 * @author Andrew Ryzhkov
 */

public class Account {
    
    protected double balance;

    public Account() {

        balance = 0;

    }

    
    
    /**
     * Constructor (initial balance)
     * @param initBalance (positive)
     */

    protected Account(double initBalance) {
        if (initBalance > 0)
            balance = initBalance;
        else 
            balance = 0;
    }

    /**
     * Getter method
     * @return balance
     */

    public double getBalance() {
        return balance;
    }


    /**
     * Method to add money
     * @param amount money
     * @return balance if true
     */
    boolean deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            return true;
        }
        else
            return false;
    }


    /**
     * Method to withdraw money
     * @param amount money
     * @return balance if true
     */
    
    public boolean withdraw (double amt) throws Exception {
        if (amt < balance) { 
            balance -= amt;
            return true;
        }
        else 
            return false;
    }
}

