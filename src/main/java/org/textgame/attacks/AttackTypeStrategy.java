package org.textgame.attacks;

import org.textgame.Attack;

/**
 * This interface provides one method that will add an attackTypeValue base on a given attack.
 * The calculation has the possibility of changing depending on the type. Utilizes STRATEGY PATTERN.
 */
public interface AttackTypeStrategy {
    int addAttackTypeValue(Attack attack);
}
