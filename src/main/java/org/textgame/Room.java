package org.textgame;

import java.security.KeyStore;
import java.util.*;

import static org.textgame.EnumUtility.enumConstantstoList;

/**
 * The Room class is abstract and has the following fields: a name, a list of available directions,
 * and a list of available rooms.
 */
public abstract class Room {
    private String name;
    private final List<Directions> enumDirections = enumConstantstoList(Directions.class);
    private HashMap<Character,Room> availableRooms = new HashMap<Character,Room>();

    /**
     * Constructor sets availableRooms by using the private method createRoomList();
     * @param name - Sets name
     */
    public Room(String name) {
        this.name = name;
        availableRooms = createRoomList();
    }
    protected abstract String getDescription();

    /**
     * @param direction - Checks if the availableRoom is available.
     * @return - Grabs availableRoom based on direction.
     */
    public Room getAdjoiningRoom(char direction){
        for (Directions enumDirection : enumDirections) {
            if (direction == enumDirection.getSingleChar() && availableRooms.get(direction) != null) {
                return availableRooms.get(direction);
            }
        }
        return null;
    }

    /**
     * @param direction - Checks availableRooms given the direction is available.
     * @return - True or false.
     */
    public boolean isValidDirection(char direction){
        for (Directions enumDirection : enumDirections) {
            if (direction == enumDirection.getSingleChar() && availableRooms.get(direction) != null) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return - Summary of all available exits in the current room.
     */
    public String getExits(){
        Directions directions = Directions.NORTH;
        String summary = "The following are available directions:\n";
        for(Map.Entry<Character, Room> entry: availableRooms.entrySet()){
            if(entry.getValue() != null){
                summary += "   <" + directions.stringFromChar(entry.getKey()) + " - " + entry.getValue().getName() + ">";
            }
        }
        return summary;
    }
    public String getName(){
        return this.name;
    }

    /**
     * @return - availableRooms with null objects.
     */
    private HashMap<Character, Room> createRoomList(){
        for (Directions enumDirection : enumDirections) {
            availableRooms.put(enumDirection.getSingleChar(),null);
        }
        return availableRooms;
    }

    /**
     * @param room - Room being set.
     * @param directions - Sets the room based on direction given and if the slot is absent.
     */
    public void setRoom(Room room, Directions directions){
        for(int i = 0; i < availableRooms.size(); i++) {
            if(availableRooms.containsKey(directions.getSingleChar())){
                availableRooms.putIfAbsent(directions.getSingleChar(), room);
            }
        }
    }
}
