package io.github.kemblekaran.oop.composition;

public class Television {
    private String model;
    private int size;
    private boolean isSmartTV;
    private Resolution resolution;
    private String color;

    public Television(String model, int size, boolean isSmartTV, Resolution resolution, String color) {
        this.model = model;
        this.size = size;
        this.isSmartTV = isSmartTV;
        this.resolution = resolution;
        this.color = color;
    }

    /**
     * method responsoble for changing the channel
     * @param channelName
     */
    public void changeChannel(String channelName) {
        System.out.println("channel changed to " + channelName);
        displayShow();
    }

    /**
     * display show on TV
     */
    public void displayShow() {
        System.out.println("displaying show : XYZ");
    }

    /**
     * power on television
     */
    public void powerOn() {
        System.out.println("#Powering tv on");
    }

    /**
     * power off television
     */
    public void powerOff() {
        System.out.println("#Powering tv off");
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public boolean isSmartTV() {
        return isSmartTV;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public String getColor() {
        return color;
    }
}
