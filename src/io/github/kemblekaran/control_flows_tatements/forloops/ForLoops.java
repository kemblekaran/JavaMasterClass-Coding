package io.github.kemblekaran.control_flows_tatements.forloops;

public class ForLoops {
    private final static int START_INTEREST_RATE = 2;
    private final static int END_INTEREST_RATE = 8;

    public static void main(String[] args) {
        ForLoops forLoops = new ForLoops();
//        forLoops.calculateMultipleInterestRates(10000.0);
        forLoops.calculateInDescendingOrder(10000.0);
    }

    /**
     * Calculate the interest rate here
     *
     * @param amount
     * @param interestRate
     * @return
     */
    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }

    /**
     * calculates multiple interest rate range between START_INTEREST_RATE to END_INTEREST_RATE value
     * and the formats it to have two decimal value
     *
     * @param amount
     */
    public void calculateMultipleInterestRates(double amount) {
        for (int i = START_INTEREST_RATE; i <= END_INTEREST_RATE; i++) {
            System.out.println(i + "% Interest Rate for the amount 10000.0 is " + String.format("%.2f", calculateInterest(amount, i)));
        }
    }

    public void calculateInDescendingOrder(double amount) {
        for (int i = END_INTEREST_RATE; i >= START_INTEREST_RATE; i--) {
            System.out.println(i + "% Interest Rate for the amount 10000.0 is " + String.format("%.2f", calculateInterest(amount, i)));
        }
    }
}
