package org.textgame.rooms;

import org.textgame.ColorsText;
import org.textgame.Player;
import org.textgame.items.Pipe;
import org.textgame.roomchoices.LootableRoom;

public class PipeRoom extends LootableRoom {
    public PipeRoom(String name) {
        super(name);
    }
    Pipe pipe = new Pipe("Bent Pipe");
    ColorsText colorsText = ColorsText.RESET;
    @Override
    public String lootDesc(Player player) {
        setLootAction(true);
        return "Near the ground, you find smaller pipes terribly bent out of shape.\n" +
                "One is completely torn out of function, bent almost like a crowbar.\n"+
                colorsText.colorString(pipe.getItemDescription() + "\n",ColorsText.YELLOW)+
                colorsText.colorString(pipe.getAttack().getAttackDesc(), ColorsText.RED);
    }

    @Override
    protected String getDescription() {
        return "Curving left and right are a multitude of different colored pipes, each\n" +
                "labeled with symbols and caution warnings. Some combine into each other\n" +
                "while others extend to other areas.";
    }

    @Override
    public Player addItem(Player player) {
        player.addToInventory(pipe);
        player.addToScore(pipe.getValue());
        player.setAvailableAttacks(pipe.getAttack());
        return player;
    }
}
