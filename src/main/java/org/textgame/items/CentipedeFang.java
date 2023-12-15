package org.textgame.items;

import org.textgame.Attack;
import org.textgame.AttackTypes;

public class CentipedeFang extends Item implements Attackable {
    public CentipedeFang(String name) {
        super(name);
    }

    @Override
    public String getItemDescription() {
        return "A fang you crudely took out of a centipedes mouth. It smells.";
    }

    @Override
    public int getValue() {
        return 2;
    }

    @Override
    public Attack getAttack() {
        return new Attack("Brutal Piercing",5,"Jam a fang into their arm, chance of " + AttackTypes.POISON.getAttackName() + " damage.",AttackTypes.POISON);
    }
}
