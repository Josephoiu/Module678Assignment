package org.textgame.items;

import org.textgame.Attack;
import org.textgame.AttackTypes;

public class Radio extends Item implements Attackable{
    public Radio(String name) {
        super(name);
    }

    @Override
    public Attack getAttack() {
        return new Attack("Radio Smack",1,"Swing the radio around and hope for the best. Chance of adding" + AttackTypes.LIGHTNING.getAttackName() + " damage, maybe this old thing still works!.");
    }

    @Override
    public String getItemDescription() {
        return "An old, dysfunctional radio attached to worn wire. Not worth much, probably could be scrapped.";
    }

    @Override
    public int getValue() {
        return 5;
    }
}
