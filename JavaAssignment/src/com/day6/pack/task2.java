package com.day6.pack;

class BankAccount {

    double balance;

    void withdraw(double withdrawAmount) {

     

        if (withdrawAmount <= balance) {
            balance = balance - withdrawAmount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class task2 {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount();

        acc1.balance = 10000;

        acc1.withdraw(2500);
    }
}