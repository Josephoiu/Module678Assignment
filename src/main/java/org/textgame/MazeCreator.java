package org.textgame;

import org.textgame.rooms.EntranceRoom;
import org.textgame.rooms.RadioRoom;
import org.textgame.rooms.TestExitRoom;

public class MazeCreator {
    Room currentRoom;
    public void createMaze(){
        createRooms();
    }
    private void createRooms(){
        //Create Rooms
        EntranceRoom entranceRoom = new EntranceRoom("Entrance Room");
        RadioRoom radioRoom = new RadioRoom("Radio Broadcast Room");
        TestExitRoom testExitRoom = new TestExitRoom("Exit Room");

        //Set Paths
        setDirectionRoom(entranceRoom,radioRoom,Directions.WEST);
        setDirectionRoom(entranceRoom,testExitRoom,Directions.EAST);
        setCurrentRoom(entranceRoom);

    }
    private void setDirectionRoom(Room currentRoom, Room roomBeingSet, Directions directions){
        currentRoom.setRoom(roomBeingSet,directions);
    }
    private void setCurrentRoom(Room currentRoom){
        this.currentRoom = currentRoom;
    }
    public Room getCurrentRoom(){
        return currentRoom;
    }
}
