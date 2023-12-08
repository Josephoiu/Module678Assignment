package org.textgame.roomchoices;

public interface Lootable {
    void setLootAction(boolean lootAction);
    boolean isLootAction();
    String alreadyLooted();
    String lootDesc();
}
