package org.textgame.rooms;

import org.textgame.ColorsText;
import org.textgame.Player;
import org.textgame.items.Item;
import org.textgame.items.Pipe;
import org.textgame.items.Spade;
import org.textgame.roomchoices.InteractableRoom;

import java.awt.*;

public class WaterCoolerRoom extends InteractableRoom {
    public WaterCoolerRoom(String name) {
        super(name);
    }
    ColorsText colorsText = ColorsText.RESET;
    Spade spade = new Spade("Spade Cog");
    @Override
    public String interactDesc(Player player) {
        if(gainSpades(player)){
            setInteractAction(true);
            return "You bust down the glass with your pipe. Inside, you grab the clover shaped peg.";
        }
        return "Analyzing the corners of the glass, you notice " + colorsText.colorString("one part is cracked, alongside a clover shaped peg.", ColorsText.PURPLE);
    }
    private Boolean gainSpades(Player player) {
        for (Item item:player.getListInventory()) {
            if (item instanceof Pipe){
                return true;
            }
        }
        return false;
    }
    @Override
    protected String getDescription() {
        return "Behind protective glass one machine maintains its one task, boiling water. " +
                "Churning its mechanical pistons, water is boiled in a large vat.";
    }
    @Override
    public Player gainPotentialItem(Player player) {
        player.addToInventory(spade);
        return player;
    }
}
