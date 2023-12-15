package org.textgame.items;

import org.textgame.Attack;
import org.textgame.AttackTypes;

public class Pipe extends Item implements Attackable{
    public Pipe(String name) {
        super(name);
    }

    @Override
    public Attack getAttack() {
        return new Attack("Pipe Smack",5,"This bent pipe could use some more bending! Bash your enemies with the chance of adding extra " + AttackTypes.BLUNT.getAttackName() + " damage.",AttackTypes.BLUNT);
    }

    @Override
    public String getItemDescription() {
        return "A metal pipe bent from extensive heat. Stickers decorate its slick surface.";
    }

    @Override
    public int getValue() {
        return 10;
    }
}
