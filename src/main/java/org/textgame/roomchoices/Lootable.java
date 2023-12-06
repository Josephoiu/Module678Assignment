package org.textgame.roomchoices;

import org.textgame.gainedloot.ItemGainStrategy;

abstract class Lootable implements ItemGainStrategy {
    private boolean lootAction = false;
    public void setLootAction(boolean checkAction){
        this.lootAction = checkAction;
    }
    public boolean isLootAction() {
        return lootAction;
    }
    abstract String alreadyLooted();
}
