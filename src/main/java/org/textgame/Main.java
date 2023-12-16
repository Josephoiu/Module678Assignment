package org.textgame;

import org.textgame.items.Fists;

import java.util.Scanner;

/**
 * Starting point of the program, instantiates all the major objects to run game.
 */
public class Main {
    /**
     *<p>
     * Creates a new player (there is only one) alongside setting their health.
     * Creates a new MazeNavigatorService and SystemVersion for the System Out
     * and System Input specifically.
     *</p>
     *<p>
     *     While the maze isn't finished, create the maze, print base info, and cycle through the input loop.
     *     When finished, print the players score.
     *</p>
     *
     */
    public static void main(String[] args) {
        Player player = new Player();
        player.setHealth(100);
        Fists fists = new Fists("Hands");
        player.addToInventory(fists);
        player.setAvailableAttacks(fists.getAttack());

        MazeNavigatorService maze = new MazeNavigatorService();
        SystemVersion systemVersion = new SystemVersion(maze,player);

        systemVersion.printInstructions();
        while (!maze.isFinished()) { //Main loop
            maze.getInstance(player);
            systemVersion.printInfo(maze.getCurrentRoomName(),maze.getCurrentRoomDescription(),maze.currentRoomExits());

            systemVersion.userInput();
            systemVersion.printLine();
            systemVersion.userOptions();
        }
        systemVersion.printPlayerScore();
    }
}