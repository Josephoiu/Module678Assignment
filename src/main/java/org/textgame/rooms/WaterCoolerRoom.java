package org.textgame.rooms;

import org.textgame.ColorsText;
import org.textgame.Player;
import org.textgame.roomchoices.InteractableRoom;

import java.awt.*;

public class WaterCoolerRoom extends InteractableRoom {
    public WaterCoolerRoom(String name) {
        super(name);
    }
    ColorsText colorsText = ColorsText.RESET;
    @Override
    public String interactDesc(Player player) {
        return "Analyzing the corners of the glass, you notice " + colorsText.colorString("one part is cracked.", ColorsText.PURPLE);
    }

    @Override
    protected String getDescription() {
        return "Behind protective glass one machine maintains its one task, boiling water." +
                "Churning its mechanical pistons, water is boiled in a large vat.";
    }
    @Override
    public Player gainPotentialItem(Player player) {
        return player;
    }
}
