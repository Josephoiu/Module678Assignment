package org.textgame;

import java.util.ArrayList;

public class Player {
    private int health;
    private int score;
    private ArrayList<String> inventory = new ArrayList<String>();
    private ArrayList<Attack> availableAttacks = new ArrayList<>();
    public void addToInventory(String item) {
        inventory.add(item);
    }
    public void addToScore(int score) {
        this.score += score;
    }
    public String getInventory() {
        StringBuilder sb = new StringBuilder();
        if (inventory.isEmpty()) {
            return "Your inventory is empty.";
        } else {
            for (String item : inventory) {
                sb.append(item).append("\n");
            }
            return sb.toString();
        }
    }
    public String getAttacks() {
        StringBuilder sb = new StringBuilder();
        if (availableAttacks.isEmpty()) {
            return "You have no attacks.";
        } else {
            for (Attack item : availableAttacks) {
                sb.append(item.name).append("\n");
            }
            return sb.toString();
        }
    }
    public void setAvailableAttacks(Attack attack){
        availableAttacks.add(attack);
    }
    public int returnIndex(String item){
        return item.indexOf(item);
    }
    public void intChangeSpecificItem(String item, String changedItem){
        int index = returnIndex(item);
        inventory.set(index, changedItem);
    }
    public int getScore() {
        return this.score;
    }
    public int getHealth(){
        return this.health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
}
