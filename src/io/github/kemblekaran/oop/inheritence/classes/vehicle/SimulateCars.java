package io.github.kemblekaran.oop.inheritence.classes.vehicle;

public class SimulateCars {
    public static void main(String a[]){
        Hundai hundai = new Hundai("H10","Model 45",1);
        hundai.changeGears(2);
        System.out.println("Hundai can move at max "+hundai.getSpeed() +" on this gear");
    }
}
