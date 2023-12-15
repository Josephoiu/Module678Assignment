package org.textgame.items;

import org.textgame.Attack;
import org.textgame.AttackTypes;

public class FlameThrower extends Item implements Attackable{
    public FlameThrower(String name) {
        super(name);
    }

    @Override
    public Attack getAttack() {
        return new Attack("Flame Burst",20,"A burst of fire that will set your enemies aflame! This item is a prototype, meaning it might have a chance of exploding on you for " + AttackTypes.RADIANT.getDamageAmount(),AttackTypes.RADIANT);
    }

    @Override
    public String getItemDescription() {
        return "An old prototype of a flame thrower. Doesn't look the most stable...";
    }

    @Override
    public int getValue() {
        return 25;
    }
}
