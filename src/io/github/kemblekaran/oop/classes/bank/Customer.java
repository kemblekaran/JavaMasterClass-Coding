package io.github.kemblekaran.oop.classes.bank;

/**
 * Customer object to perform transaction on the account
 */
public class Customer {
    public static void main(String a[]) {
        //create bank object here
        BankAccount bankAccount = new BankAccount();

        //perform transactions
        bankAccount.depositFunds(1000);
        bankAccount.withdrawFunds(500);
        bankAccount.withdrawFunds(500);
        bankAccount.depositFunds(500);
        bankAccount.withdrawFunds(300);
        bankAccount.withdrawFunds(300);

        //if customer has tried to withdraw the exact amount from their account
        //they can withdraw it with no error
        bankAccount.depositFunds(1000);
        bankAccount.withdrawFunds(1000);

        //======================= VIP CUSTOMER ===============================
        VipCustomer jhon = new VipCustomer("jhon", "jhon@box.com");//customer with two details
        VipCustomer simran = new VipCustomer("simran", "simran@admin.com", 600.0);//customer with three details
        VipCustomer defaultCustomer = new VipCustomer();//customer with default values

        /**
         * default credit limit for Jhon as we've initialize only name and email
         */
        System.out.println("Jhon -> credit limit : " + jhon.getCreditLimit() + " email address : " + jhon.getEmailAddress());

        //account details for simran
        System.out.println("Simran -> credit limit : " + simran.getCreditLimit() + " email address : " + simran.getEmailAddress());

        //account details for default customer
        System.out.println("Default -> credit limit : " + defaultCustomer.getCreditLimit() + " email address : " + defaultCustomer.getEmailAddress());
    }
}
