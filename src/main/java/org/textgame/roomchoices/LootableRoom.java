package org.textgame.roomchoices;

import org.textgame.Room;

public abstract class LootableRoom extends Room implements Lootable{
    boolean lootAction;
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

    @Override
    public String alreadyLooted() {
        return "This room was already looted!";
    }
}
