package io.github.kemblekaran.oop.inheritence.classes.bank;

public class BankAccount {
    private long accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * allows customers to deposit into their account
     * @param depositFunds
     */
    public void depositFunds(int depositFunds) {
        System.out.println("Depositing " + depositFunds + " into your account");
        this.balance += depositFunds;
        System.out.println("your new updated balance is " + this.balance);
    }

    /**
     * allows customers to withdraw balance from their account
     * if there was insufficient balance then it just simply displays
     * the message to customers otherwise it updates the balance
     * @param withdrawAmount
     */
    public void withdrawFunds(int withdrawAmount) {
        if (withdrawAmount <= getBalance()) {
            System.out.println("withdrawing " + withdrawAmount + " from your account");
            this.balance -= withdrawAmount;
            System.out.println("your new updated balance is " + getBalance());
        } else {
            System.out.println("Insufficient funds! \nyou have "+getBalance()+" in your account");
        }

    }
}
