package org.textgame;

import org.textgame.items.*;
import org.textgame.roomchoices.Exitable;
import org.textgame.roomchoices.Interactable;
import org.textgame.roomchoices.Lootable;

/**
 * The constructor creates the maze ONLY ONCE using the Singleton Pattern.
 * The class also deals with grabbing the current rooms base info. Deals with
 * interacting, looting, exiting, and moving rooms.
 */
public class MazeNavigatorService {
    private Room currentRoom;
    private static MazeNavigatorService single_instance = null;
    Player player;
    private boolean isFinished = false;

    public MazeNavigatorService getInstance(Player player) {
        if (single_instance == null) {
            single_instance = new MazeNavigatorService();
            this.player = player;
            MazeFactory mazeCreator = new MazeFactory(player);
            mazeCreator.createMaze();
            currentRoom = mazeCreator.getCurrentRoom();
        }
        return single_instance;
    }

    public String getCurrentRoomName() {
        return currentRoom.getName();
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
                ((Interactable) currentRoom).gainPotentialItem(player);
                return (((Interactable) currentRoom).interactDesc(player));
            } else if (((Interactable) currentRoom).isInteractAction()) {
                return ((Interactable) currentRoom).alreadyInteract();
            }
        }
        return "This room cannot be interacted with.";
    }

    public String exitCurrentRoom() {
        if (currentRoom instanceof Exitable) {
            if (((Exitable) currentRoom).finishMaze(player)) {
                isFinished = true;
                return ((Exitable) currentRoom).exitText();
            }
        }
        return "This room cannot be exited.";
    }

    public String lootCurrentRoom() {
        if (currentRoom instanceof Lootable) {
            if (!((Lootable) currentRoom).isLootAction()) {
                ((Lootable) currentRoom).addItem(player);
                return (((Lootable) currentRoom).lootDesc(player));
            } else if (((Lootable) currentRoom).isLootAction()) {
                return ((Lootable) currentRoom).alreadyLooted();
            }
        }
        return "This room cannot be looted.";
    }

    public boolean move(char direction) {
        if (currentRoom.isValidDirection(direction)) {
            currentRoom = currentRoom.getAdjoiningRoom(direction);
        }
        return false;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean isFinished() {
        return isFinished;
    }
}
