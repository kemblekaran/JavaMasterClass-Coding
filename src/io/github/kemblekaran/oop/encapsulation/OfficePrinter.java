package io.github.kemblekaran.oop.encapsulation;

public class OfficePrinter {
    public static void main(String[] args){
        Printer printer = new Printer(20,false);
        printer.printPages();
        printer.printPages();

        printer.fillToner(30);
    }
}
