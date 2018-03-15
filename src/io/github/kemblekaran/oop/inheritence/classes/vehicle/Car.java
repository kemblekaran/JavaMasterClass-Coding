package io.github.kemblekaran.oop.inheritence.classes.vehicle;

public class Car extends Vehicle {
    private String name;
    private String model;
    private int seats;
    private int speed;

    public Car(String name, String model, int seats) {
        this.name = name;
        this.model = model;
        this.seats = seats;
    }

    public int changeGears(int gears) {
        super.move();
        super.steer();
        if (gears == 1) {
            this.speed = 40;
            System.out.println("car speed is between 20 to 40");
        } else if (gears == 2) {
            this.speed = 60;
            System.out.println("car speed is between 40 to 60");
        } else if (gears == 3) {
            this.speed = 80;
            System.out.println("car speed is between 60 to 80");
        } else if (gears == 4) {
            this.speed = 100;
            System.out.println("car speed is between 80 to 100");
        } else {
            this.speed = 20;
            System.out.println("car speed is below 20");
        }
        return this.speed;
    }
}
