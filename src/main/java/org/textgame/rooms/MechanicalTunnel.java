package org.textgame.rooms;

import org.textgame.ColorsText;
import org.textgame.Player;
import org.textgame.roomchoices.InteractableRoom;

public class MechanicalTunnel extends InteractableRoom {
    ColorsText colorsText = ColorsText.RESET;
    public MechanicalTunnel(String name) {
        super(name);
    }
    @Override
    public String interactDesc(Player player) {
        return "Flickering the levers do not do anything. No electricity flows through these circuits.";
    }

    @Override
    protected String getDescription() {
        return "Stumbling in the ruble of twisted metal, a winding, twisting hallway of\n" +
                "various levers and buttons beckon your attention.";
    }
    @Override
    public Player gainPotentialItem(Player player) {
        return player;
    }
}
