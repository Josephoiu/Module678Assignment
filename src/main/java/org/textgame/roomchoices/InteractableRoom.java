package org.textgame.roomchoices;

import org.textgame.Room;

/**
 * InteractableRoom simply extends off Room and implements Interactable. It creates fields for interactAction and overrides methods.
 */
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
