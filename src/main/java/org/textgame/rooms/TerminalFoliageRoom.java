package org.textgame.rooms;

import org.textgame.ColorsText;
import org.textgame.Player;
import org.textgame.items.Bucket;
import org.textgame.roomchoices.LootableRoom;

public class TerminalFoliageRoom extends LootableRoom {
    ColorsText colorsText = ColorsText.RESET;
    Bucket bucket = new Bucket("Gross Bucket");
    public TerminalFoliageRoom(String name) {
        super(name);
    }

    @Override
    public String lootDesc(Player player) {
        setLootAction(true);
        return "Analyzing the drips from the ceiling, you notice it piling up in a small bucket. What a score!\n" +
                colorsText.colorString(bucket.getItemDescription() + "\n", ColorsText.YELLOW) +
                colorsText.colorString(bucket.getAttack().getAttackDesc(), ColorsText.RED);
    }

    @Override
    protected String getDescription() {
        return "This room is full of deprecated terminal systems, with various fungi's\n" +
                "sheeted over the hardware. The ceiling is moist and drips unknown fluid\n" +
                "onto the floor.";
    }

    @Override
    public Player addItem(Player player) {
        player.addToInventory(bucket);
        player.addToScore(bucket.getValue());
        player.setAvailableAttacks(bucket.getAttack());
        return player;
    }
}
