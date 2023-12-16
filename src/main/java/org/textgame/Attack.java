package org.textgame;

/**
 * Attack is the main class that will be storing information regarding an attacks such as the
 * name, damage, attack description, and its attack type.
 */
public class Attack {
    String name;
    int damage;
    String attackDesc;
    AttackTypes attackTypes;

    /**
     * @param name The name of the attack.
     * @param damage The int amount of damage in the attack.
     * @param attackDesc The description of the attack.
     * @param attackTypes Enumeration of attack type.
     */
    public Attack(String name, int damage, String attackDesc, AttackTypes attackTypes) {
        this.name = name;
        this.damage = damage;
        this.attackDesc = attackDesc;
        this.attackTypes = attackTypes;
    }
    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public String getAttackDesc() {
        return attackDesc;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public AttackTypes getAttackTypes() {
        return attackTypes;
    }
}
