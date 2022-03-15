package com.raju.q2;

public class BankDemo {
    public static void main(String[] args) {
        SavingAccount account1 = new SavingAccount();
        account1.deposit(1000);
        try {
            account1.withdraw(100);
            System.out.println("Current balance : "+account1.balance);
        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }
}
