package org.textgame.roomchoices;

abstract class Interactable {
    private boolean interactAction = false;
    public void setInteractAction(boolean interactAction) {
        this.interactAction = interactAction;
    }
    public boolean isInteractAction() {
        return interactAction;
    }
    abstract String alreadyInteract();
}
