package org.textgame.attacks;

import org.textgame.AttackTypes;
import org.textgame.items.Item;

public class LightningAttackType implements AttackTypeStrategy{
    @Override
    public int addAttackTypeValue(Item item) {
        return item.getValue() + AttackTypes.LIGHTNING.getDamageAmount();
    }
}
