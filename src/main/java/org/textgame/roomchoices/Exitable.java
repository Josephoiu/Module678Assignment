package org.textgame.roomchoices;

import org.textgame.Player;

/**
 * Exitable interface encapsulates two methods related to an instance of being exitable.
 */
public interface Exitable {
    /**
     * @return - Text when succesfully exited.
     */
    String exitText();

    /**
     * @param player - In case player information is altered when maze is finished.
     * @return - True or false given conditions based on how the method is used.
     */
    Boolean finishMaze(Player player);
}
