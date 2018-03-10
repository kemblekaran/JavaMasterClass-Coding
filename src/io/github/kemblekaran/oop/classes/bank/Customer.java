package io.github.kemblekaran.oop.classes.bank;

/**
 * Customer object to perform transaction on the account
 */
public class Customer {
    public static void main(String a[]){
        //create bank object here
        BankAccount bankAccount = new BankAccount();

        //perform transactions
        bankAccount.depositFunds(1000);
        bankAccount.withdrawFunds(500);
        bankAccount.withdrawFunds(500);
        bankAccount.depositFunds(500);
        bankAccount.withdrawFunds(300);
        bankAccount.withdrawFunds(300);
    }
}
