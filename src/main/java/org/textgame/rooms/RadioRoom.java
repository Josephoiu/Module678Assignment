package org.textgame.rooms;

import org.textgame.ColorsText;
import org.textgame.Player;
import org.textgame.items.Radio;
import org.textgame.roomchoices.LootableRoom;

public class RadioRoom extends LootableRoom {
    Radio radio = new Radio("Loosened Radio");
    ColorsText colorsText = ColorsText.RESET;
    public RadioRoom(String name) {
        super(name);
    }
    @Override
    public String lootDesc(Player player) {
        setLootAction(true);
        return "Analyzing the walls, you grab the only radio loosened from the wall. It tears off cleanly.\n" +
                colorsText.colorString(radio.getItemDescription() + "\n",ColorsText.YELLOW)+
                colorsText.colorString(radio.getAttack().getAttackDesc(),ColorsText.RED);
    }
    @Override
    protected String getDescription() {
        return "The metallic clanging of footsteps echo across this cylindrical room of old radios. Some still\n" +
                "ring with static chirps and rings. As you make your way down to the end of the staircase, paths\n" +
                "are made clear.";
    }

    @Override
    public Player addItem(Player player) {
        player.addToInventory(radio);
        player.setAvailableAttacks(radio.getAttack());
        return player;
    }

}
