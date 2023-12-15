package org.textgame;

import org.textgame.items.Item;

import java.util.Scanner;

public class SystemAttackSystem {
    private boolean isFinished = false;
    Scanner sc = new Scanner(System.in);
    String input;
    String encounterDescription;
    Player player;
    Enemy enemy;
    AttackSystem attackSystem = new AttackSystem();
    Item item;
    public void printInfo(String... items){
        for (String item: items) {
            System.out.println("\n" + item);
        }
    }
    public SystemAttackSystem(Player player, Enemy enemy, String encounterDescription, Item item) {
        this.enemy = enemy;
        this.player = player;
        this.encounterDescription = encounterDescription;
        this.item = item;
    }

    public void battleLoop() {
        printEncounterInfo();
        while (!isFinished) {
            printBaseInfo();
            if(player.getHealth() == 0){
                System.out.println("Death comes at unexpected times. You have lost.");
                System.exit(0);
            }
            else if (enemy.getHealth() == 0) {
                System.out.println("You have conquered the " + enemy.getName() + "!");
                System.out.println("You gain the " + item.getName());
                player.addToInventory(item);
            }
        }

    }

    private void printBaseInfo() {
        try {
            System.out.println("\nYour current health: " + player.getHealth());
            System.out.println(enemy.getName() + " health: " + enemy.getHealth() + "\n");
            System.out.println("Attack choices: ");
            printPlayerActionOptions();
            System.out.print("Pick your attack: ");
            input = userInput();
            int numInput = Integer.parseInt(checkUserInput(input));
            attackSystem.doDamage(attackSystem.getAttackFromIndex(numInput, player), enemy);
            printPlayerInfo(attackSystem.getAttackFromIndex(numInput, player));

            Attack enemyAttack = attackSystem.getRandomEnemyAttack(enemy);
            attackSystem.doDamage(enemyAttack, player);
            printEnemyInfo(enemyAttack);
            printLine();
        } catch (NumberFormatException e){
            System.out.println("That's not an available input!");
        }
    }
    private void printLine(){
        System.out.println("-*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*-");
    }

    private void printEnemyInfo(Attack enemyAttack){
        System.out.println("The " + enemy.getName() + " uses " + enemyAttack.getName());
        System.out.println(enemyAttack.attackDesc +" \n" + "It does " + attackSystem.getEnemyDamage() + " damage!");
    }
    private void printPlayerInfo(Attack playerAttack){
        System.out.println("You use your " + playerAttack.getName() + ", it does " + attackSystem.getPlayerDamage() + " damage!");
    }
    private void printEncounterInfo() {
        System.out.println(encounterDescription);
    }
    private void printPlayerActionOptions(){
        for(int i = 0; i < player.getAvailableAttacks().size(); i++){
            System.out.println((i+1) + ". " + player.getAvailableAttacks().get(i).name + "\n\t\t");
            System.out.println(player.getAvailableAttacks().get(i).attackDesc + "\n");
        }
    }
    private String userInput() {
        return input = sc.nextLine();
    }
    private String checkUserInput(String input){
        if(input.isBlank()){
            return "1";
        } else {
            return input;
        }
    }
}
