package com.mybank.domain;

public class CheckingAccount extends Account {
    
    private double overdraftAmount;

    public CheckingAccount(double initBalance, double overdraftAmount) {
        this.overdraftAmount = overdraftAmount;
        balance = initBalance;
    }


    
    public CheckingAccount(double initBalance){
        balance = initBalance;
        this.overdraftAmount = 0;
    }
    

    
    @Override
    public boolean withdraw(double amt) throws OverdraftException {
        if (amt <= balance + overdraftAmount) {
            balance -= amt;
            return true;
        }
        throw new OverdraftException(amt - balance - overdraftAmount, "Error!");
    }

    public double getOverdraftAmount() {
        return overdraftAmount;
    }
    
}
