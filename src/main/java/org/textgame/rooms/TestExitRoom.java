package org.textgame.rooms;

import org.textgame.roomchoices.ExitableRoom;

public class TestExitRoom extends ExitableRoom {
    public TestExitRoom(String name) {
        super(name);
    }

    @Override
    protected String getDescription() {
        return "Exit Text";
    }

    @Override
    public String exitText() {
        return "You did it!";
    }
}
