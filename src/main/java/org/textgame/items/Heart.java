package org.textgame.items;

public class Heart extends Item{
    public Heart(String name) {
        super(name);
    }

    @Override
    public String getItemDescription() {
        return "A granite chiseling shaped as a heart. You sense some life in it.";
    }

    @Override
    public int getValue() {
        return 25;
    }
}
