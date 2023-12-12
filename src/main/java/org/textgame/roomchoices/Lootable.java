package org.textgame.roomchoices;

import org.textgame.Player;

public interface Lootable {
    void setLootAction(boolean lootAction);
    boolean isLootAction();
    String alreadyLooted();
    String lootDesc(Player player);
}
