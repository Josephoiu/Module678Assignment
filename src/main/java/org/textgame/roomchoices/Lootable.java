package org.textgame.roomchoices;

import org.textgame.Player;

/**
 * The Lootable interface encapsulates 5 methods for looting an area.
 */
public interface Lootable {
    /**
     * @param lootAction - Sets boolean field to the parameter.
     */
    void setLootAction(boolean lootAction);

    /**
     * @return - Gets boolean field.
     */
    boolean isLootAction();

    /**
     * @return - Text for when the room is already looted.
     */
    String alreadyLooted();

    /**
     * @param player - Player in case of modifications.
     * @return - String text for gained item.
     */
    String lootDesc(Player player);

    /**
     * @param player - Get players inventory to add item.
     * @return - Modified player.
     */
    Player addItem(Player player);

}
