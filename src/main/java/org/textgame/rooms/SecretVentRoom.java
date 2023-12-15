package org.textgame.rooms;

import org.textgame.Player;
import org.textgame.items.Heart;
import org.textgame.roomchoices.LootableRoom;

public class SecretVentRoom extends LootableRoom {
    Heart heart = new Heart("Heart Peg");
    public SecretVentRoom(String name) {
        super(name);
    }

    @Override
    public String lootDesc(Player player) {
        return "Picking through his ribcage, you find a heart peg!\n"+
                heart.getItemDescription();
    }

    @Override
    protected String getDescription() {
        return "Climbing down the ladder, you are met with the remains of a deceased worker,\n" +
                "now just a skeleton. Tools are scattered.";
    }

    @Override
    public Player addItem(Player player) {
        player.addToInventory(heart);
        player.addToScore(heart.getValue());
        return null;
    }
}
