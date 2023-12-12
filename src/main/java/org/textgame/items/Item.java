package org.textgame.items;

public abstract class Item {
    private String name;
    public Item(String name) {
        this.name = name;
    }
    public abstract String getItemDescription();
    public abstract int getValue();
    public String getName() {
        return name;
    }
}
