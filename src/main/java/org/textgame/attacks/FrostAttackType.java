package org.textgame.attacks;

import org.textgame.AttackTypes;
import org.textgame.items.Item;

public class FrostAttackType implements AttackTypeStrategy{
    @Override
    public int addAttackTypeValue(Item item) {
        return item.getValue() + AttackTypes.FROST.getDamageAmount();
    }
}
