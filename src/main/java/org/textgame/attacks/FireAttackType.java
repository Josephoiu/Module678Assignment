package org.textgame.attacks;

import org.textgame.Attack;
import org.textgame.AttackTypes;
import org.textgame.items.Item;

import java.util.Random;

public class FireAttackType implements AttackTypeStrategy {
    Random random = new Random();

    @Override
    public int addAttackTypeValue(Attack attack) {
        return attack.getDamage() + AttackTypes.FIRE.getDamageAmount() + random.nextInt(10);
    }
}
