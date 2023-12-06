package org.textgame;

import java.util.ArrayList;

public class Player {
    private int score;
    private ArrayList<String> inventory = new ArrayList<String>();
    public void addToInventory(String item) {
        inventory.add(item);
    }
    public void addToScore(int score) {
        this.score += score;
    }
    public String getInventory() {
        StringBuilder sb = new StringBuilder();
        if (inventory.isEmpty()) {
            return "Your inventory is empty";
        } else {
            for (String item : inventory) {
                sb.append(item).append("\n");
            }
            return sb.toString();
        }
    }
    public int returnIndex(String item){
        return item.indexOf(item);
    }
    public void intChangeSpecificItem(String item, String changedItem){
        int index = inventory.indexOf(item);
        inventory.set(index, changedItem);
    }
    public int getScore() {
        return this.score;
    }
}
