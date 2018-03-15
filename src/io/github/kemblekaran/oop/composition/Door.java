package io.github.kemblekaran.oop.composition;

/**
 * door system for room
 * Handling opening and closing of doors
 */
public class Door {
    private Door doors;
    private Door backDoor;
    private Door frontDoor;

    public void openDoors(String whichDoor) {
        if (whichDoor.equals("f"))
            this.doors = openFrontDoor();
        if (whichDoor.equals("b"))
            this.doors = openBackDoor();
    }

    public void closeDoors(String whichDoor) {
        if (whichDoor.equals("f"))
            this.doors = closeFrontDoor();
        if (whichDoor.equals("b"))
            this.doors = closeBackDoor();
    }

    private Door openBackDoor() {
        System.out.println("back door opened!");
        return backDoor;
    }

    private Door openFrontDoor() {
        System.out.println("front door opened!");
        return frontDoor;
    }

    private Door closeBackDoor() {
        System.out.println("back door closed!");
        return backDoor;
    }

    private Door closeFrontDoor() {
        System.out.println("front door closed!");
        return frontDoor;
    }
}
