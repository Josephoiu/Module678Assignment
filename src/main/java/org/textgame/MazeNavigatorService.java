package org.textgame;

import org.textgame.roomchoices.Exitable;
import org.textgame.roomchoices.Interactable;
import org.textgame.roomchoices.Lootable;

public class MazeNavigatorService {
    private Room currentRoom;
    private static MazeNavigatorService single_instance = null;
    Player player;
    private boolean isFinished = false;

    public MazeNavigatorService getInstance(Player player) {
        if (single_instance == null) {
            single_instance = new MazeNavigatorService();
            this.player = player;
            MazeCreator mazeCreator = new MazeCreator();
            mazeCreator.createMaze();
            this.currentRoom = mazeCreator.getCurrentRoom();
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
        if (currentRoom instanceof Interactable) {
            if (!((Interactable) currentRoom).isInteractAction()) {
                return (((Interactable) currentRoom).interactDesc());
            } else if (((Interactable) currentRoom).isInteractAction()) {
                return ((Interactable) currentRoom).alreadyInteract();
            }
        }
        return "This room cannot be interacted with.";
    }

    public String exitCurrentRoom() {
        if (currentRoom instanceof Exitable) {
            isFinished = true;
            return ((Exitable) currentRoom).exitText();
        } else {
            return "This room cannot be exited.";
        }
    }

    public String lootCurrentRoom() {
        if (currentRoom instanceof Lootable) {
            if (!((Lootable) currentRoom).isLootAction()) {
                return (((Lootable) currentRoom).lootDesc(player));
            } else if (((Lootable) currentRoom).isLootAction()) {
                return ((Lootable) currentRoom).alreadyLooted();
            }
        }
        return "This room cannot be looted.";
    }
        public boolean move (char direction){
            if (currentRoom.isValidDirection(direction)) {
                currentRoom = currentRoom.getAdjoiningRoom(direction);
                return true;
            } else {
                return false;
            }
        }
        public boolean isFinished () {
            return isFinished;
        }
        private void setAllRooms () {
            MazeCreator mazeCreator = new MazeCreator();
            mazeCreator.createMaze();
        }
    }
