package org.textgame;

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
    public boolean isFinished() {
        return isFinished;
    }
    private void setAllRooms(){
        MazeCreator mazeCreator = new MazeCreator();
        mazeCreator.createMaze();
    }
}
