package org.textgame.roomchoices;

import org.textgame.Player;

public interface Exitable {
    String exitText();
    Boolean finishMaze(Player player);
}
