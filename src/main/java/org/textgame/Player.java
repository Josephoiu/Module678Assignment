package org.textgame;

import org.textgame.items.Item;

import java.util.ArrayList;

public class Player {
    private int health;
    private int score;
    private ArrayList<Item> inventory = new ArrayList<Item>();
    private ArrayList<Attack> availableAttacks = new ArrayList<>();

    public void addToInventory(Item item) {
        inventory.add(item);
    }
    public void addToScore(int score) {
        this.score += score;
    }
    public String getInventory() {
        StringBuilder sb = new StringBuilder();
        sb.append("Current Inventory:\n");
        if (inventory.isEmpty()) {
            return "Your inventory is empty.";
        } else {
            for (Item item : inventory) {
                sb.append(item.getName()).append("\n\t").append(item.getItemDescription());
            }
            return sb.toString();
        }
    }
    public ArrayList<Item> getListInventory(){
        return inventory;
    }
    public String getAttacks() {
        StringBuilder sb = new StringBuilder();
        if (availableAttacks.isEmpty()) {
            return "You have no attacks.";
        } else {
            for (Attack item : availableAttacks) {
                sb.append(item.name).append(" - ").append(item.getDamage()).append(" Damage").append("\n\t").append(item.getAttackDesc());
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
    public void intChangeSpecificItem(Item item, Item changedItem){
        int index = returnIndex(item.getName());
        inventory.set(index, changedItem);
    }
    public ArrayList<Attack> getAvailableAttacks() {
        return availableAttacks;
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
