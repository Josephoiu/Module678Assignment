package org.textgame.rooms;

import org.textgame.ColorsText;
import org.textgame.Player;
import org.textgame.items.Plush;
import org.textgame.roomchoices.InteractableRoom;
import org.textgame.roomchoices.LootableRoom;

public class OfficeRoom extends LootableRoom {
    public OfficeRoom(String name) {
        super(name);
    }
    Plush plush = new Plush("Worn Plush Bear");
    ColorsText colorsText = ColorsText.RESET;
    @Override
    protected String getDescription() {
        return "This hallway decorates itself with numerical codes for each office door\n" +
                "\"F432\",\"F422\",\"F411\", are examples. There are probably dozens of\n" +
                "these.";
    }

    @Override
    public Player addItem(Player player) {
        player.addToInventory(plush);
        player.addToScore(plush.getValue());
        player.setAvailableAttacks(plush.getAttack());
        return player;
    }

    @Override
    public String lootDesc(Player player) {
        setLootAction(true);
        return "Wedged almost like a door stop is a small, dirty plush bear, clearly seeing" +
                "the test of time.\n" +
                colorsText.colorString(plush.getItemDescription() + "\n", ColorsText.YELLOW)+
                colorsText.colorString(plush.getAttack().getAttackDesc(), ColorsText.RED);
    }
}
