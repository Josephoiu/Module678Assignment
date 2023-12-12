package org.textgame;

public enum GameMechanics {
    INTERACT("Interact",'i'),
    LOOT("Loot", 'l'),
    EXIT("Exit", 'x'),
    INVENTORY("Inventory",'v'),
    REPEATCOMMAND("Repeat Instructions", 'c');

    String name;
    char singleChar;
    GameMechanics(String name, char singleChar){
        this.name = name;
        this.singleChar = singleChar;
    }
    public String getName() {
        return name;
    }
    public char getSingleChar() {
        return singleChar;
    }
}
