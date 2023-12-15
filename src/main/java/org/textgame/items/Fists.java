package org.textgame.items;

import org.textgame.Attack;
import org.textgame.AttackTypes;

public class Fists extends Item implements Attackable{
    public Fists(String name) {
        super(name);
    }

    @Override
    public Attack getAttack() {
        return new Attack("Trusty Hands",2,"Nothing beats cuff to cuff, use your fists to slug em!", AttackTypes.FORCE);
    }

    @Override
    public String getItemDescription() {
        return "Hands, on your body.";
    }

    @Override
    public int getValue() {
        return 0;
    }
}
