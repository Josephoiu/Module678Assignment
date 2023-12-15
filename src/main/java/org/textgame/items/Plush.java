package org.textgame.items;

import org.textgame.Attack;
import org.textgame.AttackTypes;

public class Plush extends Item implements Attackable{
    public Plush(String name) {
        super(name);
    }

    @Override
    public Attack getAttack() {
        return new Attack("Psychological Trauma",5,"The terrifying glance of the bear gives a chance of " + AttackTypes.PSYCHIC.getAttackName() + " damage, plus years of therapy.",AttackTypes.PSYCHIC);
    }

    @Override
    public String getItemDescription() {
        return "This teddy bear plush stares at you with its lifeless, beady eyes. Maybe it'll be useful at a pawn shop?";
    }

    @Override
    public int getValue() {
        return 10;
    }
}
