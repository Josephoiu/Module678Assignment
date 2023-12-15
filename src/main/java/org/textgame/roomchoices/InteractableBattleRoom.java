package org.textgame.roomchoices;

import org.textgame.Player;

public abstract class InteractableBattleRoom extends InteractableRoom{
    public InteractableBattleRoom(String name) {
        super(name);
    }

    @Override
    public String interactDesc(Player player) {
        return null;
    }

    @Override
    protected String getDescription() {
        return null;
    }

    public abstract Player gainPotentialItem(Player player);
}
