package org.textgame.rooms;

import org.textgame.ColorsText;
import org.textgame.Player;
import org.textgame.items.Clover;
import org.textgame.roomchoices.InteractableRoom;

public class GraffitiRoom extends InteractableRoom {
    ColorsText colorsText = ColorsText.RESET;
    Clover clover = new Clover("Clover Peg");
    public GraffitiRoom(String name) {
        super(name);
    }

    @Override
    public String interactDesc(Player player) {
        setInteractAction(true);
        player.addToInventory(clover);
        return "Sliding your hand on the graffiti, you notice a painted over hidden slot hiding an item!"
                + colorsText.colorString(clover.getItemDescription(), ColorsText.YELLOW);
    }

    @Override
    protected String getDescription() {
        return "This former briefing room has been deprofessionalized with harsh graffiti.\n" +
                "Artistic replications of nuclear explosions and buildings are sprayed on the walls.";
    }
    @Override
    public Player gainPotentialItem(Player player) {
        return player;
    }
}
