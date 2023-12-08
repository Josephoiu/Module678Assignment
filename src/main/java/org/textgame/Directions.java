package org.textgame;

public enum Directions {
    NORTH("North", 'n'),
    SOUTH("South", 's'),
    WEST("West", 'w'),
    EAST("East", 'e'),
    TOP("Top", 't'),
    BOTTOM("Bottom", 'b');
    String name;
    char singleChar;
    Directions(String name, char singleChar){
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
