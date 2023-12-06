package org.textgame;

public class MazeConstructor {
    private Room currentRoom;
    private static MazeConstructor single_instance = null;
    private MazeConstructorHelper mazeConstructorHelper = new MazeConstructorHelper();
    public static MazeConstructor getInstance() {
        if(single_instance == null){
            single_instance = new MazeConstructor();

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
        return "nothing";
    }
    public String exitCurrentRoom() {
        return "nothing";
    }

    public String lootCurrentRoom() {
        return "nothing";
    }
    public boolean move(char direction) {
        if (currentRoom.isValidDirection(direction)) {
            currentRoom = currentRoom.getAdjoiningRoom(direction);
            return true;
        } else {
            return false;
        }
    }
}
