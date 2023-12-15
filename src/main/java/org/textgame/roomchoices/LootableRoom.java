package org.textgame.roomchoices;

import org.textgame.Player;
import org.textgame.Room;

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
