package org.textgame.rooms;

import org.textgame.ColorsText;
import org.textgame.Player;
import org.textgame.items.Heart;
import org.textgame.roomchoices.LootableRoom;

import java.awt.*;

public class SecretVentRoom extends LootableRoom {
    Heart heart = new Heart("Heart Peg");
    ColorsText colorsText = ColorsText.RESET;
    public SecretVentRoom(String name) {
        super(name);
    }

    @Override
    public String lootDesc(Player player) {
        setLootAction(true);
        return "Picking through his ribcage, you find a heart peg!\n"+
                colorsText.colorString(heart.getItemDescription(), ColorsText.YELLOW);
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
        return player;
    }
}
