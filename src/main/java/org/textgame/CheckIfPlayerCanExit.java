package org.textgame;

import org.textgame.Player;
import org.textgame.items.*;

/**
 * Specific class to calculate if the player has all the items required to go through the main exit.
 */
public class CheckIfPlayerCanExit {
    /**
     * Checker goes up after an instance is found.
     */
    int checker = 0;

    /**
     * @param player - Used to get players inventory.
     * @return - true or false if the checker has been met to 4.
     */
    public boolean checkIfCanExit(Player player){
        for (Item item:player.getListInventory()) {
            if(item instanceof Clover || item instanceof Diamond || item instanceof Heart || item instanceof Spade){
                checker++;
            }
        }
        return checker == 4;
    }
}
