package org.textgame.roomchoices;

import org.textgame.Player;
import org.textgame.Room;

/**
 * Creates an InteractableExitableRoom by extending off the abstract class InteractableRoom and implementing methods from Exitable.
 */
public abstract class InteractableExitableRoom extends InteractableRoom implements Exitable{
    public InteractableExitableRoom(String name) {
        super(name);
    }

    @Override
    public abstract String exitText();

    @Override
    public abstract Boolean finishMaze(Player player);

    @Override
    public abstract String interactDesc(Player player);
    @Override
    protected abstract String getDescription();
}
