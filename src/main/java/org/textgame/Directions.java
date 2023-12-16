package org.textgame;

/**
 * Enumeration that holds all Directions. This includes NORTH, SOUTH, WEST, EAST, TOP, and BOTTOM.
 * There is a name and a singleChar.
 */
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

    /**
     * @param character - Character value.
     * @return - String equivalent to Character, if none match then return null.
     */
    public String stringFromChar(Character character){
        for (Directions direction: EnumUtility.enumConstantstoList(Directions.class)) {
            if(direction.getSingleChar() == character){
                return direction.getName();
            }
        }
        return null;
    }
}
