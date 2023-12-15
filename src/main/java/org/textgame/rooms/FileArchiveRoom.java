package org.textgame.rooms;

import org.textgame.ColorsText;
import org.textgame.Player;
import org.textgame.items.Firework;
import org.textgame.items.Radio;
import org.textgame.roomchoices.LootableRoom;

public class FileArchiveRoom extends LootableRoom {
    Firework firework = new Firework("Bundle of Fireworks");
    ColorsText colorsText = ColorsText.RESET;
    public FileArchiveRoom(String name) {
        super(name);
    }

    @Override
    public String lootDesc(Player player) {
        setLootAction(true);
        return "Flipping through dozens of boring files, you find one cabinet marked\n" +
                "as \"employee let off\", inside there are a bundle of fireworks!" +
                colorsText.colorString(firework.getItemDescription(),ColorsText.YELLOW) +
                colorsText.colorString(firework.getAttack().getAttackDesc(),ColorsText.RED);
    }

    @Override
    protected String getDescription() {
        return "In rows and columns, cabinets neatly situate themselves amongst the chaos of\n" +
                "thrown folders and files. Colorful sticky notes mark things of importance, at\n" +
                "least to someone in this field.";
    }

    @Override
    public Player addItem(Player player) {
        player.addToInventory(firework);
        player.addToScore(firework.getValue());
        player.setAvailableAttacks(firework.getAttack());
        return player;
    }
}
