package io.github.kemblekaran.oop.classes.vehicle;

public class Hundai extends Car {
    private int gears;
    private int speed;

    public Hundai(String name, String model, int gears) {
        super(name, model, 4);
        this.gears = gears;
    }

    @Override
    public int changeGears(int gears) {
        this.speed = super.changeGears(gears);
        return this.speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getGears() {
        return gears;
    }

    @Override
    public void setGears(int gears) {
        this.gears = gears;
    }
}
