package io.github.kemblekaran.oop.composition;

/**
 * Room object for performing operations on ROOM
 */
public class Room {
    private Light theLight;
    private Furniture theFurniture;
    private Television theTelevision;
    private Door doors;

    public Room(Door doors, Light theLight, Furniture theFurniture, Television theTelevision) {
        this.doors = doors;
        this.theLight = theLight;
        this.theFurniture = theFurniture;
        this.theTelevision = theTelevision;
    }

    /**
     * This method will open the room
     * @param whichDoor
     */
    public void openRoom(String whichDoor) {
        doors.openDoors(whichDoor);
    }

    /**
     * This method will close the room
     * @param whichDoor
     */
    public void closeRoom(String whichDoor) {
        doors.closeDoors(whichDoor);
    }

    public void powerOnLight(boolean onOff){
        theLight.powerTheLight(onOff);
    }

    /**
     * This method will turn On TV
     */
    public void switchOnTv() {
        theTelevision.powerOn();
    }

    /**
     * This method will turn Off TV
     */
    public void switchOffTv(){
        theTelevision.powerOff();
    }

    /**Implementation for changing TV channel goes here
     * change the channel to another one!
     */
    public void changeChannel() {
        theTelevision.changeChannel("abc");
    }

    /**
     * rest on the furniture
     */
    public void rest() {
        theFurniture.seat();
    }
}
