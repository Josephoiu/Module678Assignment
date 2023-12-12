package org.textgame.rooms;

import org.textgame.ColorsText;
import org.textgame.roomchoices.InteractableRoom;

public class EntranceRoom extends InteractableRoom {
    public EntranceRoom(String name) {
        super(name);
    }

    @Override
    protected String getDescription() {
        ColorsText colorsText = ColorsText.RESET;
        return "A single ray of light pierces through an above window. You stand next to the railing of a descending staircase.\t" +
                "Overshadowing you is a large steel door etched with the following symbols," + colorsText.colorString("A diamond, a clover, a heart, and a spade.", ColorsText.BLUE);
    }

    @Override
    public String interactDesc() {
        setInteractAction(true);
        ColorsText colorsText = ColorsText.RESET;
        return "Moving your finger across the etchings, you notice you can push them inwards\t"+
                "These seem to be" + colorsText.colorString("unique slots", ColorsText.PURPLE);
    }
}
