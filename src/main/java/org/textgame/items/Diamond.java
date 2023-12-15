package org.textgame.items;

public class Diamond extends Item{
    public Diamond(String name) {
        super(name);
    }

    @Override
    public String getItemDescription() {
        return "A wooden cog in the shape of a diamond. It's decorated in shimmering graffiti.";
    }

    @Override
    public int getValue() {
        return 25;
    }
}
