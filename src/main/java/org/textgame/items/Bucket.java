package org.textgame.items;

import org.textgame.Attack;
import org.textgame.AttackTypes;

public class Bucket extends Item implements Attackable{
    public Bucket(String name) {
        super(name);
    }

    @Override
    public Attack getAttack() {
        return new Attack("Sludge Toss", 10,"Throw the unknown contents onto your enemies! Chance of " + AttackTypes.ACID.getAttackName() + " damage.", AttackTypes.ACID);
    }

    @Override
    public String getItemDescription() {
        return "A steel bucket filled with thick slop. It smells awful. Perhaps it's hazardous?";
    }

    @Override
    public int getValue() {
        return 10;
    }
}
