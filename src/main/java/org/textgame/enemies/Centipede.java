package org.textgame.enemies;

import org.textgame.Attack;
import org.textgame.AttackTypes;
import org.textgame.Enemy;

public class Centipede extends Enemy {
    public Centipede(String name, int health) {
        super(name, health);
        setAvailableAttacks();
    }

    @Override
    public String getDescription() {
        return "An overly large centipede, seems to have lost a couple legs.";
    }

    @Override
    public void setAvailableAttacks() {
        Attack bite = new Attack("Bite",2,"Fangs quickly lash at you like a pocket knife.", AttackTypes.SLASHING);
        Attack acidSpray = new Attack("Acid Spray", 4, "It spews a thick stream of acid at you.", AttackTypes.ACID);
        getAvailableAttacks().add(bite);
        getAvailableAttacks().add(acidSpray);
    }
}
