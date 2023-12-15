package org.textgame.rooms;

import org.textgame.Directions;
import org.textgame.Player;
import org.textgame.roomchoices.InteractableLootableRoom;
import org.textgame.roomchoices.InteractableRoom;
import org.textgame.roomchoices.LootableRoom;

public class NotFinishedComputerRoom extends InteractableRoom {
    LootableRoom room;
    public NotFinishedComputerRoom(String name, LootableRoom lootableRoom) {
        super(name);
        this.room = lootableRoom;
    }

    @Override
    protected String getDescription() {
        return "A large super computer is solidified around protective railing, it seems\n" +
                "to have been half-built, with the remains being scattered throughout.";
    }

    @Override
    public String interactDesc(Player player) {
        setInteractAction(true);
        setRoom(room, Directions.BOTTOM);
        return "You hop over the railing and inspect further, you notice some of the scattered remains\n" +
                "making a trail that leads to a torn human-sized vent. This seems to be a secret area.";
    }
    @Override
    public Player gainPotentialItem(Player player) {
        return player;
    }
}
