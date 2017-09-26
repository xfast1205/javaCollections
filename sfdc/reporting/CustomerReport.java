/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybank.reporting;

import com.mybank.domain.javaBank.*;

public class CustomerReport {

    public CustomerReport() {
    }
    
    public void genarateReport() {
        
        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");
        
        Bank bank = Bank.getBank();
        
        for (int cust_idx = 0;
             cust_idx < bank.getNumofClients();
             cust_idx ++){
            Customer customer = bank.getCustomer(cust_idx);
            
            System.out.println();
            System.out.println("Customer: "
                               + customer.getLastName() + ", "
                               + customer.getFirstName());
            
            for (int acct_idx = 0;
                 acct_idx < customer.getNumofAccounts();
                 acct_idx ++) {
                 Account account = customer.getAccount(acct_idx);
                 String account_type = "";
                 
                 if (account instanceof SavingsAccount) {
                     account_type = "Savings Account";
                 }  else if (account instanceof CheckingAccount) {
                     account_type = "Checking Account";
                 }  else {
                     account_type = "Unknown Account Type";
                 }
                 
                 System.out.println("   " + account_type + ": current balance is "
                                    + account.getBalance());
            }
        }
    }
    
}
