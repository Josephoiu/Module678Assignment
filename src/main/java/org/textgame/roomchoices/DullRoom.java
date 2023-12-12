package org.textgame.roomchoices;

import org.textgame.Room;

public class DullRoom extends Room {
    public DullRoom(String name) {
        super(name);
    }

    protected String getDescription() {
        return null;
    }
}
