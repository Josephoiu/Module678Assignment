package org.textgame.rooms;

import org.textgame.roomchoices.InteractableRoom;

public class EntranceRoom extends InteractableRoom {
    public EntranceRoom(String name) {
        super(name);
    }

    @Override
    protected String getDescription() {
        return "You awake.";
    }

    @Override
    public String interactDesc() {
        return null;
    }
}
