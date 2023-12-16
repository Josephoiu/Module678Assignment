package org.textgame.roomchoices;

import org.textgame.Player;
import org.textgame.Room;

/**
 * LootableRoom extends Room and implements the methods of Lootable. It also overrides the Lootable methods
 * and fills in needed aspects.
 */
public abstract class LootableRoom extends Room implements Lootable{
    boolean lootAction;
    Player player;
    public LootableRoom(String name) {
        super(name);
    }
    protected abstract String getDescription();
    @Override
    public void setLootAction(boolean lootAction) {
        this.lootAction = lootAction;
    }

    @Override
    public boolean isLootAction() {
        return lootAction;
    }
    public abstract Player addItem(Player player);

    @Override
    public String alreadyLooted() {
        return "This room was already looted!";
    }
    public Player getPlayer(){
        return player;
    }
}
