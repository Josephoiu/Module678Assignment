package org.textgame.rooms;

import org.textgame.Player;
import org.textgame.roomchoices.LootableRoom;

public class RadioRoom extends LootableRoom {
    public RadioRoom(String name) {
        super(name);
    }
    @Override
    public String lootDesc(Player player) {
        return null;
    }
    @Override
    protected String getDescription() {
        return null;
    }

    @Override
    public void addItem() {

    }

}
