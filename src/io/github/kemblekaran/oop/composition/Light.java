package io.github.kemblekaran.oop.composition;

/**
 * responsible for turning the lights ON or OFF
 */
public class Light {
    private String model;

    public Light() {
    }

    public Light(String model) {
        this.model = model;
    }

    /**Key method for
     * powering the light of the room
     * @param onOff
     */
    public void powerTheLight(boolean onOff) {
        if(onOff)
        System.out.println("light has been turned ON");
        else
            System.out.println("light has been turned OFF");
    }
}
