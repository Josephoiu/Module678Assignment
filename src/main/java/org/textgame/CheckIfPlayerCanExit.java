package org.textgame;

import org.textgame.Player;
import org.textgame.items.*;

public class CheckIfPlayerCanExit {
    int checker = 0;

    public boolean checkIfCanExit(Player player){
        for (Item item:player.getListInventory()) {
            if(item instanceof Clover || item instanceof Diamond || item instanceof Heart || item instanceof Spade){
                checker++;
            }
        }
        return checker == 4;
    }
}
