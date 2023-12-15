package org.textgame;

public class Attack {
    String name;
    int damage;
    String attackDesc;
    AttackTypes attackTypes;
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
