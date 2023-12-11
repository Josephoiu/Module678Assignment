package org.textgame;

import org.textgame.roomchoices.Exitable;
import org.textgame.roomchoices.Interactable;
import org.textgame.roomchoices.Lootable;

public class MazeNavigatorService {
    private Room currentRoom;
    private static MazeNavigatorService single_instance = null;
    private boolean isFinished = false;
    public static MazeNavigatorService getInstance() {
        if(single_instance == null){
            single_instance = new MazeNavigatorService();
        }
        return single_instance;
    }
    public String getCurrentRoomDescription() {
        return currentRoom.getDescription();
    }
    public String currentRoomExits() {
        return currentRoom.getExits();
    }
    public String interactWithCurrentRoom() {
        if(currentRoom instanceof Interactable){
            return ((Interactable) currentRoom).interactDesc();
        } else {
            return "\nThis room was already interacted with.";
        }
    }
    public String exitCurrentRoom() {
        if(currentRoom instanceof Exitable){
            isFinished = true;
            return ((Exitable) currentRoom).exitText();
        } else {
            return "\nThis room cannot be exited.";
        }
    }
    public String lootCurrentRoom() {
        if(currentRoom instanceof Lootable){
            return ((Lootable) currentRoom).lootDesc();
        } else {
            return "\nThis room cannot be looted.";
        }
    }
    public boolean move(char direction) {
        if (currentRoom.isValidDirection(direction)) {
            currentRoom = currentRoom.getAdjoiningRoom(direction);
            return true;
        } else {
            return false;
        }
    }
    public boolean isFinished() {
        return isFinished;
    }
    private void setAllRooms(){
        MazeCreator mazeCreator = new MazeCreator();
        mazeCreator.createMaze();
    }
}
