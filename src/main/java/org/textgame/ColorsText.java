package org.textgame;

/**
 * Used to make text pop more. Each color has a name and escape sequence that changes the color.
 */
public enum ColorsText {
    RED("Red", "\u001B[31m"), //Threat Color
    BLUE("Blue","\u001B[34m"), //Things to Note Color
    YELLOW("Yellow", "\u001B[33m"), //Loot Color
    PURPLE("Purple","\033[0;35m"), //Odd Factoid
    RESET("DefaultValue", "\u001B[0m");

    private final String colorName;
    private final String colorType;

    ColorsText(String colorName, String colorType){
        this.colorName = colorName;
        this.colorType = colorType;
    }

    /**
     * @param string - String that's color is going to be changed.
     * @param color - Color that will change the strings color.
     * @return - Colored text.
     */
    public String colorString(String string, ColorsText color){
        return color.getColorType() + string + ColorsText.RESET.getColorType();
    }
    public String getColorName() {
        return colorName;
    }

    public String getColorType() {
        return colorType;
    }
}
