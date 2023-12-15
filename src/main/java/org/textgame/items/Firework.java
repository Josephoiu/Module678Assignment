package org.textgame.items;

import org.textgame.Attack;
import org.textgame.AttackTypes;

public class Firework extends Item implements Attackable{
    public Firework(String name) {
        super(name);
    }

    @Override
    public Attack getAttack() {
        return new Attack("Fourth of July",20,"Send devastating colored explosives towards your enemies. Chance of adding " + AttackTypes.FIRE.getAttackName() + " damage.",AttackTypes.FIRE);
    }

    @Override
    public String getItemDescription() {
        return "A colorful array of fireworks labeled \"use with caution\", what a neat suggestion!";
    }

    @Override
    public int getValue() {
        return 20;
    }
}
