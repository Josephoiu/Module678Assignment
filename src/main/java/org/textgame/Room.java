package org.textgame;

import java.util.ArrayList;

abstract class Room {
    private String name;
    private Room north, south, east, west, up, down; //These are just references for future use, not objects
    public Room(String name) {
        this.name = name;
    }
    abstract String getDescription();
    public Room getAdjoiningRoom(char direction){
        if(direction == 'n'&& this.north != null){
            return north;
        }
        else if(direction == 's' && this.south != null){
            return south;
        }
        else if(direction == 'e' && this.east != null){
            return east;
        }
        else if(direction == 'w' && this.west != null){
            return west;
        }
        else if(direction == 'u' && this.up != null){
            return up;
        }
        else if(direction == 'd' && this.down != null){
            return down;
        }
        else {
            return null;
        }
    }
    public boolean isValidDirection(char direction){
        if(direction == 'n' && this.north != null){
            return true;
        }
        else if(direction == 's' && this.south != null){
            return true;
        }
        else if(direction == 'e' && this.east != null){
            return true;
        }
        else if(direction == 'w' && this.west != null){
            return true;
        }
        else if(direction == 'u' && this.up != null){
            return true;
        }
        else if(direction == 'd' && this.down != null){
            return true;
        }
        else {
            return false;
        }
    }

    public String getExits(){
        String getExit;
        ArrayList<Room> exits = new ArrayList<Room>();
        exits.add(this.north); exits.add(this.south);
        exits.add(this.east);  exits.add(this.west);
        exits.add(this.up);    exits.add(this.down);

        ArrayList<String> charCompass = new ArrayList<String>();
        charCompass.add("North"); charCompass.add("South");
        charCompass.add("East");  charCompass.add("West");
        charCompass.add("Up");    charCompass.add("Down");

        String summary = "The following are available directions:";
        for(int i = 0; i < exits.size(); i++) {
            if (exits.get(i) != null) {
                summary += " " + charCompass.get(i);
            }
        }
        return summary;
    }
    public String getName(){
        return this.name;
    }
    public void setNorth(Room north) {
        this.north = north;
    }
    public void setSouth(Room south) {
        this.south = south;
    }
    public void setEast(Room east) {
        this.east = east;
    }
    public void setWest(Room west) {
        this.west = west;
    }
    public void setUp(Room up) {
        this.up = up;
    }
    public void setDown(Room down) {
        this.down = down;
    }
}
