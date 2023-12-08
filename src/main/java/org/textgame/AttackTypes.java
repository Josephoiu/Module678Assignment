package org.textgame;

public enum AttackTypes {
    FORCE("Force", 1),
    POISON("Poison", 2),
    BLUNT("Blunt", 4),
    SLASHING("Slashing", 6),
    THUNDER("Thunder", 8),
    LIGHTNING("Lightning", 10),
    FROST("Frost", 12),
    FIRE("Fire", 14),
    PSYCHIC("Psychic", 16),
    ACID("Acid", 18),
    RADIANT("Radiant", 20);

    private final String attackName;
    private final int damageAmount;

    AttackTypes(String attackName, int damageAmount){
        this.attackName = attackName;
        this.damageAmount = damageAmount;
    }

    public String getAttackName() {
        return attackName;
    }

    public int getDamageAmount() {
        return damageAmount;
    }
}
