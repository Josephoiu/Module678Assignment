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
        return "Amongst odd ends and shapes, you awake in an analog landscape rid of coherence and logic.\nOverlapping geometric forms glide past your vision. Static lines intertwine to mark paths." + colorsText.colorString("\nTowering above you is a large locked door.",ColorsText.PURPLE);
    }

    @Override
    public String interactDesc() {
        setInteractAction(true);
        ColorsText colorsText = ColorsText.RESET;
        return "Symbols are etched carefully on the metal door." +
                colorsText.colorString(" A diamond, a clover, a heart, and a spade.",ColorsText.BLUE);
    }
}
