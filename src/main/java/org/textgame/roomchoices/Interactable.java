package org.textgame.roomchoices;

import org.textgame.Player;

/**
 * Interactable interface encapsulates five methods regarding interacting with a room.
 */
public interface Interactable {
    /**
     * @param interactAction - Set the interaction field.
     */
    void setInteractAction(boolean interactAction);

    /**
     * @return - Check existing interaction field.
     */
    boolean isInteractAction();

    /**
     * @return - String for when user attempts to interact with an already interacted room.
     */
    String alreadyInteract();

    /**
     * @param player - In case the interaction needs to modify an aspect from a player.
     * @return - String description of room.
     */
    String interactDesc(Player player);

    /**
     * @param player - To add the item to the players inventory.
     * @return - Newly modified player or just the base player given by parameter.
     */
    Player gainPotentialItem(Player player);

}
