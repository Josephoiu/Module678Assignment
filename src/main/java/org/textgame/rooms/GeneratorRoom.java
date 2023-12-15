package org.textgame.rooms;

import org.textgame.AttackTypes;
import org.textgame.ColorsText;
import org.textgame.Player;
import org.textgame.roomchoices.InteractableRoom;

public class GeneratorRoom extends InteractableRoom {
    ColorsText colorsText = ColorsText.RESET;
    public GeneratorRoom(String name) {
        super(name);
    }

    @Override
    public String interactDesc(Player player) {
        setInteractAction(true);
        int lightningDamage = AttackTypes.LIGHTNING.getDamageAmount();
        player.setHealth(player.getHealth() - lightningDamage);
        return "You interact with the machine, sending a jolting zap! " +
                "You lose: " + lightningDamage + " health.";
    }

    @Override
    protected String getDescription() {
        return "Wires hanging from the ceiling connect to a large electric generator. LED's flicker\n" +
                "back and forth, resembling some type of code. " + colorsText.colorString("Sparks of electricity illuminate the generator.", ColorsText.RED);
    }
    @Override
    public Player gainPotentialItem(Player player) {
        return player;
    }
}
