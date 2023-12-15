package org.textgame;

import org.textgame.attacks.*;

import java.util.Random;

public class AttackSystem {
    int enemyDamage;
    int playerDamage;

    public Attack getAttack(int index, Player player){
        if(index <= 0 || index > player.getAvailableAttacks().size()){
            return player.getAvailableAttacks().get(0);
        }
        return player.getAvailableAttacks().get(index-1);
    }
    public Attack getAttack(int index, Enemy enemy){
        if(index <= 0 || index > enemy.getAvailableAttacks().size()){
            return enemy.getAvailableAttacks().get(0);
        }
        return enemy.getAvailableAttacks().get(index-1);
    }
    public int calculateDamage(Attack attack){
        return randomChanceExtraDamage(attack);
    }
    private int randomChanceExtraDamage(Attack attack){
        double rand = Math.random();
        if(rand <= 0.5){
            return addExtraDamage(attack);
        }
        return attack.getDamage();
    }
    private int addExtraDamage(Attack attack){
        FireAttackType fireAttackType = new FireAttackType();
        FrostAttackType frostAttackType = new FrostAttackType();
        LightningAttackType lightningAttackType = new LightningAttackType();
        AcidAttackType acidAttackType = new AcidAttackType();
        BluntAttackType bluntAttackType = new BluntAttackType();
        PoisonAttackType poisonAttackType = new PoisonAttackType();
        PsychicAttackType psychicAttackType = new PsychicAttackType();
        RadiantAttackType radiantAttackType = new RadiantAttackType();
        SlashingAttackType slashingAttackType = new SlashingAttackType();
        ForceAttackType forceAttackType = new ForceAttackType();
        ThunderAttackType thunderAttackType = new ThunderAttackType();
        int damage;
        switch (attack.getAttackTypes()){
            case FIRE:
                damage = fireAttackType.addAttackTypeValue(attack);
                break;
            case FROST:
                damage = frostAttackType.addAttackTypeValue(attack);
                break;
            case LIGHTNING:
                damage = lightningAttackType.addAttackTypeValue(attack);
                break;
            case ACID:
                damage = acidAttackType.addAttackTypeValue(attack);
                break;
            case POISON:
                damage = poisonAttackType.addAttackTypeValue(attack);
                break;
            case PSYCHIC:
                damage = psychicAttackType.addAttackTypeValue(attack);
                break;
            case RADIANT:
                damage = radiantAttackType.addAttackTypeValue(attack);
                break;
            case SLASHING:
                damage = slashingAttackType.addAttackTypeValue(attack);
                break;
            case THUNDER:
                damage = thunderAttackType.addAttackTypeValue(attack);
                break;
            case FORCE:
                damage = forceAttackType.addAttackTypeValue(attack);
                break;
            default:
                damage = bluntAttackType.addAttackTypeValue(attack);
                break;
        }
        return damage;
    }
    public Player setHealth(Player player, int enemyDamage){
        player.setHealth(player.getHealth() - enemyDamage);
        return player;
    }
    public Enemy setHealth(Enemy enemy, int playerDamage){
        enemy.setHealth(enemy.getHealth() - playerDamage);
        return enemy;
    }
    public Attack getRandomEnemyAttack(Enemy enemy){
        Random random = new Random();
        int size = enemy.getAvailableAttacks().size();
        return enemy.getAvailableAttacks().get(random.nextInt(size));
    }
    public Attack getAttackFromIndex(int userInput, Player player){
        return getAttack(userInput, player);
    }
    public Player doDamage(Attack attack, Player player){
        int damage = calculateDamage(attack);
        setEnemyDamage(damage);
        return setHealth(player,damage);
    }
    public Enemy doDamage(Attack attack, Enemy enemy){
        int damage = calculateDamage(attack);
        setPlayerDamage(damage);
        return setHealth(enemy,damage);
    }

    public int getEnemyDamage() {
        return enemyDamage;
    }

    public int getPlayerDamage() {
        return playerDamage;
    }

    private void setEnemyDamage(int enemyDamage) {
        this.enemyDamage = enemyDamage;
    }

    private void setPlayerDamage(int playerDamage) {
        this.playerDamage = playerDamage;
    }
}
