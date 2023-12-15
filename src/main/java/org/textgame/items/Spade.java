package org.textgame.items;

public class Spade extends Item{
    public Spade(String name) {
        super(name);
    }

    @Override
    public String getItemDescription() {
        return "A clay formation in the shape of a spade. Bit rustic.";
    }

    @Override
    public int getValue() {
        return 25;
    }
}
