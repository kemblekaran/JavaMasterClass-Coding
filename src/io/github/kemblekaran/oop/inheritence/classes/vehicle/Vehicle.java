package io.github.kemblekaran.oop.inheritence.classes.vehicle;

public class Vehicle {
    private final static String TAG = Vehicle.class.getSimpleName();
    private String name;
    private int wheels;
    private int size;
    private int gears;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public void move() {
        System.out.println(TAG + " is moving");
    }

    public void steer() {
        System.out.println(TAG + " is steering");
    }
}
