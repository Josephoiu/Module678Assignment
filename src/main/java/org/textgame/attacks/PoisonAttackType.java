package org.textgame.attacks;

import org.textgame.Attack;
import org.textgame.AttackTypes;

public class PoisonAttackType implements AttackTypeStrategy{
    @Override
    public int addAttackTypeValue(Attack attack) {
        return attack.getDamage() + AttackTypes.POISON.getDamageAmount();

    }
}
