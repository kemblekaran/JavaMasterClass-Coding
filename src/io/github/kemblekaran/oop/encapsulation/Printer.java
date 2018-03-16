package io.github.kemblekaran.oop.encapsulation;

/**
 * Key class for handling all operations related to Printing
 * with initial values set to defaults like MAX_PAGES,tonerLevel
 */
public class Printer {
    private static int MAX_PAGES = 1000;
    private int tonerLevel = 100;
    private int noOfPages;
    private boolean isDuplex;

    /**
     * checks if we have the pages left in our quota or not
     * and only then set the pages for printing and also
     * check if the printer is a duplex printer or not
     * @param noOfPages
     * @param isDuplex
     */
    public Printer(int noOfPages, boolean isDuplex) {

        if (noOfPages >= 0 && noOfPages <= 1000) {
            if (noOfPages < getPagesLeft()) {
                this.noOfPages = noOfPages;
            }
        }

        this.isDuplex = isDuplex;
    }

    /**
     * This method helps for filling out the toner by checking some
     * basic validations that are really important while performing
     * this operation and by printing a helpful message to the console
     * with number of percent tonerLevel present in out printer
     * @param tonerToBeFilled
     */
    public void fillToner(int tonerToBeFilled) {
        if (tonerToBeFilled < getTonerLevel()) {
            if (tonerToBeFilled >= 0 && tonerToBeFilled <= 100) {
                System.out.println("filling toner by " + tonerToBeFilled + "%");
                this.tonerLevel += tonerToBeFilled;
            }
        } else {
            System.out.println("Toner cannot be filled");
        }

        System.out.println("toner level is : " + getTonerLevel() + "%");
    }

    /**
     * It simulates the mechanism of printing pages by adding/subtracting no of pages from
     * the main page capacity and also informing number of pages left after printing the pages
     * depending on the type of printer(Duplex or NoDuplex)
     */
    public void printPages() {
        int pagesToBePrinted;
        int tonerLevelRemaining;
        if (this.isDuplex) {
            pagesToBePrinted = this.noOfPages / 2;
            tonerLevelRemaining = getTonerLevel() - pagesToBePrinted;
            setTonerLevel(tonerLevelRemaining);

            System.out.println(pagesToBePrinted + " pages can be printed");
            System.out.println(" toner level : " + getTonerLevel());
            this.noOfPages = pagesToBePrinted;
        } else {
            pagesToBePrinted = this.noOfPages;
            tonerLevelRemaining = getTonerLevel() - pagesToBePrinted;
            setTonerLevel(tonerLevelRemaining);
            System.out.println(pagesToBePrinted + " pages can be printed");
            System.out.println(" toner level : " + getTonerLevel());
        }

        System.out.println("##Pages left -> " + getPagesLeft());
    }

    /**
     *
     * @return number of pages left
     */
    public int getPagesLeft() {
        return MAX_PAGES - getNoOfPages();
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    /**
     * sets the toner level while filling the toner
     * @param tonerLevel
     */
    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }
}
