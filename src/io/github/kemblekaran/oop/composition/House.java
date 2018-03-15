package io.github.kemblekaran.oop.composition;

/**
 * Master Object to handle all operations
 */
public class House {
    public static void main(String a[]){
        /**
         * create objects that will be required to set up the room
         */
        Door doors = new Door();
        Light theLight = new Light();
        Furniture theFurniture = new Furniture(24,"grey",false);

        /**
         * define resolution for a TV
         */
        Resolution theResolution = new Resolution(2240,1443);
        Television theTelevision = new Television("LG",24,false,theResolution,"black");

        /**
         * Build room with the above created objects
         */
        Room myRoom = new Room(doors,theLight,theFurniture,theTelevision);

        /**
         * perform task on room
         */
        myRoom.openRoom("f");
        myRoom.powerOnLight(true);
        myRoom.switchOnTv();
        myRoom.rest();
        myRoom.changeChannel();
        myRoom.changeChannel();
        myRoom.switchOffTv();
        myRoom.powerOnLight(false);
        myRoom.closeRoom("f");
    }
}
