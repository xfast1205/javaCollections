/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybank.data;

import com.mybank.domain.javaBank.*;
import java.io.*;
import java.util.Scanner;

public class DataSource {

    private File dataFile;

    public DataSource(String dataFilePath) {
        dataFile = new File(dataFilePath);
    }

    public void loadData() throws IOException {

        Bank bank = Bank.getBank();

        Scanner input = new Scanner(dataFile);

        Customer customer;

        int numofCustomers = input.nextInt();

        for (int i = 0;
                i < numofCustomers;
                i++) {
            String firstName = input.next();
            String lastName = input.next();

            bank.addCustomer(new Customer(firstName, lastName));
            customer = bank.getCustomer(i);

            int numofAccounts = input.nextInt();

            while (numofAccounts-- > 0) {
                char accountType = input.next().charAt(0);
                switch (accountType) {
                    case 'S': {
                        float initBalance = input.nextFloat();
                        float interestRate = input.nextFloat();
                        customer.addAccount(new SavingsAccount(initBalance, interestRate));
                        break;
                    }
                    case 'C': {
                        float initBalance = input.nextFloat();
                        float overdraftAmmount = input.nextFloat();
                        customer.addAccount(new CheckingAccount(initBalance, overdraftAmmount));
                        break;
                    }
                }
            }
        }
    }

}
