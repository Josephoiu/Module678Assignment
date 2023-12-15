package org.textgame.items;

public class Clover extends Item{
    public Clover(String name) {
        super(name);
    }

    @Override
    public String getItemDescription() {
        return "A stone cog in the shape of a clover. Faintly smells of forest.";
    }

    @Override
    public int getValue() {
        return 25;
    }
}
