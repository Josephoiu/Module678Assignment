package org.textgame;

public class Attack {
    String name;
    int damage;
    String attackDesc;
    public Attack(String name, int damage, String attackDesc) {
        this.name = name;
        this.damage = damage;
        this.attackDesc = attackDesc;
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
}
