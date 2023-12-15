package org.textgame.attacks;

import org.textgame.Attack;
import org.textgame.AttackTypes;
import org.textgame.items.Item;

public class FrostAttackType implements AttackTypeStrategy{
    @Override
    public int addAttackTypeValue(Attack attack) {
        return attack.getDamage() + AttackTypes.FROST.getDamageAmount();
    }
}
