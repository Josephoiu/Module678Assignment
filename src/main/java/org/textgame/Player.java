package org.textgame;

import org.textgame.items.Item;

import java.util.ArrayList;

/**
 * The player class is what the user will be controlling and is the main hub for inventory and availableAttacks.
 * Each player has health, a score, a list for inventory, and a list for available attacks.
 */
public class Player {
    private int health;
    private int score;
    private ArrayList<Item> inventory = new ArrayList<Item>();
    private ArrayList<Attack> availableAttacks = new ArrayList<>();

    /**
     * @param item - Grabs inputted item and adds to inventory.
     */
    public void addToInventory(Item item) {
        inventory.add(item);
    }

    /**
     * @param score - Grabs scoring and adds to the score.
     */
    public void addToScore(int score) {
        this.score += score;
    }

    /**
     * @return - String with each inventory item.
     */
    public String getInventory() {
        StringBuilder sb = new StringBuilder();
        sb.append("Current Inventory:\n");
        if (inventory.isEmpty()) {
            return "Your inventory is empty.";
        } else {
            for (Item item : inventory) {
                sb.append("\n").append(item.getName()).append("\n\t").append(item.getItemDescription());
            }
            return sb.toString();
        }
    }
    public ArrayList<Item> getListInventory(){
        return inventory;
    }

    /**
     * @return - Get string with available attacks.
     */
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

    /**
     * @param attack - Add attack to the availableAttacks list.
     */
    public void setAvailableAttacks(Attack attack){
        availableAttacks.add(attack);
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
