package org.textgame;

public class Attack {
    String name;
    int damage;
    AttackTypes attackType;

    public Attack(String name, int damage, AttackTypes attackType) {
        this.name = name;
        this.damage = attackType.getDamageAmount();
        this.attackType = attackType;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public String getAttackTypeName() {
        return attackType.getAttackName();
    }
}
