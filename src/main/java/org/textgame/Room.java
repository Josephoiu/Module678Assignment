package org.textgame;

import org.textgame.roomchoices.DullRoom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

import static org.textgame.EnumUtility.enumConstantstoList;

public abstract class Room {
    private String name;
    private final List<Directions> enumDirections = enumConstantstoList(Directions.class);
    private HashMap<Character,Room> availableRooms = new HashMap<Character,Room>();
    public Room(String name) {
        this.name = name;
        availableRooms = createRoomList();
    }
    protected abstract String getDescription();
    public Room getAdjoiningRoom(char direction){
        for (Directions enumDirection : enumDirections) {
            if (direction == enumDirection.getSingleChar() && availableRooms.get(direction) != null) {
                return availableRooms.get(direction);
            }
        }
        return null;
    }
    public boolean isValidDirection(char direction){
        for (Directions enumDirection : enumDirections) {
            if (direction == enumDirection.getSingleChar() && availableRooms.get(direction) != null) {
                return true;
            }
        }
        return false;
    }
    public String getExits(){
        String summary = "The following are available directions:";
        int enumCounter = enumDirections.size();
        for(Room room : availableRooms.values()){
            if(room != null){
                summary += " -" + enumDirections.get(enumCounter).getName() + "-";
            }
            enumCounter--;
        }
        return summary;
    }
    public String getName(){
        return this.name;
    }
    private HashMap<Character, Room> createRoomList(){
        for (Directions enumDirection : enumDirections) {
            availableRooms.put(enumDirection.getSingleChar(),null);
        }
        return availableRooms;
    }
    public void setRoom(Room room, Directions directions){
        for(int i = 0; i < availableRooms.size(); i++) {
            if(availableRooms.containsKey(directions.getSingleChar())){
                availableRooms.putIfAbsent(directions.getSingleChar(), room);
            }
        }
    }
}
