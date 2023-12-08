package org.textgame.roomchoices;

import org.textgame.Room;

public abstract class InteractableRoom extends Room implements Interactable {
    boolean interactAction;
    public InteractableRoom(String name) {
        super(name);
    }

    @Override
    protected abstract String getDescription();

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
