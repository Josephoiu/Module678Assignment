package org.textgame.enemies;

import org.textgame.Attack;
import org.textgame.AttackTypes;
import org.textgame.Enemy;

public class ShadowHands extends Enemy {
    public ShadowHands(String name, int health) {
        super(name, health);
        setAvailableAttacks();
    }

    @Override
    public String getDescription() {
        return "These sentient lanky arms are made up of scrap and wire. Very deadly.";
    }

    @Override
    public void setAvailableAttacks() {
        Attack shadowClaw = new Attack("Shadow Claw",4,"Extending its long nails, it slashes at you.", AttackTypes.SLASHING);
        Attack wireTangle = new Attack("Wire Tangle", 2, "It whips large copper wires towards you.", AttackTypes.SLASHING);
        Attack piercingGlance = new Attack("Piercing Glance", 1, "Opening its palm, it glances into your soul.",AttackTypes.PSYCHIC);
        getAvailableAttacks().add(shadowClaw);
        getAvailableAttacks().add(wireTangle);
        getAvailableAttacks().add(piercingGlance);
    }
}
