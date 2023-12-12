package org.textgame.attacks;

import org.textgame.AttackTypes;
import org.textgame.items.Item;

public class FireAttackType implements AttackTypeStrategy{

    @Override
    public int addAttackTypeValue(Item item) {
        return item.getValue() + AttackTypes.FIRE.getDamageAmount();
    }
}
