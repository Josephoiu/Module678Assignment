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
    public String stringFromChar(Character character){
        for (Directions direction: EnumUtility.enumConstantstoList(Directions.class)) {
            if(direction.getSingleChar() == character){
                return direction.getName();
            }
        }
        return null;
    }
}
