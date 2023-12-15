package org.textgame.roomchoices;

import org.textgame.Player;

public interface Interactable {
    void setInteractAction(boolean interactAction);
    boolean isInteractAction();
    String alreadyInteract();
    String interactDesc(Player player);
    Player gainPotentialItem(Player player);

}
