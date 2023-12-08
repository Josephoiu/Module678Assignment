package org.textgame.roomchoices;

public interface Interactable {
    void setInteractAction(boolean interactAction);
    boolean isInteractAction();
    String alreadyInteract();
    String interactDesc();
}
