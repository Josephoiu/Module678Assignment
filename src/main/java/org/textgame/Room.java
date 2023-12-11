package org.textgame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static org.textgame.EnumUtility.enumConstantstoList;

public abstract class Room {
    private String name;
    private final HashMap<Character,Room> availableRooms = createRoomList();
    private final List<Directions> enumDirections = enumConstantstoList(Directions.class);
    public Room(String name) {
        this.name = name;
    }
    protected abstract String getDescription();
    public Room getAdjoiningRoom(char direction){
        for(int i = 0; i < enumDirections.size(); i++) {
            if(direction == enumDirections.get(i).getSingleChar() && availableRooms.get(direction) != null){
                return availableRooms.get(i);
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
        for(int i = 0; i < availableRooms.size(); i++) {
            if (availableRooms.get(i) != null) {
                summary += " " + enumDirections.get(i).getSingleChar();
            }
        }
        return summary;
    }
    public String getName(){
        return this.name;
    }
    private HashMap<Character, Room> createRoomList(){
        for(int i = 0; i < enumDirections.size(); i++) {
            availableRooms.put(enumDirections.get(i).getSingleChar(), null);
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
