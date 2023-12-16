package org.textgame;

import java.util.ArrayList;

/**
 * An abstract class used to create enemies, which have a name, health, and a list of availableAttacks.
 */
public abstract class Enemy {
    private String name;
    private int health;
    private ArrayList<Attack> availableAttacks = new ArrayList<>();

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }
    public abstract String getDescription();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<Attack> getAvailableAttacks() {
        return availableAttacks;
    }

    public abstract void setAvailableAttacks();
}
