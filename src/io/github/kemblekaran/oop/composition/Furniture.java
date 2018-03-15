package io.github.kemblekaran.oop.composition;

/**
 * Furniture definition of Room
 */
public class Furniture {
    private int size;
    private String color;
    private boolean hasMultiFeature;

    public Furniture(int size, String color, boolean hasMultiFeature) {

        this.size = size;
        this.color = color;
        this.hasMultiFeature = hasMultiFeature;
    }

    public void seat() {
        System.out.println("seating on furniture");
    }
}
