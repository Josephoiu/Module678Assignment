package org.textgame.rooms;

import org.textgame.*;
import org.textgame.roomchoices.Exitable;
import org.textgame.roomchoices.InteractableRoom;

public class EntranceRoom extends InteractableRoom implements Exitable {
    public EntranceRoom(String name) {
        super(name);
    }
    CheckIfPlayerCanExit checkIfPlayerCanExit = new CheckIfPlayerCanExit();

    @Override
    protected String getDescription() {
        ColorsText colorsText = ColorsText.RESET;
        return "A single ray of light pierces through an above window. You stand next to the railing of a descending staircase.\n" +
                "Overshadowing you to the north is a large steel door etched with the following symbols," + colorsText.colorString(" A diamond, a clover, a heart, and a spade.", ColorsText.BLUE);
    }

    @Override
    public String interactDesc(Player player) {
        ColorsText colorsText = ColorsText.RESET;
        return "Moving your finger across the etchings, you notice you can push them inwards.\n"+
                "These seem to be " + colorsText.colorString("unique empty slots. Perhaps you can fill them in?", ColorsText.PURPLE);
    }

    @Override
    public Player gainPotentialItem(Player player) {
        return player;
    }
    @Override
    public String exitText() {
        return "Filling in the slots, they all push in and slowly open the door. Your eyes adjust to the perimeter of an abandoned power plant.\n" +
                "Hazard tape closes off most of the areas. You successfully have escaped!";
    }

    @Override
    public Boolean finishMaze(Player player) {
        return checkIfPlayerCanExit.checkIfCanExit(player);
    }
}
