package org.textgame.roomchoices;

import org.textgame.Player;
import org.textgame.Room;

public abstract class InteractableLootableRoom extends Room implements Interactable, Lootable {
    boolean interactAction;
    boolean lootAction;
    public InteractableLootableRoom(String name) {
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
    @Override
    public void setInteractAction(boolean interactAction) {
        this.interactAction = interactAction;
    }

    @Override
    public boolean isInteractAction() {
        return interactAction;
    }

    @Override
    public String alreadyInteract() {
        return "This room was already interacted with.";
    }
}
