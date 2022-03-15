package com.raju.q2;

public class SavingAccount {
    int accountNumber;
    double balance;
    double withdraw(double amount) throws InsufficientFundException {
        if(balance<amount) throw new InsufficientFundException("Insufficient Amount in the Account");
        else{
            balance-=amount;
            return amount;
        }
    }
    void deposit (double amount){
        balance+=amount;
    }
}
