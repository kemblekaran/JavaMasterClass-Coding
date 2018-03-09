
package io.github.kemblekaran.switchstatements;

public class SwitchStatements {

    /**
     * Execute all your methods here !
     * @param args
     */
    public static void main(String[] args) {
        SwitchStatements switchStatements = new SwitchStatements();
//        switchStatements.whatsMyChar('F');
        switchStatements.printMyPattern(5);
//        switchStatements.print(5);
    }

    /**
     * identifies the character by using different cases
     *
     * @param characher
     */
    private void whatsMyChar(char characher) {
        switch (characher) {
            case 'A':
                System.out.println("Its A");
                break;
            case 'B':
                System.out.println("Its B");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Its case C/D/E");
                break;
            default:
                System.out.println("There wasn't any match");
                break;
        }
    }

    // ##### DIFFERENCE BETWEEN LOOP AND SWITCH STATEMENT #### //

    /**
     * DYNAMIC STAR-PATTERN
     * method for printing star-pattern for any number of stars using for loop
     *
     * @param noOfStars
     */
    private void printMyPattern(int noOfStars) {
        int i, j;

        for (i = 0; i < noOfStars; i++) {
            for (j = 0; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }

    }

    /**
     * STATIC STAR-PATTERN
     * print the pattern using switch statement
     *
     * @param n
     */
    private void print(int n) {
        for (int i = 1; i <= n; i++) {
            printPattern(i);
        }
    }

    /**
     * called multiple times by print method depending on the
     * value of n variable passed to @param n of print method
     */
    private void printPattern(int i) {
        switch (i) {
            case 1:
                System.out.println("*");
                break;
            case 2:
                System.out.println("* *");
                break;
            case 3:
                System.out.println("* * *");
                break;
            case 4:
                System.out.println("* * * *");
                break;
            case 5:
                System.out.println("* * * * *");
                break;
            default:
                System.out.println("No value specified");
                break;
        }
    }
}

