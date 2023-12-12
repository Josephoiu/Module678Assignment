package org.textgame.roomchoices;

import org.textgame.Room;

public abstract class ExitableRoom extends Room implements Exitable {
    public ExitableRoom(String name) {
        super(name);
    }
    @Override
    protected abstract String getDescription();
    @Override
    public abstract String exitText();
}
