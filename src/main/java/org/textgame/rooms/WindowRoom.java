package org.textgame.rooms;

import org.textgame.ColorsText;
import org.textgame.Player;
import org.textgame.items.Item;
import org.textgame.items.Pipe;
import org.textgame.roomchoices.InteractableExitableRoom;
import org.textgame.roomchoices.InteractableLootableRoom;
import org.textgame.roomchoices.InteractableRoom;

public class WindowRoom extends InteractableExitableRoom {
    public WindowRoom(String name) {
        super(name);
    }

    @Override
    public String exitText() {
        return "One swing, two swing, three swing four, you shatter the glass with the pipe. You jump out the window, landing on a raggity bush. You have escaped!";
    }

    @Override
    public Boolean finishMaze(Player player) {
        for (Item item:player.getListInventory()) {
            if (item instanceof Pipe){
                return true;
            }
        }
        return false;
    }

    ColorsText colorsText = ColorsText.RESET;
    @Override
    public String interactDesc(Player player) {
        return "You notice if this window was hit hard enough with an item, " + colorsText.colorString("it could shatter.", ColorsText.PURPLE);
    }
    @Override
    protected String getDescription() {
        return "A multi-paneled window oversees large rundown facilities.";
    }
    @Override
    public Player gainPotentialItem(Player player) {
        return player;
    }
}
