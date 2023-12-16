package org.textgame.rooms;

import org.textgame.Enemy;
import org.textgame.Player;
import org.textgame.SystemAttackSystem;
import org.textgame.enemies.Centipede;
import org.textgame.items.CentipedeFang;
import org.textgame.roomchoices.InteractableRoom;

public class TerminalRoom extends InteractableRoom {
    SystemAttackSystem systemAttackSystem;
    Enemy centipede = new Centipede("Large Centipede", 20);
    CentipedeFang centipedeFang = new CentipedeFang("Centipede Fang");
    Boolean battleFinished = false;

    public TerminalRoom(String name) {
        super(name);
    }

    @Override
    public String interactDesc(Player player) {
        if (fightChance()) {
            if (!battleFinished) {
                systemAttackSystem = new SystemAttackSystem(player, centipede, "Moving closer to the terminals, you notice a large centipede squirming out of the broken monitor. It looks hostile.",centipedeFang);
                systemAttackSystem.battleLoop();
                setInteractAction(true);
            }
        }
        return "Peeking at the terminals, you find nothing.";
    }

    @Override
    protected String getDescription() {
        return "The atmosphere is liminal as scattered throughout the damp room are\n" +
                "terminals and office chairs. Wires twist and turn half-hazardly, the\n" +
                "terminals align in a slight curvature.";
    }

    @Override
    public Player gainPotentialItem(Player player) {
        player.addToInventory(centipedeFang);
        return player;
    }

    public boolean fightChance() {
        double rand = Math.random();
        return rand <= 0.5;
    }
}
