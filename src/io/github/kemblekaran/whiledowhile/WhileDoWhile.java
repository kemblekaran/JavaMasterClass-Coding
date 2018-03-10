package io.github.kemblekaran.whiledowhile;

import java.util.Scanner;

/**
 * The members of the WhileDoWhile class can be access with an object of it in
 * main() method
 */
public class WhileDoWhile {
    Scanner scan = new Scanner(System.in);
    int checkNumber;
    int selectedOption;
    int testStartNumber;
    int testEndNumber;

    public static void main(String a[]) {
        WhileDoWhile whileDoWhile = new WhileDoWhile();

        /**
         * Perform the operation based on users choice
         */
        do {
            whileDoWhile.performOperations(whileDoWhile.scan);
        } while (askAgain(whileDoWhile.scan));

    }

    /**
     * checks whether a given number is even or not
     * if it is EVEN then it simply returns true otherwise false
     *
     * @param number
     * @return
     */
    private boolean isEvenNumber(int number) {
        while (number % 2 == 0) {
            return true;
        }
        return false;
    }

    /**
     * check whether the number is even or not
     *
     * @param checkNumber
     */
    private void checkEvenNumber(int checkNumber) {
        if (isEvenNumber(checkNumber)) {
            System.out.println(checkNumber + " is an even number");
        } else {
            System.out.println(checkNumber + " is an odd number");
        }
    }

    /**
     * Prints even numbers between the specified range
     *
     * @param startNumber
     * @param endNumber
     */
    private void getEvenNumbers(int startNumber, int endNumber) {
        int noOfEvenNumbers = 0;
        while (startNumber <= endNumber) {
            if (!isEvenNumber(startNumber)) {
                startNumber++;
                continue;
            }

            System.out.println(startNumber + " is an Even number.");
            noOfEvenNumbers++;
            startNumber++;

            /*if there are more than 5 even number then exit the loop
            *and print the count of even numbers
             */
            if (noOfEvenNumbers >= 5)
                break;
        }
        System.out.println("number of even numbers " + noOfEvenNumbers);
    }

    /**
     * ask user if he wants to perform another transaction
     *
     * @param scan
     * @return
     */
    private static boolean askAgain(Scanner scan) {
        System.out.println("Wanna check another number");
        String userWish = scan.next();
        if (userWish.toLowerCase().equals("y")) {
            return true;
        }
        return false;
    }

    /**
     * perform operations
     *
     * @param scan
     */
    private void performOperations(Scanner scan) {
        /**
         * ask for the operation user wants to perform and depending on that
         * call the methods
         */
        System.out.println("What you wanna do? Press 1 or 2\n1. Check single number \n2. get even number within specific range");
        selectedOption = scan.nextInt();

        if (selectedOption == 1) {
            System.out.println("Enter a number to evaluate");
            checkNumber = scan.nextInt();

            checkEvenNumber(checkNumber);
        } else {
            System.out.println("Enter first number");
            testStartNumber = scan.nextInt();
            System.out.println("Enter second number");
            testEndNumber = scan.nextInt();

            getEvenNumbers(testStartNumber, testEndNumber);
        }
    }
}
