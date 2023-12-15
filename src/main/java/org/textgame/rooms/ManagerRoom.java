package org.textgame.rooms;

import org.textgame.ColorsText;
import org.textgame.Enemy;
import org.textgame.Player;
import org.textgame.SystemAttackSystem;
import org.textgame.enemies.ShadowHands;
import org.textgame.items.Diamond;
import org.textgame.roomchoices.InteractableBattleRoom;
import org.textgame.roomchoices.InteractableLootableRoom;

public class ManagerRoom extends InteractableBattleRoom {
    Diamond diamond = new Diamond("Diamond Peg");
    ColorsText colorsText = ColorsText.RESET;
    SystemAttackSystem systemAttackSystem;
    Enemy shadowHands = new ShadowHands("Shadow Hands", 50);
    Boolean battleFinished = false;

    public ManagerRoom(String name) {
        super(name);
    }

    @Override
    public String interactDesc(Player player) {
        if (!battleFinished) {
            systemAttackSystem = new SystemAttackSystem(player, shadowHands, "As you get closer to the hands, they suddenly attack!", diamond);
            systemAttackSystem.battleLoop();
            systemAttackSystem.printInfo(lootDesc(player));
        }
        return "The " + shadowHands.getName() + " remain still.";
    }

    @Override
    protected String getDescription() {
        return "Fixed upon the desk are multiple stacked papers and figurines of popular pop figures\n" +
                "From the ceiling, twisting arms entangled with copper wire protect a Diamond cog.";
    }

    @Override
    public Player gainPotentialItem(Player player) {
        player.addToInventory(diamond);
        player.addToScore(diamond.getValue());
        return player;
    }

    public String lootDesc(Player player) {
        return colorsText.colorString(diamond.getItemDescription(), ColorsText.YELLOW);
    }

}
