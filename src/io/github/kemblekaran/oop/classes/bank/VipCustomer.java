package io.github.kemblekaran.oop.classes.bank;

/**
 * Customer class for VIP Customer and the default implementation.
 */
public class VipCustomer {
    private String name;
    private String emailAddress;
    private double creditLimit;

    //default customer when there were no values for initialization
    public VipCustomer() {
        this("default name", "customer@default.com", 500.0);
    }

    /**
     * constructor called when there were only two parameters passed to the constructor
     * name and email
     */
    public VipCustomer(String name, String emailAddress) {
        this(name, emailAddress, 200.0);
    }

    /**
     * Key constructor for initializing all fields
     * @param name
     * @param emailAddress
     * @param creditLimit
     */
    public VipCustomer(String name, String emailAddress, double creditLimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
