package org.textgame.rooms;

import org.textgame.Player;
import org.textgame.items.FlameThrower;
import org.textgame.roomchoices.InteractableLootableRoom;

public class StrangeMachineRoom extends InteractableLootableRoom {
    FlameThrower flameThrower = new FlameThrower("Prototype Flamethrower");
    boolean lever;
    public StrangeMachineRoom(String name) {
        super(name);
    }

    @Override
    public String interactDesc(Player player) {
        if(!lever){
            lever = true;
            return "Pressing the button, the machines suddenly jolt and continue their tasks.";
        } else {
            lever = false;
            return "Pressing the button, the machines go limp.";
        }
    }

    @Override
    protected String getDescription() {
        return "Rows of production line machines fill this liminal space. Some are stuck stationary\n" +
                "mid-task. There is one terminal with a multitude of buttons.";
    }

    @Override
    public String lootDesc(Player player) {
        if(!lever){
            setLootAction(true);
            return "You carefully pull out a weapon mid-construction out of the machines hands. It is very loose.";
        } else {
            return "You're going to lose an arm if you try to loot those running machines!";
        }
    }

    @Override
    public Player addItem(Player player) {
        player.addToInventory(flameThrower);
        player.addToScore(flameThrower.getValue());
        player.setAvailableAttacks(flameThrower.getAttack());
        return player;
    }
    @Override
    public Player gainPotentialItem(Player player) {
        return player;
    }
}
